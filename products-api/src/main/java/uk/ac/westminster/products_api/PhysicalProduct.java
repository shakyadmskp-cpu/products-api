package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a type of product.
// A ShoppingCart is not a Product because it contains products.
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // No-argument constructor
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(int id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getter for weightKg
    public double getWeightKg() {
        return weightKg;
    }

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
}

