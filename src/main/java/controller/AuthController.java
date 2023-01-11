package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AuthController {
    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
