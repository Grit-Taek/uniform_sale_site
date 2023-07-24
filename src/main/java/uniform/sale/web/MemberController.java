package uniform.sale.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {

    @GetMapping("/join")
    public String joinMember() {
        return "join.html";
    }

    @PostMapping("/join")
    public String save() {
        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginMember() {
        return "login.html";
    }


}
