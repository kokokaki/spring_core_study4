package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("am")
public class AppleMouse implements Mouse {
    @Override
    public void info() {
        System.out.println("애플 마우스입니다.");
    }
}
