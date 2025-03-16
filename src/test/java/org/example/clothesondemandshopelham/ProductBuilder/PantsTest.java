package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PantsTest {
    Pants pants;
    Product mockedProduct = mock(Product.class);
    private String fit;
    private String length;

    @BeforeEach
    void setup(){
        when(mockedProduct.getId()).thenReturn("1");
        when(mockedProduct.getProductName()).thenReturn("Pants");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Blue");
        when(mockedProduct.getPrice()).thenReturn(599.9);
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Long");
        pants = new Pants("Slim","Long");
    }
    @Test
    void whenPantsIsInvokedReturnObject() {
        Pants result = new Pants(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),mockedProduct.getPrice(),mockedProduct.getDetail1(),mockedProduct.getDetail2());
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: Slim, detail2: Long",result.toString());
    }

    @Test
    void whenPantsConstructorIsInvokedReturnObject() {
        fit = pants.getFit();
        length = pants.getLength();
        Pants result = new Pants(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),599.0,fit,length);
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: Slim, detail2: Long",result.toString());
    }

    @Test
    void whenGetFitIsInvokedReturnString() {
        String result = pants.getFit();
        String expected = "Slim";
        assertEquals(expected,result);
    }

    @Test
    void whenGetLengthIsInvokedReturnString() {
        String result = pants.getLength();
        String expected = "Long";
        assertEquals(expected,result);
    }

    @Test
    void whenDecorateIsInvokedReturnString() {
        String result = pants.decorate();
        String expected = "Pants decorated: Fit=Slim, Length=Long\n";
        assertEquals(expected,result);
    }

    @Test
    void whenToStringIsInvokedReturnString() {
        pants = new Pants(mockedProduct.getId(),mockedProduct.getProductName(),mockedProduct.getSize(),mockedProduct.getMaterial(),mockedProduct.getColor(),599.0,"Slim","Long");
        String result = pants.toString();
        String expected = "id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: "+ 599.0 +", detail1: Slim, detail2: Long";
        assertEquals(expected,result);
    }
}