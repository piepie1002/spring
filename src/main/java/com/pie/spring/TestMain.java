package com.pie.spring;

import com.pie.spring.bean.Product;
import com.pie.spring.bean.User;
import com.pie.spring.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class TestMain {
    public static void main(String[] args) {
        String path = "classpath:spring-context.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.toString());
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product.toString());
        UserController userController = applicationContext.getBean("userController", UserController.class);
        System.out.println(userController.userService.save());
        System.out.println(userController);
    }
}
