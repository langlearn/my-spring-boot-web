package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by yjj on 2015/12/11.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    String welcome(Map<String,Object> modal){
        modal.put("message","hello,world");
        modal.put("time",new Date());
        return "welcome";
    }
}
