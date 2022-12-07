package com.design.statepattern.state;

public class Terrible extends Emotion {

    @Override
    public State earnMoney() {
        // 돈을 벌었기에 한 단계 기분이 좋은 Bad
        return new Bad();
    }

    @Override
    public State loseMoney() {
        // 기분이 더 나빠질 수 없기 때문에 예외를 발생시키는 방식을 사용할 수도 있다.
        return this;
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("최악입니다.");
    }
}
