package com.apisero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			long n = fs.nextLong();
			long m = fs.nextLong();
			long x = fs.nextLong();
			long c = (long) Math.ceil((float)x / n);
			long r = x % n == 0 ? n : x % n;
			long ans = m * (r - 1) + c;
			System.out.println(ans);
		}
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt () {
			return Integer.parseInt(next());
		}
		long nextLong () {
			return Long.parseLong(next());
		}
	}

}

