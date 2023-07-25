package uniform.sale.domain.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uniform.sale.domain.member.Member;
import uniform.sale.domain.member.MemberRepository;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

//    public Member login(String loginEmail, String password) {
//
//        return memberRepository.findByLoginEmail(loginEmail)
//                .filter(m -> m.getPassword().equals(password))
//                .orElse(null);
//
//
//    }

}
