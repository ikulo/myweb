package com.myweb.user.dao;

import com.myweb.user.entity.User;

public interface UserDao {
	
	public User getUser(int userId);
    
    public void addUser(User user);
    
    public void updateUser(User user);
    
    public void deleteUser(int UserId);

}
