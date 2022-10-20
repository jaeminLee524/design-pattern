package com.study.degisnpatternstrategypattern.coffee;

public class CoffeeMachine {

    public String brew(CoffeeStrategy coffeeStrategy) {
        return coffeeStrategy.brew();
    }

    public CoffeeStrategy americanoButton() {
        return new AmericanoStrategy();
    }

    public CoffeeStrategy coffeeLatteButton() {
        return new CoffeeLatteStrategy();
    }
}
