package com.study.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {

    private List<Observer> observers;
    private int value = 0;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        this.notifyObservers();
    }
}
