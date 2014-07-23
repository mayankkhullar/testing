package com.mayank.MyAppService;

import java.util.List;

import com.mayank.MyAppDao.UserDao;
import com.mayank.MyAppDomain.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class UserServiceImple implements UserService{
	
@Autowired
	UserDao userDao; 


public List<test> getList()
{
	return userDao.getList();
}
}
