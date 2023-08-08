package uniform.sale.domain.find;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uniform.sale.domain.member.Member;
import uniform.sale.domain.member.MemberRepository;

@Service
@RequiredArgsConstructor
public class FindService {
    private final MemberRepository memberRepository;

    public String findPwd(Find find) {
        String email = find.getEmail();
        Member findMember = memberRepository.findByEmail(email);
        return findMember.getPassword();
    }

}
