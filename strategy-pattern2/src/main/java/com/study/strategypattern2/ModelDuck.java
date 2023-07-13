package com.study.strategypattern2;

import com.study.strategypattern2.capsulation.FlyBehavior;
import com.study.strategypattern2.capsulation.QuackBehavior;

public class ModelDuck extends Duck{

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("나는 모델 오리");
    }
}
