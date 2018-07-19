package com.oyr;

import com.oyr.user.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Create by 欧阳荣
 * 2018/5/17 0:58
 */
public class Test {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("consumer.xml");
        UserService service = app.getBean(UserService.class);
        String byName = service.findByName("1");
        System.out.println(byName);
        System.in.read();
    }

}
