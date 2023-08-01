package uniform.sale.web.login;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uniform.sale.domain.login.Login;
import uniform.sale.domain.login.LoginService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
@Slf4j
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Login login, HttpServletResponse response) {
        Login loginMember = loginService.login(login);
        Cookie emailCookie = new Cookie("memberEmail", String.valueOf(loginMember.getEmail()));
        response.addCookie(emailCookie);
        log.info("tqtqtqtqtq");
        return "redirect:/members/loginHome"; // 로그인홈으로 돌려야하는데ㅜ
        // loginHome 타임리프랑하고도 호환도 안되는듯 ㅠ
    }

}
