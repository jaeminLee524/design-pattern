package com.study.observer.capsulation;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("나는 날고 있어");
    }
}
