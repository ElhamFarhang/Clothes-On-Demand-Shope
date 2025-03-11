package org.example.clothesondemandshopelham.ProductBuilder;

public class Skirt extends Product {

    private String waistline;
    private String pattern;

    public Skirt() {
    }

    public Skirt(String id, String productName, String size, String material, String color, double price, String waistline, String pattern) {
        super("3", productName, size, material, color, 499);
        this.waistline = waistline;
        this.pattern = pattern;
    }

    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String decorate() {
        String details="Skirt decorated: Waistline=" + waistline + ", Pattern=" + pattern+ "\n";
        return details;
    }
}
