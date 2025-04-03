package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TShirtTest {
    TShirt tShirt;
    Product mockedProduct = mock(Product.class);

    @BeforeEach
    void setup(){
        when(mockedProduct.getId()).thenReturn("2");
        when(mockedProduct.getProductName()).thenReturn("TShirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Blue");
        when(mockedProduct.getPrice()).thenReturn(399.0);
        when(mockedProduct.getDetail1()).thenReturn("ShortSleeve");
        when(mockedProduct.getDetail2()).thenReturn("VNeck");
        tShirt = new TShirt();
    }

    @Test
    void whenTShirtIsInvokedReturnObject() {
        TShirt result = new TShirt();
        assertEquals("id:2, productName: null, size: null, material: null, color: null, price: "+ 399.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void shouldCreateTShirtWithDefaultValues() {
        assertNull(tShirt.getId());
        assertNull(tShirt.getProductName());
        assertNull(tShirt.getSize());
        assertNull(tShirt.getMaterial());
        assertNull(tShirt.getColor());
        assertEquals(0.0, tShirt.getPrice());
    }

    @Test
    void whenSetSleevesIsInvokedShouldSetSleeves() {
        tShirt.setSleeves("ShortSleeve");
            assertEquals("ShortSleeve", tShirt.getSleeves());
    }

    @Test
    void whenSetNeckIsInvokedShouldSetNeck() {
        tShirt.setNeck("VNeck");
            assertEquals("VNeck", tShirt.getNeck());
    }

    @Test
    void testToString() {
        tShirt = new TShirt(mockedProduct.getId(), mockedProduct.getProductName(), mockedProduct.getSize(), mockedProduct.getMaterial(), mockedProduct.getColor(), 399.0);
        tShirt.setSleeves("ShortSleeve");
        tShirt.setNeck("VNeck");
        assertEquals("id:2, productName: TShirt, size: Small, material: Cotton, color: Blue, price: 399.0, detail1: ShortSleeve, detail2: VNeck", tShirt.toString());
    }
}