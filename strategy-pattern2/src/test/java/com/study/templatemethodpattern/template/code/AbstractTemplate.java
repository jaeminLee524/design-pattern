package com.study.templatemethodpattern.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    public void execute() {
        long startTime = System.currentTimeMillis();
        // 비즈니스 로직 실행 (변하는 로직)
        call();
        // 비즈니스 로직 종료 (변하는 로직)
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime: {} ", resultTime);
    }

    protected abstract void call();
}
