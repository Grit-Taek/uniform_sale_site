package uniform.sale.web.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uniform.sale.domain.find.Find;
import uniform.sale.domain.member.Member;
import uniform.sale.domain.member.MemberService;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String joinMember() {
        return "join.html";
    }

    @PostMapping("/join")
    public String save(@ModelAttribute Member member) {
        memberService.save(member);
        return "redirect:/";
    }


}
