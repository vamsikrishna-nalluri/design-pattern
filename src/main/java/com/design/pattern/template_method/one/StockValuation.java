package com.design.pattern.template_method.one;

public class StockValuation extends AssetValuationTemplate {

    @Override
    protected double runCalculation(String marketData) {
        System.out.println("[Variable Step] Running stock-specific valuation using " + marketData + "...");
        // Simulate complex stock valuation logic
        return 150.75; // Example calculated value
    }

    @Override
    protected double applyAdjustments(double calculatedValue) {
        System.out.println("[Hook Step] Applying stock-specific adjustments (e.g., market volatility)...");
        // Simulate adjustment logic
        return calculatedValue * 0.95; // Example adjustment
    }
}
