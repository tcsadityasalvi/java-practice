package com.tcs.listdemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;



public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println("after sorting"+numbers);
		
	}
	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		//System.out.println(numbers.get(0));
		
		 for (int count=0; count<20; count++) {
			 numbers.add(count);
		 }
		return numbers;
		
	}

}
