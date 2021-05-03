package com.github.fnsousa.design.patterns.strategy;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(BigDecimal value);

}
