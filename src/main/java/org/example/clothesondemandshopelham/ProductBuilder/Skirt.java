package org.example.clothesondemandshopelham.ProductBuilder;

public class Skirt extends Product {

    private String waistline;
    private String pattern;

    public Skirt() {
    }

    public Skirt(String waistline, String pattern) {
        this.waistline = waistline;
        this.pattern = pattern;
    }

    public Skirt(String id, String productName, String size, String material, String color, double price, String waistline, String pattern) {
        super("3", productName, size, material, color, 499);
        this.waistline = waistline;
        this.pattern = pattern;
    }

    public String getWaistline() {
        return waistline;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String decorate() {
        String details="Skirt decorated: Waistline=" + waistline + ", Pattern=" + pattern+ "\n";
        return details;
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
