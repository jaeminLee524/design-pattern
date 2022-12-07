package com.design.statepattern.state;

public class Application {

    public static void main(String[] args) {
        Person person = new Person(new SoSo());
        person.printCurrentEmotion();
        person.earnMoney();
        person.winLottery();
        person.loseMoney();
        person.loseMoney();
        person.loseMoney();
        person.loseMoney();
    }
}
