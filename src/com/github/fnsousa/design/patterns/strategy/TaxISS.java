package com.github.fnsousa.design.patterns.strategy;

import java.math.BigDecimal;

public class TaxISS implements Tax {

    @Override
    public BigDecimal calculate(BigDecimal value) {
        System.out.println("Calculating ISS...");
        return value.multiply(new BigDecimal("0.05"));
    }
}
