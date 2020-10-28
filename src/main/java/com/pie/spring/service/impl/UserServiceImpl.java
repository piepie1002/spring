package com.pie.spring.service.impl;

import com.pie.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author LIN
 * @since JDK 1.8
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public int save() {
        System.out.println("hello");
        return 0;
    }
}
