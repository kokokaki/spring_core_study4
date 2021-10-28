package com.spring.core.oop.member;

import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Member {

    private Long id; //회원식별코드
    private String name; //회원명
    private Grade grade; //회원등급

    //자바 빈즈 규약
    //기본생성자, 모든필드 초기화 생성자
    //getter, setter, toString, hashCode...

}
