package com.design.pattern.template_method.one;

public abstract class AssetValuationTemplate {

    // --- 2. Primitive Operations (Concrete/Fixed) ---
    private String fetchMarketData(String assetId) {
        System.out.println("[Fixed Step] Fetching real-time market data for " + assetId + "...");
        return "MarketDataFor_" + assetId; // Simulation
    }

    private void logAuditRecord(String assetId, double value) {
        System.out.printf("[Fixed Step] AUDIT: Valuation completed for %s. Final Value: $%.2f%n", assetId, value);
    }

    // --- 3. Primitive Operation (Abstract/Deferred to Subclasses) ---
    protected abstract double runCalculation(String marketData);

    // --- 4. Hook Operation (Optional Overriding) ---
    // Default implementation does nothing (no adjustment). Subclasses can override.
    protected double applyAdjustments(double calculatedValue) {
        System.out.println("[Hook Step] No specific adjustments applied.");
        return calculatedValue;
    }

    public final double calculateValue(String assetId) {
        // Step 1: Fixed
        String data = fetchMarketData(assetId);

        // Step 2: Varies by Asset (Abstract/Deferred)
        double calculatedValue = runCalculation(data);

        // Step 3: Varies Optionally (Hook)
        double finalValue = applyAdjustments(calculatedValue);

        // Step 4: Fixed
        logAuditRecord(assetId, finalValue);

        return finalValue;
    }
}
