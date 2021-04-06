package com.codejam;

import java.util.*;

public class Classwork2 {

	public static void main(String[] args) {
		Set<Character> set = new TreeSet<Character>();
		set.add('L');
		set.add('M');
		set.add('N');
		set.add('O');
		set.add('P');
		set.add('Q');
		StringBuilder str = new StringBuilder("");
		for(char c: set) {
			System.out.print(c + " ");
		}
		System.out.println();
		for(char c: set) {
			str.insert(0, c + " ");
		}
		System.out.println(str);

		for(char c: set) {
			if(c == 'Q') continue;
			else System.out.print(c + " ");
		}
		System.out.println();

		for(char c: set) {
			if(c > 'L') break;
			else System.out.print(c + " ");
		}
		System.out.println();

		for(char c: set) {
			if(c <= 'N') continue;
			else System.out.print(c + " ");
		}
	}

	
}
