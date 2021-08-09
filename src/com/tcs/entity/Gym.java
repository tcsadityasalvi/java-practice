package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;

public class Gym {
	static List<User> users = new ArrayList<User>();
	public static void main(String[] args) {
		createUser();
	}

	private static void createUser() {
		for (int i = 0; i < 10; i++) {
			User u1 = new User();
			u1.setName("Shahid" + i);
			u1.setAge((byte)(19*i));
			users.add(u1);
		}
		users.get(0).workout();
		System.out.println(users);
		
	}
}