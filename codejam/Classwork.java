package com.codejam;

import java.util.*;

public class Classwork {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < 9; i++) {
			arr.add(i * 5);
		}
		try {
			swap(arr, 0, 6);
			swap(arr, 0, 10);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
	}

	private static void swap(ArrayList<Integer> arr, int i, int j) {
		// TODO Auto-generated method stub
		try {
			int temp = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
		}catch(Exception e) {
			throw new IndexOutOfBoundsException();
		}
	}

}

