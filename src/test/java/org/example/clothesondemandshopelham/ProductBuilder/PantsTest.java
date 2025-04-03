package org.example.clothesondemandshopelham.ProductBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PantsTest {
    Pants pants;
    Product mockedProduct = mock(Product.class);

    @BeforeEach
    void setup(){
        when(mockedProduct.getId()).thenReturn("1");
        when(mockedProduct.getProductName()).thenReturn("Pants");
        when(mockedProduct.getSize()).thenReturn("Small");
        when(mockedProduct.getMaterial()).thenReturn("Cotton");
        when(mockedProduct.getColor()).thenReturn("Blue");
        when(mockedProduct.getPrice()).thenReturn(599.0);
        when(mockedProduct.getDetail1()).thenReturn("Slim");
        when(mockedProduct.getDetail2()).thenReturn("Long");
        pants = new Pants();
    }

    @Test
    void whenPantsIsInvokedReturnObject() {
        Pants result = new Pants();
        assertEquals("id:1, productName: null, size: null, material: null, color: null, price: "+ 599.0 +", detail1: null, detail2: null",result.toString());
    }

    @Test
    void shouldCreatePantsWithDefaultValues() {
        Pants pants = new Pants();
        assertNull(pants.getId());
        assertNull(pants.getProductName());
        assertNull(pants.getSize());
        assertNull(pants.getMaterial());
        assertNull(pants.getColor());
        assertEquals(0.0, pants.getPrice());
    }

    @Test
    void whenSetFitIsInvokedShouldSetFit() {
        pants.setFit("Slim");
        assertEquals("Slim", pants.getFit());
    }

    @Test
    void whenSetLengthIsInvokedShouldSetLength() {
        pants.setLength("Long");
        assertEquals("Long", pants.getLength());
    }

    @Test
    void testToString() {
        pants = new Pants(mockedProduct.getId(), mockedProduct.getProductName(), mockedProduct.getSize(), mockedProduct.getMaterial(), mockedProduct.getColor(), 599.0);
        pants.setFit("Slim");
        pants.setLength("Long");
        assertEquals("id:1, productName: Pants, size: Small, material: Cotton, color: Blue, price: 599.0, detail1: Slim, detail2: Long", pants.toString());
    }
}