package com.example.web;

import com.example.dao.TestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yjj on 2015/12/9.
 */
@RestController
public class TestController {
    @Resource
    private TestDao testDao;

    @RequestMapping("test/query")
    public List<Map<String,Object>> query() {
        return testDao.query();
    }
}
