package com.study.observer.simple;

public class SimpleObserverRunner {

    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(80);
    }
}
