package com.github.fnsousa.design.patterns.strategy;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(BigDecimal value, Tax tax) {
        return tax.calculate(value);
    }

}
