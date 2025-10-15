package com.design.pattern.strategy.one.context;

import com.design.pattern.builder.one.model.TradeSummary;
import com.design.pattern.strategy.one.FeeCalculationStrategy;

/**
 * Context class that uses a FeeCalculationStrategy to calculate fees.
 * This class is responsible for interacting with the strategy interface.
 * It delegates the fee calculation to the strategy implementation provided at runtime.
 * This allows for flexible and interchangeable fee calculation strategies.
 * The context class does not implement any fee calculation logic itself,
 * adhering to the Strategy Pattern principles.
 * It can be easily extended to support new strategies without modifying existing code.
 * This promotes the Open/Closed Principle, as new strategies can be added without changing the context class.
 * It also enhances maintainability and scalability of the fee calculation system.
 * The context class can be instantiated with different strategies based on the application's requirements,
 * allowing for dynamic behavior changes at runtime.
 */
public class FeeCalculatorContext {

    /**
     * The strategy interface for fee calculation.
     */
    private final FeeCalculationStrategy feeCalculationStrategy;

    /**
     * Constructor to initialize the context with a specific fee calculation strategy.
     *
     * @param feeCalculationStrategy The strategy implementation to be used for fee calculation.
     */
    public FeeCalculatorContext(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }

    /**
     * Method to calculate the fee using the provided strategy.
     *
     * @param tradeSummary The trade summary containing details for fee calculation.
     * @return The calculated fee based on the strategy.
     */
    public double calculateFee(TradeSummary tradeSummary) {
        return feeCalculationStrategy.calculateFee(tradeSummary);
    }
}
