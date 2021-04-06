package com.apisero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class D {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			int n = fs.nextInt();
			int unique = 0;
			HashMap<Integer,  Integer> map = new HashMap<>();
			ArrayList<Integer>  al = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				int m = fs.nextInt();
				map.put(m, map.getOrDefault(m, 0) + 1);
			}
			for(Map.Entry<Integer, Integer> entry: map.entrySet()){
				int value = entry.getValue();
				if(value > 1) {
					al.add(value);
				}else {
					unique++;
				}
			}
			Collections.sort(al);
			int k = al.size() - 1;
			int minus = 0;
			int add = 0;
			for(int i = 0; i < al.size() - 1; i++) {
				int m = al.get(i) - minus;
				minus += m / (k - i);
				add += m % (k - i);
			}
			int z = al.size() > 0? al.get(al.size() - 1) - minus - add: 0;
			if(z > unique) System.out.println(z - unique);
			else if(z == unique) System.out.println(0);
			else {
				if((unique - z) % 2 == 0) System.out.println(0);
				else System.out.println(1);
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

