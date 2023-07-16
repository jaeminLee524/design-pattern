package com.study.observer.capsulation;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("조용");
    }
}
