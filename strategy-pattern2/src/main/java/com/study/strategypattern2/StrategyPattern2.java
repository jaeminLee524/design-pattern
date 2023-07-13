package com.study.strategypattern2;

import com.study.strategypattern2.capsulation.FlyNoWay;
import com.study.strategypattern2.capsulation.FlyWithWings;
import com.study.strategypattern2.capsulation.MuteQuack;
import com.study.strategypattern2.capsulation.Quack;
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
