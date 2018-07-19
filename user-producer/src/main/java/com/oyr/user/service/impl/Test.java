package com.oyr.user.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Create by 欧阳荣
 * 2018/5/17 0:42
 */
public class Test {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("provider.xml");
        app.start();//启动
        System.out.println("服务提供者启动！！！");
        System.in.read();//阻塞
    }

    public void test1(){
        System.out.println("my is test1");
    }

}
