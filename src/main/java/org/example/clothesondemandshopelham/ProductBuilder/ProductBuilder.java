package org.example.clothesondemandshopelham.ProductBuilder;

public class ProductBuilder {

    Product product = new Product();

    public ProductBuilder setId(String id){
        product.setId(id);
        return this;
    }
    public ProductBuilder setProductName(String productName){
        product.setProductName(productName);
        return this;
    }
    public ProductBuilder setSize(String size){
        product.setSize(size);
        return this;
    }
    public ProductBuilder setMaterial(String material){
        product.setMaterial(material);
        return this;
    }
    public ProductBuilder setColor(String color){
        product.setColor(color);
        return this;
    }

    public ProductBuilder setPrice(double price){
        product.setPrice(price);
        return this;
    }

    public Product build(){
        return product;
    }

    public Pants buildPants(String fit,String length){
        return new Pants(product.getId(),product.getProductName(),product.getSize(),product.getMaterial(),product.getColor(),product.getPrice(),fit,length);
    }

    public Skirt buildSkirt(String waistline, String pattern){
        return new Skirt(product.getId(),product.getProductName(),product.getSize(),product.getMaterial(),product.getColor(),product.getPrice(),waistline,pattern);
    }

    public TShirt buildTShirt(String sleeves, String neck){
        return new TShirt(product.getId(),product.getProductName(),product.getSize(),product.getMaterial(),product.getColor(),product.getPrice(),sleeves,neck);
    }
}
