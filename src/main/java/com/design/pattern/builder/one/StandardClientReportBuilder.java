package com.design.pattern.builder.one;

import com.design.pattern.builder.one.model.EODReport;
import com.design.pattern.builder.one.model.Header;
import com.design.pattern.builder.one.model.TradeSummary;

/**
 * Builder pattern implementation for standard client report.
 */
public class StandardClientReportBuilder implements ReportBuilder{

    private EODReport report;

    public StandardClientReportBuilder() {
        this.report = new EODReport(); // Initialize the product
    }

    @Override
    public ReportBuilder buildHeader() {
        report.setHeader(new Header());
        return this;
    }

    @Override
    public ReportBuilder buildTradeSummary() {
        report.setTradeSummary(new TradeSummary());
        return this;
    }

    @Override
    public ReportBuilder buildRiskMetrics() {
        return null;
    }

    @Override
    public EODReport build() {
        return report;
    }
}
