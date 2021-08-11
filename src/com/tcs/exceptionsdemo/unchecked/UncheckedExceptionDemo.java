package com.tcs.exceptionsdemo.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.age=61;
		user.work();
	}
}

class User {
	int age = 10;

	public void work() {
		if (age <= 18) {
			throw new UnderAgeException("No child labor");
//			System.out.println("unreachable code");
		}else if(age>60) {
			throw new OverAgeException("age should not be > than 60 years");
		}
	}
}


