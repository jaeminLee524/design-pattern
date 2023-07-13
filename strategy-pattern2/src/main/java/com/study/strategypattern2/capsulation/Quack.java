package com.study.strategypattern2.capsulation;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꿕꿕");
    }
}
