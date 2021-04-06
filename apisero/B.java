package com.apisero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class B {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			int n = fs.nextInt();
			int k = fs.nextInt();
			String str = fs.next();
			ArrayList<Integer> arr = new ArrayList<>();
			int ans = 0;
			for(int i = 0; i < n; i++){
				if(str.charAt(i) != '.') {
					arr.add(i);
				}
			}
			if(arr.size() == 1) System.out.println(1);
			else if(arr.size() == 2) System.out.println(2);
			else {
				int lastPos = arr.get(0);
				ans++;
				for(int i = 1; i < arr.size(); i++) {
					if(arr.get(i) - lastPos > k) {
						lastPos = arr.get(i - 1);
						ans++;
					}
				}
				if(lastPos != arr.get(arr.size() - 1)) ans++;
				System.out.println(ans);
			}
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

