package com.study.observer.capsulation;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꿕꿕");
    }
}
