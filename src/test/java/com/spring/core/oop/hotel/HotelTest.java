package com.spring.core.oop.hotel;

import com.spring.core.oop.config.HotelFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void reserveTest() {
        ApplicationContext ct
                = new AnnotationConfigApplicationContext(HotelFactory.class);
        Hotel hotel = ct.getBean(Hotel.class);

        System.out.println("\n================================");
        hotel.reserve();
        System.out.println("================================");
    }

}