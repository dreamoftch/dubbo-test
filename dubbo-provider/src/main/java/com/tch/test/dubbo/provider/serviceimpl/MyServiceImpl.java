package com.tch.test.dubbo.provider.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.tch.test.dubbo.service.MyService;

public class MyServiceImpl implements MyService {

    public String getCurrentTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd MM:hh:ss");
        return "当前时间：" + format.format(new Date());
    }

    public String helloWorld() {
        return "helloWorld";
    }

}