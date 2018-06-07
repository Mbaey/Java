package com.bayes.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

public class ClassifyTest {
	public static HashMap<String, Float> posP = new HashMap<String, Float>();
	public static HashMap<String, Float> negP = new HashMap<String, Float>();
	public static void main(String[] args) throws Exception, IOException {
		HashSet<String> useless = new HashSet<>();
		
		getUseless(useless);
		getP();
//		Set<Entry<String, Float>> entrySet = negP.entrySet();
//		for(Entry<String, Float> s: entrySet){
//			System.out.println(s.getKey() + "      "+ s.getValue());
//		}
		float testP = getTestP(useless);
		float testN = getTestN(useless);
		
		if(Float.compare(testP, testN)  > 0)
			System.out.println("pos");
		else
			System.out.println("neg");
		System.out.println(testP);
		System.out.println(testN);
		
	}
	
	private static void getP() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pos.txt"));
		posP = (HashMap<String, Float>) ois.readObject();
		ois.close();
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("neg.txt"));
		negP = (HashMap<String, Float>) ois2.readObject();
		ois.close();
	}
	private static void getUseless(HashSet<String> useless) {
		String[] uselessStr = { ".", ":", "a", "the", ",", "\"", "/", "(", ")" };
		for (String s : uselessStr) {
			useless.add(s);
		}
	}
	
	private static float getTestP(HashSet<String> useless)
			throws FileNotFoundException, IOException {
		HashMap<String, Integer> testPP = new HashMap<String, Integer>();
		String path = "test/pos";
		File file = new File(path);
		String[] list = file.list();
		for (String filename : list) {
			File file2 = new File(path + "/" + filename);
			FileReader fr = new FileReader(file2);

			char[] buf = new char[(int) file2.length()];
			fr.read(buf);
			String res = new String(buf);
			String[] split = res.split(" ");
			for (String word : split) {
				if (!useless.contains(word)) {
					if (testPP.containsKey(word)) {
						int t = testPP.get(word);
						testPP.put(word, ++t);
					} else {
						testPP.put(word, 1);
					}
				}
			}

			fr.close();
			break;//测试的时候用
		}

		Set<Entry<String, Integer>> entrySet = testPP.entrySet();
		float sum = 0;
		for (Entry<String, Integer> e : entrySet) {
			// System.out.println(e.getKey() + e.getValue());
			if(posP.containsKey(e.getKey()))
				sum += e.getValue() * posP.get(e.getKey());
		}
		return sum;
	}
	private static float getTestN(HashSet<String> useless)
			throws FileNotFoundException, IOException {
		HashMap<String, Integer> testNP = new HashMap<String, Integer>();
		String path = "test/neg";
		File file = new File(path);
		String[] list = file.list();
		for (String filename : list) {
			File file2 = new File(path + "/" + filename);
			FileReader fr = new FileReader(file2);
			
			char[] buf = new char[(int) file2.length()];
			fr.read(buf);
			String res = new String(buf);
			String[] split = res.split(" ");
			for (String word : split) {
				if (!useless.contains(word)) {
					if (testNP.containsKey(word)) {
						int t = testNP.get(word);
						testNP.put(word, ++t);
					} else {
						testNP.put(word, 1);
					}
				}
			}
			
			fr.close();
			break;//测试的时候用
		}
		
		Set<Entry<String, Integer>> entrySet = testNP.entrySet();
		float sum = 0;
		for (Entry<String, Integer> e : entrySet) {
			// System.out.println(e.getKey() + e.getValue());
			if(negP.containsKey(e.getKey()))
				sum += e.getValue() * negP.get(e.getKey());
		}
		return sum;
	}
}
