package com.pie.spring.controller;

import com.pie.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author LIN
 * @since JDK 1.8
 */
@Controller
public class UserController {
    @Autowired
    public UserService userService;
    public void sayhello(){
        int save =userService.save();
    }
}
