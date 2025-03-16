package org.example.clothesondemandshopelham.ProductBuilder;

public class TShirt extends Product {
    private String sleeves;
    private String neck;

    public TShirt() {
    }

    public TShirt(String sleeves, String neck) {
        this.sleeves = sleeves;
        this.neck = neck;
    }

    public TShirt(String id, String productName, String size, String material, String color, double price, String sleeves, String neck) {
        super("2", productName, size, material, color, 399);
        this.sleeves = sleeves;
        this.neck = neck;
    }

    public String getSleeves() {
        return sleeves;
    }

    public String getNeck() {
        return neck;
    }

    @Override
    public String  decorate() {
        String details="T-Shirt decorated: Sleeves=" + sleeves + ", Neck=" + neck+ "\n";
        return details;
    }

    @Override
    public String toString() {
        return "id:2"  +
                ", productName: " + super.getProductName() +
                ", size: " + super.getSize() +
                ", material: " + super.getMaterial() +
                ", color: " + super.getColor() +
                ", price: 399.0"  +
                ", detail1: " + sleeves +
                ", detail2: " + neck ;
    }
}
