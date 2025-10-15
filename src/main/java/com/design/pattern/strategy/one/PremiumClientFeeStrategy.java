package com.design.pattern.strategy.one;

import com.design.pattern.builder.one.model.TradeSummary;

public class PremiumClientFeeStrategy implements FeeCalculationStrategy{
    @Override
    public double calculateFee(TradeSummary tradeSummary) {
        return 0;
    }
}
