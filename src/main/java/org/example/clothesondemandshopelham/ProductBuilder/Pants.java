package org.example.clothesondemandshopelham.ProductBuilder;

public class Pants extends Product {
    private String fit;
    private String length;

    public Pants() {
    }

    public Pants(String id, String productName, String size, String material, String color, double price) {
        super("1", productName, size, material, color, 599);
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getFit() {
        return fit;
    }

    public String getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "id:1"  +
               ", productName: " + super.getProductName() +
               ", size: " + super.getSize() +
               ", material: " + super.getMaterial() +
               ", color: " + super.getColor() +
               ", price: 599.0"+
               ", detail1: " + fit +
               ", detail2: " + length ;
    }
}
