package com.tcs.entity;

public class MethodOverloading {
	public static void main(String[] args) {
		User1 user1 = new User1();
		user1.work();
		user1.work(4);
		user1.work("4");
	}
}

class User1 {
	public void work() {
		System.out.println("user is working");
	}

	public void work(int duration) {
		System.out.println("user is working for " + duration + " hours");
	}

	public void work(String duration) {
		System.out.println("user is working for " + duration + " hours");
	}
}

class Employee1 extends User1 {
	@Override
	public void work() {
		System.out.println("Emp is working");
	}
}
