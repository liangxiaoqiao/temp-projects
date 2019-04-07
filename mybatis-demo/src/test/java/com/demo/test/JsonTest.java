package com.demo.test;

import com.colter.demo.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author liangchao
 * created on 4/7/2019 12:12 PM
 * desc:
 */
@RunWith(JUnit4.class)
public class JsonTest {

    @Test
    public void testJsonBody() throws JsonProcessingException {
        User user = new User();
        user.setId(1L);
        user.setUserId(1111L);
        user.setUserName("name");
        user.setInsertTime(ZonedDateTime.now());
        user.setUpdateTime(ZonedDateTime.now().plusDays(1));
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.registerModule(new ParameterNamesModule());
        mapper.registerModule(new Jdk8Module());
        String result = mapper.writeValueAsString(user);
        System.out.println(result);
    }
}
