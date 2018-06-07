package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.junit.Test;

import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Li");
		map.put(2, "Ma");
		map.put(3, "Kiss");
		map.put(4, "Ai");

		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> iter : entrySet) {
			System.out.println(iter.getKey() + " " + iter.getValue());
		}

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext())
			System.out.println(map.get(iterator.next()));
		for (int iter : keySet) {
			System.out.println(map.get(iter));
		}

		Collection<String> values = map.values();
		for (String item : values)
			System.out.println(item);
	}
	
	@Test
	public void Test1() throws Exception {
		Map<String, String> map = new HashMap<String, String>();

		map.put("1", "Li");
		map.put("2", "Ma");
		map.put("4", "Kiss");
		map.put("8", "Ai");

		Properties properties = new Properties();
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> iter : entrySet) {
			properties.setProperty(iter.getKey(), iter.getValue());
			//properties.put(iter.getKey(), iter.getValue());
		}
		
		FileOutputStream fos = new FileOutputStream(new File("abc.properties"));
		properties.store(fos, "a pratise");
		fos.flush();
		fos.close();
	}
	
	@Test
	public void Test2() throws Exception {
		Map<String, String> map = new HashMap<String, String>();

		
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File("abc.properties")));
		
		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		for(Entry<Object, Object> iter: entrySet){
			map.put((String)iter.getKey(), (String)iter.getValue());
			System.out.println((String)iter.getKey() + iter.getValue());
		}
	}
}
