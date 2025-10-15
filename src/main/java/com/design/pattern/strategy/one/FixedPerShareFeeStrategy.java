package com.design.pattern.strategy.one;

public class FixedPerShareFeeStrategy implements FeeCalculationStrategy {


    @Override
    public double calculateFee(com.design.pattern.builder.one.model.TradeSummary tradeSummary) {
        return tradeSummary.getVolume() * 1.2; // Fixed fee of 1.2% per share
    }
}
