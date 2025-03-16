package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SkirtTest {
    Skirt skirt;
    Product mockedProduct = mock(Product.class);
    private String waistline;
    private String pattern;

    @BeforeEach
    void setup(){
        when(mockedProduct.getId()).thenReturn("3");
        when(mockedProduct.getProductName()).thenReturn("Skirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Plain");
        skirt = new Skirt("Slim","Plain");
    }

    @Test
    void whenSkirtIsInvokedReturnObject() {
        Skirt result = new Skirt();
        assertEquals("id:3, productName: null, size: null, material: null, color: null, price: "+ 499.0 +", detail1: null, detail2: null",result.toString());

    }

    @Test
    void whenTShirtConstructorIsInvokedReturnObject() {
        waistline = skirt.getWaistline();
        pattern = skirt.getPattern();
        Skirt result = new Skirt(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),499.0,"Slim","Plain");
        assertEquals("id:3, productName: Skirt, size: Small, material: Cotton, color: Black, price: "+ 499.0 +", detail1: Slim, detail2: Plain",result.toString());
    }

    @Test
    void getWaistline() {
        String result = skirt.getWaistline();
        String expected = "Slim";
        assertEquals(expected,result);
    }

    @Test
    void getPattern() {
        String result = skirt.getPattern();
        String expected = "Plain";
        assertEquals(expected,result);
    }

    @Test
    void whenDecorateIsInvokedReturnString() {
        String result = skirt.decorate();
        String expected = "Skirt decorated: Waistline=Slim, Pattern=Plain\n";
        assertEquals(expected,result);
    }

    @Test
    void whenToStringIsInvokedReturnString() {
        skirt = new Skirt(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),399.0,"Slim","Plain");
        String result = skirt.toString();
        String expected = "id:3, productName: Skirt, size: Small, material: Cotton, color: Black, price: "+499.0 +", detail1: Slim, detail2: Plain";
        assertEquals(expected,result);
    }
}