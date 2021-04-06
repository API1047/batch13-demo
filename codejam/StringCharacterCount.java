package com.codejam;

import java.util.*;

public class StringCharacterCount {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Map<Character, Integer> freq = new LinkedHashMap<Character, Integer>();
		map.put(9, "Delhi");
		map.put(8, "Mumbai");
		map.put(10, "Varanasi");
		map.put(7, "Hyderabad");
		map.put(11, "Agra");
		int sum = 0;
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			sum += m.getKey();
			String s = m.getValue();
			for(int i = 0; i < s.length(); i++) {
				freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
			}
		}
		System.out.println(sum);
		System.out.println(freq);
		for(char c: freq.keySet()) {
			System.out.print(c + " ");
		}
		System.out.println();
		for(int m: freq.values()) {
			System.out.print(m + " ");
		}
		
	}
}

