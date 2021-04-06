package com.apisero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class C {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			String a = fs.next();
			String b = fs.next();
			int max = Integer.MIN_VALUE;
			int dp[][] = new int[a.length() + 1][b.length() + 1];
			for(int i = 1; i < dp.length; i++) {
				for(int j = 1; j < dp[0].length; j++) {
					if(a.charAt(i - 1) == b.charAt(j - 1)) {
						dp[i][j] = dp[i - 1][j - 1] + 1;
						max = Math.max(max, dp[i][j]);
					}
				}
			}
			System.out.println(a.length() + b.length() - 2 * max);
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

