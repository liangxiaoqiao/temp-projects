package com.colter.demo.controller;

import com.colter.demo.other.Other;
import com.colter.demo.other.UserDto;
import com.colter.demo.entity.User;
import com.colter.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liangchao
 * created on 2019/4/6 21:31
 * desc:
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public UserDto getUser(int id) {
        User user = userService.getUserById(id);
        UserDto dto = new UserDto(user);
        dto.setOther(new Other("a", "b"));
        return dto;
    }


}
