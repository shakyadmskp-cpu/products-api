package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {

    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    // Non-argument constructor
    public DigitalProduct() {
    }

    // Full constructor
    public DigitalProduct(int id, String name, double price,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // Getter for downloadUrl
    public String getDownloadUrl() {
        return downloadUrl;
    }

    // Getter for fileSizeMB
    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName() + " | Download: " + downloadUrl;
    }
    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}

