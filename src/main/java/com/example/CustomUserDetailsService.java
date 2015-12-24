package com.example;

import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yjj31 on 2015/12/24.
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomUserDetailsService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String userSql="SELECT * FROM users WHERE username=?";
        Map<String,Object> map=jdbcTemplate.queryForMap(userSql,username);
        String roleSql="SELECT authority FROM authorities WHERE username=?";
        List<String> roles = jdbcTemplate.queryForList(roleSql,String.class, username);
        List<GrantedAuthority> authorities=new ArrayList<>();
        for(String role:roles){
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return new CustomUser(username, MapUtils.getString(map,"password")
                ,authorities,MapUtils.getString(map,"email"),MapUtils.getIntValue(map,"age"));
    }
}
