package com.study.observer.simple;

public class SimpleObserver implements Observer {

    private Subject subject;
    private int value = 0;

    public SimpleObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;

        System.out.println("value = " + value);
    }
}
