package com.design.statepattern.state;

public interface State {

    State winLottery();

    State earnMoney();

    State loseMoney();

    State loseWinLottery();

    void printCurrentEmotion();
}
