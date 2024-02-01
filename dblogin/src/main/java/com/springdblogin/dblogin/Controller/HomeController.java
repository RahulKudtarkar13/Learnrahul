package com.springdblogin.dblogin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
