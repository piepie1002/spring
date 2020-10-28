package com.pie.spring.bean;

import lombok.Data;

import java.util.List;

/**
 * @author LIN
 * @since JDK 1.8
 */
@Data
public class User {
    private String username;
    private String password;
    private Address address;
    private List<Integer>list;
    
    //初始化方法是构造方法执行完成之后自动执行的第一个方法
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        this.username=null;
        System.out.println("对象被回收...");
    }
}
