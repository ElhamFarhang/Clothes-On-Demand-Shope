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
        builder = new ProductBuilder(mockedProduct);
        when(mockedProduct.getId()).thenReturn("1");
        when(mockedProduct.getProductName()).thenReturn("Pants");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Blue");
        when(mockedProduct.getPrice()).thenReturn(599.0);
         }

    @Test
    void whenProductBuilderIsInvokedReturnObject() {
        Product result = builder.build();;
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: null, detail2: null",result.toString());
    }


    @Test
    void whenProductBuilderConstructorIsInvokedReturnObject() {
        Product result = new Product(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),mockedProduct.getPrice());
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: null, detail2: null" ,result.toString());
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
        Product result = builder.build();
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void whenBuildPantsIsInvokedReturnObject() {
        when(mockedProduct.getId()).thenReturn("1");
        when(mockedProduct.getProductName()).thenReturn("Pants");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Long");
        Pants result = builder.buildPants("Slim","Long");
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Black, price: "+ 599.0 +", detail1: Slim, detail2: Long",result.toString());
    }

    @Test
    void whenBuildTShirtIsInvokedReturnObject() {
        when(mockedProduct.getId()).thenReturn("2");
        when(mockedProduct.getProductName()).thenReturn("TShirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("ShortSleeve");
        when(mockedProduct.getDetail2()).thenReturn("VNeck");
        TShirt result = builder.buildTShirt("ShortSleeve","VNeck");
        assertEquals("id:2, productName: TShirt, size: Small, material: Cotton, color: Black, price: "+ 399.0 +", detail1: ShortSleeve, detail2: VNeck",result.toString());
    }

    @Test
    void whenBuildSkirtIsInvokedReturnObject() {
        when(mockedProduct.getId()).thenReturn("3");
        when(mockedProduct.getProductName()).thenReturn("Skirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Plain");
        Skirt result = builder.buildSkirt("Slim","Plain");
        assertEquals("id:3, productName: Skirt, size: Small, material: Cotton, color: Black, price: "+ 499.0 +", detail1: Slim, detail2: Plain",result.toString());
    }

}