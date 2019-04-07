package com.colter.demo.config;

import com.colter.demo.entity.User;
import com.colter.demo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @author liangchao
 * created on 4/7/2019 12:37 PM
 * desc:
 */
@Configuration
public class JsonConfig {
    //
//    @Bean
//    @Primary
//    @Order(Ordered.HIGHEST_PRECEDENCE)
//    public Jackson2ObjectMapperBuilder converter() {
//        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
//        mapper.registerModule(new ParameterNamesModule());
//        mapper.registerModule(new Jdk8Module());
//        SimpleModule simpleModule = new SimpleModule();
//        simpleModule.addSerializer(Other.class, new MySerializable());
//        mapper.registerModule(simpleModule);
//        builder.configure(mapper);
//        return builder;
////        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(mapper);
////        return converter;
//    }
//
//    @Bean
//    @Primary
//    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
//        mapper.registerModule(new ParameterNamesModule());
//        mapper.registerModule(new Jdk8Module());
//        SimpleModule simpleModule = new SimpleModule();
//        simpleModule.addSerializer(Other.class, new MySerializable());
//        mapper.registerModule(simpleModule);
//
//        return mapper;
//    }
//
//    @Bean
//    public Module getModule() {
//        SimpleModule simpleModule = new SimpleModule();
//        simpleModule.addSerializer(Other.class, new MySerializable());
//        return simpleModule;
//    }
}
