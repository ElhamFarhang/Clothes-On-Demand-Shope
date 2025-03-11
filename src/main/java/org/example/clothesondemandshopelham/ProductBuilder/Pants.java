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

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String decorate() {
        String details="Pants decorated: Fit=" + fit + ", Length=" + length + "\n";
        return details;
    }
}
