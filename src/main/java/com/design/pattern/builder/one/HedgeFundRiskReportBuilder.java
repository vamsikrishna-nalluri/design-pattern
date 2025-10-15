package com.design.pattern.builder.one;

import com.design.pattern.builder.one.model.EODReport;
import com.design.pattern.builder.one.model.Header;
import com.design.pattern.builder.one.model.TradeSummary;

public class HedgeFundRiskReportBuilder implements ReportBuilder {

    private final EODReport report;

    protected HedgeFundRiskReportBuilder() {
        this.report = new EODReport();
    }

    public static ReportBuilder builder() {
        return new HedgeFundRiskReportBuilder();
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
        // Implementation for building risk metrics specific to Hedge Fund Risk Report
        return this;
    }

    @Override
    public EODReport build() {
        // Return the constructed EODReport specific to Hedge Fund Risk Report
        return report;
    }
}
