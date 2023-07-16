package com.study.observer.capsulation;

public class FakeQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽉");
    }
}
