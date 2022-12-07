package com.design.statepattern.state;

public class Perfect extends Emotion {

    @Override
    public State earnMoney() {
        // 기분이 더 좋아질 수 없기 때문에 예외를 발생시키는 방식을 사용 가능
        return this;
    }

    @Override
    public State loseMoney() {
        return new Happy();
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("최고입니다.");
    }
}
