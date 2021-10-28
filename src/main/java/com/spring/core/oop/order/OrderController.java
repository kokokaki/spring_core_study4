package com.spring.core.oop.order;

import com.spring.core.oop.member.DataBaseMemberRepository;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;
import com.sun.org.apache.xpath.internal.operations.Or;

//책임: 적당한 회원저장소에서 회원정보를 조회 한 후
//     주문 정보를 생성해야 한다.
public class OrderController {

    private MemberRepository memberRepository;

    public OrderController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //주문정보 생성
    public Order createOrder(Long id) {
        Member member = memberRepository.findById(id);
        return new Order(id, "상품1", 5000);
    }
}
