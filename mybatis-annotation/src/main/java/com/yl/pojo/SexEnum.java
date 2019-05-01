package com.yl.pojo;

public enum  SexEnum {
    MALE(1,"男"),FEMALE(0,"女");
    private String name;
    private int id;
    SexEnum(int id,String name){
        this.id = id;
        this.name = name;
    }

    public static SexEnum getSexById(int id){
        for (SexEnum sex :
                SexEnum.values()) {
            if (sex.id == id)
                return sex;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
