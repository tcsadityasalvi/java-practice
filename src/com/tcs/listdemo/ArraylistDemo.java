package com.tcs.listdemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		//sortList(numbers);
		//filterList(numbers);
		otherOps(numbers);
		
	}
	
	private static void otherOps(List<Integer> numbers) {
		System.out.println(numbers);
		numbers.remove(11);
		System.out.println(numbers);
		numbers.add(1,50);
		System.out.println(numbers);
	}

	public static void filterList(List<Integer> numbers) {
		numbers.forEach(number ->{
			System.out.println(number % 2 == 0);
		});
		List<Integer> filtered = numbers.stream()
				.filter((number)-> number % 2 ==0)
				.collect(Collectors.toList());
				System.out.println(filtered);

	}

	private static void sortList(List<Integer> numbers) {
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		System.out.println("after sorting" + numbers);
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		// System.out.println(numbers.get(0));

		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;

	}

}
