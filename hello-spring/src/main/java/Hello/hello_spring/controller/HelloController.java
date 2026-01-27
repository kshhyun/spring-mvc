package Hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // 1. Web 실행 -> /hello를 누르면 아래 hello() method 호출
    @GetMapping("hello")
    public String hello(Model model){ //MVC에서 'M'에 해당 - model은 View에 전달할 데이터를 key=value로 담아 전달
        //hello.html에 'data'를 'hello'로 넘김
        model.addAttribute("data","hello!!");
        return "hello"; //view의 이름은 return 값으로 표현 -> resources/templates/hello.html로 이동
    }
}
