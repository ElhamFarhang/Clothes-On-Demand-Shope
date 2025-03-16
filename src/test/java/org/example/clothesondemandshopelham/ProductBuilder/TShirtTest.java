package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TShirtTest {
    TShirt tShirt;
    Product mockedProduct = mock(Product.class);
    private String sleeves;
    private String neck;

    @BeforeEach
    void setup(){
        when(mockedProduct.getId()).thenReturn("2");
        when(mockedProduct.getProductName()).thenReturn("TShirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Black");
        when(mockedProduct.getDetail1()).thenReturn("ShortSleeve");
        when(mockedProduct.getDetail2()).thenReturn("VNeck");
        tShirt = new TShirt("ShortSleeve","VNeck");
    }

    @Test
    void whenTShirtIsInvokedReturnObject() {
        TShirt result = new TShirt(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),399.0,"ShortSleeve","VNeck");
        assertEquals("id:2, productName: TShirt, size: Small, material: Cotton, color: Black, price: "+ 399.0 +", detail1: ShortSleeve, detail2: VNeck",result.toString());
    }

    @Test
    void whenTShirtConstructorIsInvokedReturnObject() {
        sleeves = tShirt.getSleeves();
        neck = tShirt.getNeck();
        TShirt result = new TShirt(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),399.0,sleeves,neck);
        assertEquals("id:2, productName: TShirt, size: Small, material: Cotton, color: Black, price: "+ 399.0 +", detail1: ShortSleeve, detail2: VNeck",result.toString());
    }

    @Test
    void whenGetSleevesIsInvokedReturnString() {
        String result = tShirt.getSleeves();
        String expected = "ShortSleeve";
        assertEquals(expected,result);
    }

    @Test
    void whenGetNeckIsInvokedReturnString() {
        String result = tShirt.getNeck();
        String expected = "VNeck";
        assertEquals(expected,result);
    }

    @Test
    void whenDecorateIsInvokedReturnString() {
        String result = tShirt.decorate();
        String expected = "T-Shirt decorated: Sleeves=ShortSleeve, Neck=VNeck\n";
        assertEquals(expected,result);
    }

    @Test
    void whenToStringIsInvokedReturnString() {
        tShirt = new TShirt(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),399.0,"ShortSleeve","VNeck");
        String result = tShirt.toString();
        String expected = "id:2, productName: TShirt, size: Small, material: Cotton, color: Black, price: "+ 399.0 +", detail1: ShortSleeve, detail2: VNeck";
        assertEquals(expected,result);
    }
}