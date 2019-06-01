package com.yl.mq.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(of = "id")
public class User implements Serializable {

    private Long id;

    private String userName;
}
