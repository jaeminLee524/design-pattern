package com.study.observer;

import com.study.observer.capsulation.FlyNoWay;
import com.study.observer.capsulation.FlyWithWings;
import com.study.observer.capsulation.MuteQuack;
import com.study.observer.capsulation.Quack;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPattern2 {

    public static void main(String[] args) {
        ModelDuck modelDuck = new ModelDuck(new FlyNoWay(), new Quack());
        System.out.println(">>>>>>>>>모델 오리 시작");
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println(">>>>>>>>>모델 오리 종료");

        System.out.println("\n");

        MallardDuck mallardDuck = new MallardDuck(new FlyWithWings(), new MuteQuack());
        System.out.println(">>>>>>>>>청둥오리 시작");
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println(">>>>>>>>>청둥오리 종료");
    }
}
