package com.ty.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class DeleteUser {
	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		UserDao userDao=new UserDao();
		Boolean user1=userDao.deleteUser(user.getId())	;
		System.out.println(user1);
	}
	}

