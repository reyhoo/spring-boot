package com.yl.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class UserInfo {

    private Long id;

    private String name;
}
