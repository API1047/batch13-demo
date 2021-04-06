package com.codejam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MoonsAndUmbrellas {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			int x = fs.nextInt();
			int y = fs.nextInt();
			String str = fs.next();
			int s = x;
			int b = y;
			if(x > y) {
				str = new StringBuilder(str).reverse().toString();
				s = y;
				b = x;
			}
			int cost = 0;
			int n = str.length();
			char prev = str.charAt(0);
			char cur = str.charAt(1);
			for(int i = 1; i < n - 1; i++) {
				if(prev != cur && cur != '?' && prev != '?') {
					if(cur == 'J') {
						cost += s;
					}else {
						cost += b;
					}
					prev = cur;
					cur = str.charAt(i + 1);
				}else if(cur == prev) {
					cost += 0;
					prev = cur;
					cur = str.charAt(i + 1);
				}
				else {
					if(prev == 'C') {
						cost += s;
						prev = 'J';
						cur = str.charAt(i + 1);
					}else {
						cost += b;
						prev = 'C';
						cur = str.charAt(i + 1);
					}
				}
			}
			System.out.println(cost);
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

