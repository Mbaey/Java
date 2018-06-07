package com.nwnu.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nwnu.bean.Cart;

public class JsonSaveDemo {
	public static void main(String[] args){
		Cart cart = new Cart();
		cart.setUid(2);
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put(2+"", 1);
		hashMap.put(1+"", 1);
		cart.setProducts(hashMap);
		cart.setSum(947.739f);
		
		try {
			File file = new File(cart.getUid()+".json");
			file.createNewFile();
			if(file == null){
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			
			fw.write(JSON.toJSONString(cart));
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	 public void map2JSON(){ 
		    Map map = new HashMap(); 
		    map.put(4,"aaa"); 
		    map.put(4,"bbb"); 
		    map.put(5,"ccc"); 
		    String json=JSON.toJSONString(map); 
		    System.out.println(json); 
		    Map map1 = JSON.parseObject(json); 
		    for (Object o : map1.entrySet()) { 
		      Map.Entry<String,String> entry = (Map.Entry<String,String>)o; 
		      System.out.println(entry.getKey()+"--->"+entry.getValue()); 
		    } 
		  } 
	@Test
	public void save1(){
		System.out.println("HHH");
		Cart cart = new Cart();
		cart.setUid(2);
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put(2+"", 1);
		hashMap.put(1+"", 1);
		cart.setProducts(hashMap);
		cart.setSum(947.739f);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("uid", cart.getUid());
		jsonObject.put("sum", cart.getSum());
		
		JSONObject jsonObject2 = new JSONObject();
		
		jsonObject.put("products", cart.getProducts());
		String jsonString = jsonObject.toString();
		System.out.println(jsonString);
		try {
			File file = new File(cart.getUid()+".json");
			file.createNewFile();
			if(file == null){
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			
			fw.write(jsonString);
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
