package shiro.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/t")
    public String test() {
        System.out.println("xxxxxxxxxxxxxx");
        return "index";
    }
}
