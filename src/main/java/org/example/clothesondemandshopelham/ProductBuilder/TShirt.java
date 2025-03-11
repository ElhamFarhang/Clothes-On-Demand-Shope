package org.example.clothesondemandshopelham.ProductBuilder;

public class TShirt extends Product {
    private String sleeves;
    private String neck;

    public TShirt() {
       }

    public TShirt(String id, String productName, String size, String material, String color, double price, String sleeves, String neck) {
        super("2", productName, size, material, color, 399);
        this.sleeves = sleeves;
        this.neck = neck;
    }

    public String getSleeves() {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    @Override
    public String  decorate() {
        String details="T-Shirt decorated: Sleeves=" + sleeves + ", Neck=" + neck+ "\n";
        return details;
    }
}
