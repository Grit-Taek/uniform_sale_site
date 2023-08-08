package uniform.sale.web.find;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import uniform.sale.domain.find.Find;
import uniform.sale.domain.find.FindService;

@Controller
@RequiredArgsConstructor
public class FindController {

    private final FindService findService;

    @GetMapping("/findPwd")
    public String findPwdForm() {
        return "findPwd.html";
    }

    @PostMapping("/findPwd")
    public String findPwd(@ModelAttribute Find find, Model model) {
        String findPassword = findService.findPwd(find);
        model.addAttribute("find", findPassword);
        return "PwdChk.html";

    }
}
