package com.pie.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author LIN
 * @since JDK 1.8
 */
  /*
   @Component 作用:往容器中注册对象,在类上使用
    value 
    - 给容器中bean指定名字,如果不指定则类名首字母小写
    @Service 声明在Service层
    @Repository 声明在Dao层
    @Controller 声明在控制层
  */
@Component
@Data
public class Product {
    private String name;
    private BigDecimal price;
}
