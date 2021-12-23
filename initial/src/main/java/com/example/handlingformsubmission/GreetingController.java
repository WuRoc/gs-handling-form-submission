package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @ClassName GreetingController
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-12-23 14:07
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting",new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingForm(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
