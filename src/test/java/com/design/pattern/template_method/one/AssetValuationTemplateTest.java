package com.design.pattern.template_method.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssetValuationTemplateTest {

    @Test
    void testStockValuation() {
        AssetValuationTemplate stockValuation = new StockValuation();

        String assertId = "ABC";
        double stockValue = stockValuation.calculateValue(assertId);

        assertEquals(143.2125, stockValue, 0.0001);
    }

}