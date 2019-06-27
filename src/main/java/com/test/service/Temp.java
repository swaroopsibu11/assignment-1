 package com.test.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Temp {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Naveen", 2);
		hm.put("Santosh", 3);
		hm.put("Ravi", 4);
		hm.put("Pramod", 1);
		System.out.println(hm);

		Map<String, Integer> hm1 = new TreeMap<String, Integer>(hm);
		System.out.println(hm1);

		Set<Entry<String, Integer>> set = hm.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return -o2.getValue().compareTo(o1.getValue());
			}
		});
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getValue());
		}

	}

}
