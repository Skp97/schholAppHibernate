package com.ty.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class FindUser {
	public static void main(String[] args) {
		User user=new User(1,"kp@gmail.com","kp123",8658l,"Male");
		
		UserDao userDao=new UserDao();
		User user1=userDao.findUserById(1);
		System.out.println(user1.getId());
		System.out.println(user1.getEmail());
		System.out.println(user1.getPassword());
		System.out.println(user1.getPhone());
		System.out.println(user1.getGender());
	}
}
