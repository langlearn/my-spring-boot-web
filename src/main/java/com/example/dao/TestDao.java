package com.example.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by yjj on 2015/12/9.
 */
@Repository
public class TestDao {
    private final static Logger logger = LoggerFactory.getLogger(TestDao.class);
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TestDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> query(){
        logger.info("TestDao:query");
        return jdbcTemplate.queryForList("SELECT * FROM test_shard_hash_0002");
    }
}
