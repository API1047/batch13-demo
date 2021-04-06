package com.apisero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class E {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			int n = fs.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = fs.nextInt();
			}
			Set<Integer> set = new HashSet<>();
			StringBuilder max = new StringBuilder("");
			StringBuilder min = new StringBuilder("");
			int count = 1;
			for(int i = 0; i < n; i++) {
				while(i < n - 1 && arr[i] == arr[i + 1]) {
					i++;
					count++;
				}
				int m = arr[i];
				while(count > 0) {
					if(!set.contains(m)) {
						max.append(m).append(" ");
						set.add(m);
						count--;
					}	
					m--; 
				}
				count = 1;
			}
			set.clear();
			int cl = 1;
			for(int i = 0; i < n; i++) {
				while(i < n - 1 && arr[i] == arr[i + 1]) {
					i++;
					count++;
				}
				int m = arr[i];
				min.append(m).append(" ");
				set.add(m);
				while(count > 1) {
					if(!set.contains(cl)) {
						min.append(cl).append(" ");
						set.add(m);
						count--;
					}	
					cl++; 
				}
				count = 1;
			}
			System.out.println(min);
			System.out.println(max);
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

 