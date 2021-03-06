package com.tch.test.dubbo.consumer.test;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tch.test.dubbo.model.User;
import com.tch.test.dubbo.service.MyService;

@Component
public class MyClient {

    @Reference
    private MyService demoService;
    
    public void process() throws Exception {
        int count = 100000;
        User user = new User();
        user.setAge(25);
        user.setUsername("超辉");
        user.setAddress("上海");
        for(int i = 0; i < count; i++){
            String currentTime = demoService.getCurrentTime(); // 执行远程方法
            String helloWrold = demoService.helloWorld(user);
            System.out.println(helloWrold + ", " + currentTime); // 显示调用结果
            TimeUnit.SECONDS.sleep(2L);
        }
    }

}
