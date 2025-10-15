package com.design.pattern.strategy.one;

import com.design.pattern.builder.one.model.TradeSummary;

public class VolumeTieredFeeStrategy implements FeeCalculationStrategy {
    @Override
    public double calculateFee(TradeSummary tradeSummary) {
        double volume = tradeSummary.getVolume();
        if (volume < 1000) {
            return volume * 0.01; // 1% fee for volume less than 1000
        } else if (volume < 10000) {
            return volume * 0.0075; // 0.75% fee for volume between 1000 and 9999
        } else {
            return volume * 0.005; // 0.5% fee for volume 10000 and above
        }
    }
}
