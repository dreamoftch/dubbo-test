package com.tch.test.dubbo.service;


import javax.ws.rs.POST;

import com.tch.test.dubbo.model.User;


public interface MyService {

	
	@POST
    String getCurrentTime();
    
	@POST
    String helloWorld(User user);

}