package org.example.clothesondemandshopelham.ProductBuilder;

public class Product {
    private  String id;
    private String productName;
    private String  size;
    private String material;
    private String color;
    private double price;
    private String detail1;
    private String detail2;

    public Product(String id, String productName, String size, String material, String color, double price) {
        this.id = id;
        this.productName = productName;
        this.size = size;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail1() {
        return detail1;
    }

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public String getDetail2() {
        return detail2;
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                ", productName: " + productName +
                ", size: " + size +
                ", material: " + material +
                ", color: " + color +
                ", price: " + price +
                ", detail1: " + detail1 +
                ", detail2: " + detail2 ;
    }
}
