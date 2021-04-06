package com.apisero;

public class ImplementANDOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 100; i+=2) {
			System.out.println(i + "&" + (i + 1) + ": " + (i & (i + 1)));
		}
	}

}
