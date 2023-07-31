package uniform.sale.web.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
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
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    public String login() {
        return "login/login.html";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Login login, HttpServletResponse response) {
        Login loginMember = loginService.login(login);
        Cookie emailCookie = new Cookie("memberEmail", String.valueOf(loginMember.getEmail()));
        response.addCookie(emailCookie);
        return "redirect:/";

    }
}
