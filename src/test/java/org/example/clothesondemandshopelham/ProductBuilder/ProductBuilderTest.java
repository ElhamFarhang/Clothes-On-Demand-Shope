package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductBuilderTest {
    ProductBuilder builder;
    Product mockedProduct = mock(Product.class);

    @BeforeEach
    void setup(){
        builder = new ProductBuilder();
        when(mockedProduct.getId()).thenReturn("1");
        when(mockedProduct.getProductName()).thenReturn("Pants");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Blue");
        when(mockedProduct.getPrice()).thenReturn(599.0);
         }

    @Test
    void whenProductBuilderConstructorIsInvokedReturnObject() {
        Product result = new Product();
        assertEquals("id:null, productName: null, size: null, material: null, color: null, price: "+ 0.0 +", detail1: null, detail2: null" ,result.toString());
    }

    @Test
    void whenProductBuilderIsInvokedReturnObject() {
        builder = new ProductBuilder(mockedProduct);
        Product result = builder.build();
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void setIdNoFunctionality(){
        builder.setId(mockedProduct.getId());
    }

    @Test
    void setProductNameNoFunctionality(){
        builder.setProductName(mockedProduct.getProductName());
    }

    @Test
    void setSizeNoFunctionality(){
        builder.setSize(mockedProduct.getSize());
    }

    @Test
    void setMaterialNoFunctionality(){
        builder.setMaterial(mockedProduct.getMaterial());
    }

    @Test
    void setColorNoFunctionality(){
        builder.setColor(mockedProduct.getColor());
    }

    @Test
    void setPriceNoFunctionality(){
        builder.setPrice(mockedProduct.getPrice());
    }

    @Test
    void whenBuildIsInvokedReturnObject() {
        builder = new ProductBuilder(mockedProduct);
        Product result = builder.build();
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void whenBuildPantsIsInvokedReturnObject() {
        builder = new ProductBuilder(mockedProduct);
        when(mockedProduct.getId()).thenReturn("1");
        when(mockedProduct.getProductName()).thenReturn("Pants");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Long");
        Pants result = builder.buildPants();
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Black, price: "+ 599.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void whenBuildTShirtIsInvokedReturnObject() {
        builder = new ProductBuilder(mockedProduct);
        when(mockedProduct.getId()).thenReturn("2");
        when(mockedProduct.getProductName()).thenReturn("TShirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("ShortSleeve");
        when(mockedProduct.getDetail2()).thenReturn("VNeck");
        TShirt result = builder.buildTShirt();
        assertEquals("id:2, productName: TShirt, size: Small, material: Cotton, color: Black, price: "+ 399.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void whenBuildSkirtIsInvokedReturnObject() {
        builder = new ProductBuilder(mockedProduct);
        when(mockedProduct.getId()).thenReturn("3");
        when(mockedProduct.getProductName()).thenReturn("Skirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Plain");
        Skirt result = builder.buildSkirt();
        assertEquals("id:3, productName: Skirt, size: Small, material: Cotton, color: Black, price: "+ 499.0 +", detail1: null, detail2: null",result.toString());
    }

}