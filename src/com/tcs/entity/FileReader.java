package com.tcs.entity;

import java.util.Arrays; 

// import static java.util.Arrays.*;  //static import
public class FileReader {
	public static void main(String[] args) {
		int[] numbers = {4,5,6,7,9};
//		sort(numbers); //works with static import
		Arrays.sort(numbers);//works without static import
	}
}
