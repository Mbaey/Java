package com.bayes.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class PosPtest {

	public static void main(String[] args) throws Exception, IOException {
		HashMap<String, Float> posP = new HashMap<String, Float>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pos.txt"));
		posP = (HashMap<String, Float>) ois.readObject();
		ois.close();
		Set<Entry<String, Float>> entrySet = posP.entrySet();
		for(Entry<String, Float> e : entrySet){
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}

}
