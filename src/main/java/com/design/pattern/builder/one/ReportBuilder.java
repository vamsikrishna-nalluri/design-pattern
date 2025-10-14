package com.design.pattern.builder.one;

import com.design.pattern.builder.one.model.EODReport;

public interface ReportBuilder {

    ReportBuilder buildHeader();

    ReportBuilder buildTradeSummary();

    ReportBuilder buildRiskMetrics();

    EODReport getReport();
}
