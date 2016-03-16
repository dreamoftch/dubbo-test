package com.tch.test.dubbo.consumer.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
            context.start();
            context.registerShutdownHook();
            MyClient demoService = (MyClient) context.getBean("myClient"); // 获取远程服务代理
            demoService.process();
            context.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(context != null){
                context.close();
            }
        }

    }

}