package com.test.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Anil", 2);
		m.put("Zaved", 3);
		m.put("Pavan", 4);
		m.put("Dravid", 5);
		m.put("Harish", 7);
		m.put("Manoj123567", 12345);
		m.put("Sunil", 9);
		m.put("Manoj123", 41);

		System.out.println("Before sorting: " + m);

		Map<String, Integer> m1 = new TreeMap<String, Integer>(m);
		System.out.println("After sorting: " + m1);

		System.out.println(m.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new)));

		System.out.println(m.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new)));

		Set s = m.entrySet();
		List<Entry<String, Integer>> l = new ArrayList<Entry<String, Integer>>(s);
		Collections.sort(l, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		for (Entry<String, Integer> e : l) {
			System.out.println(e.getValue());
		}
	}
}
