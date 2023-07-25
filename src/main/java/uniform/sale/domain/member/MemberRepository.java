package uniform.sale.domain.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import uniform.sale.mybatis.MemberMapper;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final MemberMapper memberMapper;

    public Member save(Member member) {
        memberMapper.save(member);
        return member;
    }

}
