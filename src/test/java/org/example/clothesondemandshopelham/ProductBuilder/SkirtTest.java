package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SkirtTest {
    Skirt skirt;
    Product mockedProduct = mock(Product.class);

    @BeforeEach
    void setup(){
        when(mockedProduct.getId()).thenReturn("3");
        when(mockedProduct.getProductName()).thenReturn("Skirt");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Blue");
        when(mockedProduct.getPrice()).thenReturn(499.0);
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Plain");
        skirt = new Skirt();
    }

    @Test
    void whenSkirtIsInvokedReturnObject() {
        Skirt result = new Skirt();
        assertEquals("id:3, productName: null, size: null, material: null, color: null, price: "+ 499.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void shouldCreateSkirtWithDefaultValues() {
        assertNull(skirt.getId());
        assertNull(skirt.getProductName());
        assertNull(skirt.getSize());
        assertNull(skirt.getMaterial());
        assertNull(skirt.getColor());
        assertEquals(0.0, skirt.getPrice());
    }

    @Test
    void whenSetWaistlineIsInvokedShouldSetWaistline() {
        skirt.setWaistline("Slim");
        assertEquals("Slim", skirt.getWaistline());
    }

    @Test
    void whenSetPatternIsInvokedShouldSetPattern() {
        skirt.setPattern("Plain");
        assertEquals("Plain", skirt.getPattern());
    }

    @Test
    void testToString() {
        skirt = new Skirt(mockedProduct.getId(), mockedProduct.getProductName(), mockedProduct.getSize(), mockedProduct.getMaterial(), mockedProduct.getColor(), 599.0);
        skirt.setWaistline("Slim");
        skirt.setPattern("Plain");
        assertEquals("id:3, productName: Skirt, size: Small, material: Cotton, color: Blue, price: 499.0, detail1: Slim, detail2: Plain", skirt.toString());
    }
}