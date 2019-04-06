package com.colter.demo.dto;

import com.colter.demo.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.BeanUtils;

import java.time.ZonedDateTime;

/**
 * @author liangchao
 * created on 2019/4/6 23:12
 * desc:
 */
public class UserDto {

    private long id;
    private long userId;
    private String userName;
    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private ZonedDateTime insertTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private ZonedDateTime updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public ZonedDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(ZonedDateTime insertTime) {
        this.insertTime = insertTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    public ZonedDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(ZonedDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public UserDto(User user) {
        BeanUtils.copyProperties(user, this);
    }
}
