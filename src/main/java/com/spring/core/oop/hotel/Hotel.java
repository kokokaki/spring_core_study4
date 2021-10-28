package com.spring.core.oop.hotel;

import org.springframework.stereotype.Component;

@Component //이 클래스를 스프링컨테이너에 등록 : 스프링에게 객체생성 제어권을 넘김
public class Hotel {

    private final Restaurant restaurant;

    public Hotel(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    //레스토랑 예약기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }


}
