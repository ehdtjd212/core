package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImp;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

    //test
    @Bean
    public MemberService memberService(){
        return new MemberServiceImp(memberRepository());
    }


    @Bean
    public OrderService orderService() {
        return new OrderServiceImp(
                memberRepository(),
                discountPolicy());
    }
    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        System.out.println("true = " + true);
        System.out.println("두번째커밋");
        System.out.println("세번째커밋");
        return new RateDiscountPolicy();

    }

}
