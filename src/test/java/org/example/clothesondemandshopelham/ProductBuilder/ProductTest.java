package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;
    private String detail1;
    private String detail2;

    @BeforeEach
    void setup(){
        product = new Product("1","Pants","Small","Cotton","Blue",599.0);
        product.setDetail1("Slim");
        product.setDetail2("Long");
        }

    @Test
    void shouldCreateProductWithDefaultValues() {
        Product result = new Product(product.getId(),product.getProductName(),product.getSize(),product.getMaterial(),product.getColor(),product.getPrice());
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: null, detail2: null" ,result.toString());
    }

    @Test
    void whenProductConstructorIsInvokedReturnObject() {
        Product result = new Product(product.getId(),product.getProductName(),product.getSize(),product.getMaterial(),product.getColor(),product.getPrice());
        result.setDetail1(product.getDetail1());
        result.setDetail2(product.getDetail2());
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: Slim, detail2: Long" ,result.toString());
    }

    @Test
    void whenProductIsInvokedReturnObject() {
        Product result = new Product();
        assertEquals("id:null, productName: null, size: null, material: null, color: null, price: "+ 0.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void whenGetIdIsInvokedReturnString() {
        String result = product.getId();
        String expected = "1";
        assertEquals(expected,result);
    }

    @Test
    void setIdNoFunctionality() {
        product.setId("1");
    }

    @Test
    void whenGetProductNameIsInvokedReturnString() {
        String result = product.getProductName();
        String expected = "Pants";
        assertEquals(expected,result);
    }

    @Test
    void setProductNameNoFunctionality() {
        product.setProductName("Pants");
    }

    @Test
    void whenGetSizeIsInvokedReturnString() {
        String result = product.getSize();
        String expected = "Small";
        assertEquals(expected,result);
    }

    @Test
    void setSizeNoFunctionality() {
        product.setSize("Small");
    }

    @Test
    void whenGetMaterialIsInvokedReturnString() {
        String result = product.getMaterial();
        String expected = "Cotton";
        assertEquals(expected,result);
    }

    @Test
    void setMaterialNoFunctionality() {
        product.setMaterial("Cotton");
    }

    @Test
    void whenGetColorIsInvokedReturnString() {
        String result = product.getColor();
        String expected = "Blue";
        assertEquals(expected,result);
    }

    @Test
    void setColorNoFunctionality() {
        product.setColor("Blue");
    }

    @Test
    void whenGetPriceIsInvokedReturnString() {
        double result = product.getPrice();
        double expected = 599.0;
        assertEquals(expected,result);
    }

    @Test
    void setPriceNoFunctionality() {
        product.setPrice(599.0);
    }

    @Test
    void whenGetDetail1IsInvokedReturnString() {
        String result = product.getDetail1();
        String expected = "Slim";
        assertEquals(expected,result);
    }

    @Test
    void setDetail1NoFunctionality() {
        product.setDetail1("Slim");
    }

    @Test
    void whenGetDetail2IsInvokedReturnString() {
        String result = product.getDetail2();
        String expected = "Long";
        assertEquals(expected,result);
    }

    @Test
    void setDetail2NoFunctionality() {
        product.setDetail2("Long");
    }

    @Test
    void whenToStringIsInvokedReturnString() {
        String result = product.toString();
        String expected = "id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: Slim, detail2: Long";
        assertEquals(expected,result);
    }

}