package org.example.clothesondemandshopelham.ProductBuilder;

public class Skirt extends Product {

    private String waistline;
    private String pattern;

    public Skirt() {
    }

    public Skirt(String id, String productName, String size, String material, String color, double price) {
        super("3", productName, size, material, color, 499);
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getWaistline() {
        return waistline;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "id:3"  +
                ", productName: " + super.getProductName() +
                ", size: " + super.getSize() +
                ", material: " + super.getMaterial() +
                ", color: " + super.getColor() +
                ", price: 499.0"  +
                ", detail1: " + waistline +
                ", detail2: " + pattern ;
    }
}
