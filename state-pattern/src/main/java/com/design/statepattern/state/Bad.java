package com.design.statepattern.state;

public class Bad extends Emotion{

    @Override
    public State earnMoney() {
        // 돈을 벌어서 한 단계 기분이 좋은 SoSo
        return new SoSo();
    }

    @Override
    public State loseMoney() {
        // 한 단계 낮추던지, 친구와 술을 먹는 기분 처리
        return new Terrible();
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("별로입니다.");
    }
}
