package com.design.pattern.builder.one.model;

import lombok.Data;

@Data
public class EODReport {

    private Header header;

    private TradeSummary tradeSummary;

    private RiskMetrics riskMetrics;

}
