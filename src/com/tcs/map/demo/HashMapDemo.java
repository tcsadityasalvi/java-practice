package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
	//	createHashMap();
	}
	
	private static void treeMap() {
		Map<String, Float> mathScores = new TreeMap<String, Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put("Student" +i, new Float(100 * Math.random() ));
		}
		boolean exits = mathScores.containsKey("Student1");
		System.out.println(exits);
		mathScores.put("student1", 34F);
		System.out.println(mathScores);
	}

}
