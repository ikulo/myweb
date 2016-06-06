package com.myweb.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myweb.user.dao.UserDao;
import com.myweb.user.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	private UserDao userDao;

	public User getUserById(int userId) {
		return this.userDao.getUser(userId);
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


}
