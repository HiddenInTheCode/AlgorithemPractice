package com.uchain.javafoundation;

import java.io.Serializable;

/**
 * 关键字transient的使用
 */
public class User implements Serializable {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //关键字限定修饰符
    private transient String password;


    public User(){

    }

}
