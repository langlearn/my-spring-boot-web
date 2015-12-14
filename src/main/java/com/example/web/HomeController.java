package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yjj on 2015/12/9.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "home,world";
    }

    @RequestMapping("/admin/main")
    String admin(){
        return "admin-main";
    }
}
