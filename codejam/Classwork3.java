package com.codejam;

import java.util.*;

public class Classwork3 {

	public static void main(String[] args) {
		Map<Integer, String> set = new TreeMap<>();
		set.put(4, "Kerala");
		set.put(3, "Tamil Nadu");
		set.put(5, "Karnataka");
		set.put(1, "Maharashtra");
		set.put(2, "Telangana");
		StringBuilder str = new StringBuilder("");
		System.out.println("1>");
		for(Map.Entry<Integer, String> c: set.entrySet()) {
			str.insert(0, c + "\n");
		}
		System.out.println(str);
		System.out.println("2>");
		for(Map.Entry<Integer, String> c: set.entrySet()) {
			if(c.getKey() == 2 || c.getKey() == 5) continue;
			else System.out.println(c);
		}
		System.out.println();
		System.out.println("3>");
		for(Map.Entry<Integer, String> c: set.entrySet()) {
			if(c.getKey() > 3) {
				System.out.println(c);
			}
		}
		System.out.println();
		System.out.println("4>");
		for(Map.Entry<Integer, String> c: set.entrySet()) {
			if(c.getValue().compareToIgnoreCase("Maharashtra") <= 0) {
				System.out.println(c);
			}
		}
		System.out.println();
		System.out.println("5>");
		for(Map.Entry<Integer, String> c: set.entrySet()) {
			if(c.getValue().compareToIgnoreCase("Karnataka") > 0) {
				System.out.println(c);
			}
		}
		System.out.println();
		System.out.println("6>");
		for(Map.Entry<Integer, String> c: set.entrySet()) {
			if(c.getValue().compareToIgnoreCase("Kerala") == 0 || c.getValue().compareToIgnoreCase("Telangana") == 0) {
				continue;
			}else {
				System.out.println(c);
			}
		}
		System.out.println();
//		for(char c: set) {
//			if(c > 'L') break;
//			else System.out.print(c + " ");
//		}
//		System.out.println();
//
//		for(char c: set) {
//			if(c <= 'N') continue;
//			else System.out.print(c + " ");
//		}
	}

	
}
