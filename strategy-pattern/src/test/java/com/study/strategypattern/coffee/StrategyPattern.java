package com.study.strategypattern.coffee;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StrategyPattern {
    private static final String AMERICANO = "아메리카노";
    private static final String LATTE = "카페라떼";

    @Test
    void coffee() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        CoffeeStrategy americanoButton = coffeeMachine.americanoButton();
        CoffeeStrategy coffeeLatteButton = coffeeMachine.coffeeLatteButton();

        String americano = americanoButton.brew();
        String coffeeLatte = coffeeLatteButton.brew();

        Assertions.assertThat(americano).isEqualTo(AMERICANO);
        Assertions.assertThat(coffeeLatte).isEqualTo(LATTE);
    }
}