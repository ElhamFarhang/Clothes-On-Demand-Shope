package org.example.clothesondemandshopelham.ProductBuilder;

public class Pants extends Product {
    private String fit;
    private String length;

    public Pants() {
    }

    public Pants(String id, String productName, String size, String material, String color, double price, String fit, String length) {
        super("1", productName, size, material, color, 599);
        this.fit = fit;
        this.length = length;
    }

    public Pants(String fit, String length) {
        this.fit = fit;
        this.length = length;
    }

    public String getFit() {
        return fit;
    }
    public String getLength() {
        return length;
    }

    @Override
    public String decorate() {
        String details="Pants decorated: Fit=" + fit + ", Length=" + length + "\n";
        return details;
    }

    @Override
    public String toString() {
        return "id:1"  +
               ", productName: " + super.getProductName() +
               ", size: " + super.getSize() +
               ", material: " + super.getMaterial() +
               ", color: " + super.getColor() +
               ", price: 599.0"  +
               ", detail1: " + fit +
               ", detail2: " + length ;
    }
}
