package com.yl.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String username;
    private SexEnum sex;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
        UserInfo userInfo = new UserInfo();

    }
}
