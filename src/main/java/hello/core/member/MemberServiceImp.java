package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImp implements MemberService{
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImp(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }


    public Member findMember(Long memberId) {
        return memberRepository.finById(memberId);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
