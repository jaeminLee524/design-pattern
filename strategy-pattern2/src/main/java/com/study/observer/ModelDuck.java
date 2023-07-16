package com.study.observer;

import com.study.observer.capsulation.FlyBehavior;
import com.study.observer.capsulation.QuackBehavior;

public class ModelDuck extends Duck{

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("나는 모델 오리");
    }
}
