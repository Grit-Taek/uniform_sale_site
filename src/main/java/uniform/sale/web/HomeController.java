package uniform.sale.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import uniform.sale.domain.member.Member;
import uniform.sale.domain.member.MemberRepository;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String homeLogin(@CookieValue(name="memberEmail", required = false) String memberEmail, Model model) {

        if (memberEmail == null) {
            return "home.html";
        }
        Member loginMember = memberRepository.findByEmail(memberEmail);
        model.addAttribute("member",loginMember);
        return "loginHome.html";
    }
}
