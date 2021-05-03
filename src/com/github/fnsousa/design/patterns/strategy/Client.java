package com.github.fnsousa.design.patterns.strategy;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {

        BigDecimal value = new BigDecimal("1000");

        TaxCalculator taxCalculator = new TaxCalculator();

        //Calculate tax ICMS
        BigDecimal taxICMS = taxCalculator.calculate(value, new TaxICMS());
        System.out.println(taxICMS);

        //Calculate tax ISS
        BigDecimal taxISS = taxCalculator.calculate(value, new TaxISS());
        System.out.println(taxISS);
    }

}
