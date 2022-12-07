package com.design.statepattern.state;

public class Happy extends Emotion {

    @Override
    public State earnMoney() {
        return new Perfect();
    }

    @Override
    public State loseMoney() {
        return new SoSo();
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("행복합니다.");
    }
}
