package com.design.statepattern.state;

public class SoSo extends Emotion {

    @Override
    public State earnMoney() {
        return new Happy();
    }

    @Override
    public State loseMoney() {
        return new Bad();
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("그저그래요.");
    }
}
