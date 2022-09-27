package com.ty.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class UpdateUser {
	public static void main(String[] args) {
		User user=new User(1,"rajbala@gmail.com","rajbala123",1234l,"female");
		user.setId(1);
		UserDao userDao=new UserDao();
		User user1=userDao.updateUSer(user);	
		System.out.println(user1.getId());
		System.out.println(user1.getEmail());
		System.out.println(user1.getPassword());
		System.out.println(user1.getPhone());
		System.out.println(user1.getGender());
	}
}
