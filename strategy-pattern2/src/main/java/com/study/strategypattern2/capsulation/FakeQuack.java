package com.study.strategypattern2.capsulation;

public class FakeQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽉");
    }
}
