package com.bayes.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class GetPosAndNegP {
	HashMap<String, Integer> getMapping(String file) {

		return null;
	}

	public static void main(String[] args) throws Exception {
		HashSet<String> useless = new HashSet<>();
		getUseless(useless);
		HashMap<String, Float> posP = new HashMap<String, Float>();

		getPosP(useless, posP);
		Set<Entry<String, Float>> entrySet = posP.entrySet();
		for(Entry<String, Float> e : entrySet){
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("neg.txt"));
		oos.writeObject(posP);
		oos.flush();
		oos.close();

	}

	private static void getPosP(HashSet<String> useless, HashMap<String, Float> posP)
			throws FileNotFoundException, IOException {
		HashMap<String, Integer> posInt = new HashMap<String, Integer>();
		String path = "tokens/neg";
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
					if (posInt.containsKey(word)) {
						int t = posInt.get(word);
						posInt.put(word, ++t);
					} else {
						posInt.put(word, 1);
					}
				}
			}

			fr.close();
//			break;≤‚ ‘µƒ ±∫Ú”√
		}

		Set<Entry<String, Integer>> entrySet = posInt.entrySet();
		float sum = 0;
		for (Entry<String, Integer> e : entrySet) {
			// System.out.println(e.getKey() + e.getValue());
			sum += e.getValue();
		}

		for (Entry<String, Integer> e : entrySet) {
			posP.put(e.getKey(), e.getValue() / sum);
		}
	}

	private static void getUseless(HashSet<String> useless) {
		String[] uselessStr = { ".", ":", "a", "the", ",", "\"", "/", "(", ")" };
		for (String s : uselessStr) {
			useless.add(s);
		}
	}
}
