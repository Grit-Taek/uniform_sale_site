package uniform.sale.domain.login;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uniform.sale.domain.member.Member;
import uniform.sale.domain.member.MemberRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Login login(Login login) {
        Login findLogin = memberRepository.findByEmail(login);
        String pwd = findLogin.getPassword();
        if (findLogin.getPassword() == pwd) {
            log.info("login succeed");
            return login;
        }

        return login;

    }

}
