package com.design.statepattern.state;

public class Person {

    private State state;

    public Person(State state) {
        this.state = state;
    }

    public void winLottery() {
        state = state.winLottery();
        state.printCurrentEmotion();
    }

    public void earnMoney() {
        state = state.earnMoney();
        state.printCurrentEmotion();
    }

    public void loseMoney() {
        state = state.loseMoney();
        state.printCurrentEmotion();
    }

    public void printCurrentEmotion() {
        state.printCurrentEmotion();
    }
}
