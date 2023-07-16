package com.study.observer.capsulation;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("로켓 추진기를 달고 날고 있어");
    }
}
