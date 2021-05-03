package com.github.fnsousa.design.patterns.strategy;

import java.math.BigDecimal;

public class TaxICMS implements Tax {

    @Override
    public BigDecimal calculate(BigDecimal value) {
        System.out.println("Calculating ICMS...");
        return value.multiply(new BigDecimal("0.18"));
    }
}
