package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 특별한 경우 이름을 부여할 수 있다.("memberService2")
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository ;

    @Autowired // (ac.getBean(MemberRepository.class))
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //테스트용
    public  MemberRepository getMemberRepository(){
        return memberRepository;
    }
}

