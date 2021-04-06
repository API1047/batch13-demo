package com.apisero;

public class SubstringofString {
	public static boolean isSubstring(String m, String s) {
		int [] arr = new int[26];
		for(int i = 0; i < s.length(); i++) {
			int q = s.charAt(i) - 'a';
			arr[s.charAt(i) - 'a']++;
		}
		boolean flag = true;
		for(int j = 0; j < m.length(); j++) {
			if(arr[m.charAt(j) - 'a'] == 0) {
				flag = false;
				break;
			}else {
				arr[m.charAt(j) - 'a']--;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isSubstring("sword", "thisworks"))
			System.out.println("YES");
		else {
			System.out.println("NO");
		}

	}

}
