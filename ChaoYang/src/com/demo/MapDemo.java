package com.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String> ();
		
		map.put(1, "Li");
		map.put(2, "Ma");
		map.put(3, "Kiss");
		map.put(4, "Ai");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> iter: entrySet){
			System.out.println(iter.getKey() + " " + iter.getValue());
		}
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext())
			System.out.println(map.get(iterator.next()));
		for(int iter : keySet){
			System.out.println(map.get(iter));
		}
		
		Collection<String> values = map.values();
		for(String item : values)
			System.out.println(item);
		
			
		
		
	}
}
