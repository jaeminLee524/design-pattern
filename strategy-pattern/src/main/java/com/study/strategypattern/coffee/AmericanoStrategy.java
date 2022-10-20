package com.study.strategypattern.coffee;

public class AmericanoStrategy implements CoffeeStrategy {

    private static final String AMERICANO = "아메리카노";

    @Override
    public String brew() {
        return AMERICANO;
    }
}
