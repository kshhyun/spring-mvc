package Hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //Web application에서 /hello을 누르면 이 method를 호출
    public String hello(Model model){ //MVC에서 'M'에 해당
        //'data'를 'hello'로 넘김
        model.addAttribute("data","hello");
        return "hello";
    }
}
