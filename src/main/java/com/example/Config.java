package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by yjj on 2015/12/10.
 */
@Component
public class Config {
    @Value("${p1}")
    private String p1;
    @Value("${p2}")
    private String p2;

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }
}
