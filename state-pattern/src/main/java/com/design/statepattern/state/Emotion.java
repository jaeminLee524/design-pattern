package com.design.statepattern.state;

public abstract class Emotion implements State {

    @Override
    public State winLottery() {
        return new Perfect();
    }

    @Override
    public State loseWinLottery() {
        return new Terrible();
    }
}
