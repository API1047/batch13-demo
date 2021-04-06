package com.codejam;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Integer> arrl1 = new ArrayList<>();
		arrl1.add(1);
		arrl1.add(2);
		arrl1.add(3);
		arrl1.add(4);
		ArrayList<Integer> arrl2 = (ArrayList<Integer>) arrl1.clone();
		List<Integer> arrl3 = new ArrayList<>();
		arrl3.add(3);
		arrl3.add(1);
		arrl3.add(4);
		arrl3.add(2);
//		Collections.sort(arrl1);
//		Collections.max(arrl1);
//		Collections.min(arrl2);
		System.out.println(arrl3.containsAll(arrl2));
		System.out.println(arrl2.equals(arrl1));
		
		List<Integer> ll1 = new LinkedList<Integer>();
		
		Queue<Integer> pq = new ArrayDeque<>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.forEach((i) -> System.out.print(i + " "));
		
		System.out.println("pq: " + pq);
		Set<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(-1000);
		set.add(100000);
		System.out.println(set);
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Saksham");
		map.put(2, "Vinay");
		map.put(3, "Raghu");
		map.put(4, "Hritick");
//		map.remove(4);
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
		}
		if(map.containsKey(4)) map.put(4, "Deepak");
		else System.out.println("Does not contain value");
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
		}
//		map.put(null, null);
//		map.put(null, null);
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
		}
//		map.put(null, "Bangalore");
//		map.put(null, "Delhi");
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
		}
		
		map.put(1, null);
		map.put(7, null);
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
		}
		map.put(5, "Saksham Kumar");
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
		}
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
		
		Vector<Integer> vec = new Vector<>();
		Vector<Integer> vec1 = new Vector<>();
		for(int i = 0; i < 100; i += 2) {
			vec.add(i);
			
		}
		for(int i = 10; i >= 0; i -= 2) {
			vec1.add(i);
			
		}
		System.out.println(vec1);
		System.out.println(vec);
		System.out.println(vec.containsAll(vec1));
		Hashtable<Integer, Integer> table = new Hashtable<>();
//		table.put(1, null);
		
		Iterator it = vec.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
	
}

