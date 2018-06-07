package com.nwnu.bean;

import java.util.Map;

public class Cart {
	int uid;
	//Produce id -> num  
	//放入数据库的话除法用json 不然还得把CartItem存入。太复杂
	Map<String, Integer> products;
	float sum;
//	int CartItemId;
	public Cart(int uid, Map<String, Integer> products, float sum) {
		super();
		this.uid = uid;
		this.products = products;
		this.sum = sum;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cart [uid=" + uid + ", products=" + products + ", sum=" + sum + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Map<String, Integer> getProducts() {
		return products;
	}
	public void setProducts(Map<String, Integer> products) {
		this.products = products;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	
	
		
}
