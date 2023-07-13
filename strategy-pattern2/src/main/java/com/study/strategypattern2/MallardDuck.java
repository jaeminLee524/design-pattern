package com.study.strategypattern2;

import com.study.strategypattern2.capsulation.FlyBehavior;
import com.study.strategypattern2.capsulation.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("나는 오리 미끼야");
    }
}
