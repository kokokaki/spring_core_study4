package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("lmt")
public class LgMonitor implements Monitor {
    @Override
    public void info() {
        System.out.println("LG 모니터입니다.");
    }
}
