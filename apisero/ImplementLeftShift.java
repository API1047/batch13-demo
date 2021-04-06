package com.apisero;

public class ImplementLeftShift {
	public static void main(String[] args) {
		System.out.println("Left Shift of values divisible by 4: ");
		for(int i = 0; i <= 100; i++) {
			if(i % 4 == 0) {
				System.out.println(i + "<<1: " + (i << 1));
			}
		}
		System.out.println("Left Shift of values divisible by 7: ");
		for(int i = 0; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.println(i + "<<1: " + (i << 1));
			}
		}
	}
}
