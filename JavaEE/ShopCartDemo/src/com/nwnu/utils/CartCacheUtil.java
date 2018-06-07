package com.nwnu.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nwnu.bean.Cart;

public class CartCacheUtil {

	public static Cart getInstance(int uid, String path) {
		String JsonStr="";
		File file = new File(uid+".json");
		
		System.out.println(file.getAbsolutePath());
		if(file.exists()){
			
			try(BufferedReader reader = new BufferedReader(new FileReader(path+""+uid+".json"))) {
				JsonStr = reader.readLine();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Cart cart;
			if(JsonStr==""){
				cart = new Cart();
			}
			else{
				JSONObject parseObject = JSON.parseObject(JsonStr);
				cart = parseObject.toJavaObject(Cart.class);
//				uid= parseObject.getInteger("uid");
//				float sum=parseObject.getFloat("sum");
//				Map<String, Integer> products= new HashMap<String, Integer>();
//				
//				Map productsJSON = parseObject.getJSONObject("products");
//				products=productsJSON;
//				
////			Set<Entry<String, Object>> entrySet = productsJSON.entrySet();
////			for(Entry<String, Object> item : entrySet){
////				System.out.println(item);
//////				String key = item.getKey();
//////				Object value =  item.getValue();
//////				products.put( Integer.parseInt(key), (int)value);
////			}
//				cart = new Cart(uid, products, sum);
				
			}
			return cart;
		}
		return new Cart();
	}
	
	public static void main(String[] args) {
		File file = new File("");
		System.out.println(file.getAbsolutePath());
		System.out.println(CartCacheUtil.getInstance(2, file.getAbsolutePath()+"/"));
	}
}
