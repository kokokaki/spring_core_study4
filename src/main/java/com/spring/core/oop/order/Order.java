package com.spring.core.oop.order;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long memberId; //주문한 회원 식별번호
    private String itemName; //주문상품명
    private int itemPrice; //주문상품 금액
}
