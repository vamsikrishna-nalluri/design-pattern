package com.design.pattern.strategy.one;

import com.design.pattern.builder.one.model.TradeSummary;

/**
 * Strategy interface for fee calculation.
 * Different implementations can provide various fee calculation strategies.
 * For example, fixed fee per share, volume-tiered fees, or special rates for premium clients.
 * This design allows for easy extension and modification of fee calculation logic without altering existing code.
 * It adheres to the Strategy Pattern principles, promoting flexibility and maintainability in the fee calculation system.
 * The interface defines a single method, calculateFee, which takes a TradeSummary object as input and returns the calculated fee as a double.
 * Implementations of this interface can encapsulate different algorithms for fee calculation, allowing the system to
 * switch between them dynamically at runtime based on the context or user preferences.
 * This approach enhances the system's ability to adapt to changing business requirements and fee structures.
 * It also supports the Open/Closed Principle, as new fee calculation strategies can be added without modifying existing code.
 */
public interface FeeCalculationStrategy {

    /**
     * Calculate the fee based on the provided trade summary.
     *
     * @param tradeSummary The trade summary containing details for fee calculation.
     * @return The calculated fee as a double.
     */
    double calculateFee(TradeSummary tradeSummary);
}
