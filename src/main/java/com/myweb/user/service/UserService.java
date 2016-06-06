package com.myweb.user.service;

import com.myweb.user.dao.UserDao;
import com.myweb.user.entity.User;

public interface UserService {

	public void setUserDao(UserDao userDao);
	
	public User getUserById(int userId);
	
}
