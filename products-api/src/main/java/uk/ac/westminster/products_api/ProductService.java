
package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add(new DigitalProduct(
                nextId.intValue(),
                "Clean Code (E-book)",
                29.99,
                "/downloads/clean-code.pdf",
                4.2
        ));
        nextId++;

        products.add(new PhysicalProduct(
                nextId.intValue(),
                "27-inch Monitor",
                249.99,
                5.4,
                "61cm x 41cm x 18cm"
        ));
        nextId++;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId.intValue());
        nextId++;
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId() == id.intValue())
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(
                product -> product.getId() == id.intValue()
        );
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(product -> product.getName()
                        .toLowerCase()
                        .contains(name.toLowerCase()))
                .toList();
    }
}
