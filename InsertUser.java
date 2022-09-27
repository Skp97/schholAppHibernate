package com.ty.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class InsertUser {
	public static void main(String[] args) {
		User user=new User(1,"skp@gmail.com","skp123",86581l,"Male");
		
		UserDao userDao=new UserDao();
		userDao.saveUser(user);
	}
}
