package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("hk")
public class HpKeyboard implements Keyboard {
    @Override
    public void info() {
        System.out.println("hp 키보드입니다.");
    }
}
