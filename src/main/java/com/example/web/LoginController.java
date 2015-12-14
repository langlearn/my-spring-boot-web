package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yjj on 2015/12/14.
 */
@Controller
public class LoginController {

    @RequestMapping(method = RequestMethod.GET,value = "/login")
    String loginPage(){
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/login")
    String login(){
        return "login";
    }

    @RequestMapping("login?success")
    String loginSuccess(){
        return "login-success";
    }
}
