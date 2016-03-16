package com.tch.test.dubbo.provider.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
            context.start();
            context.registerShutdownHook();
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            context.close();
        }
    }
}