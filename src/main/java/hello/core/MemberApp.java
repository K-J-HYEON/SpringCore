// MemberApp


package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    // psvm = public static void main을 이용하자. / command option v도 활용
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        // id값은 1번(1L => Long type)이라고 치고 이름은 memberA, 등급은 VIP라고 해준다.
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        // soutv실행
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}