package com.example.web;

import com.example.Config;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by yjj on 2015/12/10.
 */
@Controller
public class ConfigController {
    @Resource
    private Config config;

    @RequestMapping("/config")
    @ResponseBody
    Config query(){
        return config;
    }
}
