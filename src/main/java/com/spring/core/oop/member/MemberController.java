package com.spring.core.oop.member;

//책임: 적당한 회원 저장소에 저장 및 조회 명령을 내려야 한다.
public class MemberController {

    private MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원 가입 명령 기능
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원 조회 명령 기능
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
