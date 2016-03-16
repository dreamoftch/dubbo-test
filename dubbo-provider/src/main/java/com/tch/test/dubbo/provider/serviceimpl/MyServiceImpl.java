package com.tch.test.dubbo.provider.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import com.tch.test.dubbo.service.MyService;

public class MyServiceImpl implements MyService {

    private static final AtomicInteger atomicInteger = new AtomicInteger(1);
    
    @Override
    public String getCurrentTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd MM:hh:ss");
        return "当前时间：" + format.format(new Date());
    }

    @Override
    public String helloWorld() {
        return "helloWorld-" + atomicInteger.getAndIncrement();
    }

}