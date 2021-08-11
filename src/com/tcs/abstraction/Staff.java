package com.tcs.abstraction;

public abstract class Staff {
	private String name;
	
	public void fillTimesheet() {
		System.out.println(name+"has filled the timesheet");

}
	public abstract void work();
	
}

class HR extends Staff {
	@Override
	public void work() {
		System.out.println("HR is working");
		
	}
}

class Guard extends Staff {
	@Override
	public void work() {
		System.out.println("Guard is working");
		
	}
}
