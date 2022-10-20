package com.study.strategypattern.coffee;

public class CoffeeLatteStrategy implements CoffeeStrategy {

    private static final String COFFEELATTE = "카페라떼";

    @Override
    public String brew() {
        return COFFEELATTE;
    }
}
