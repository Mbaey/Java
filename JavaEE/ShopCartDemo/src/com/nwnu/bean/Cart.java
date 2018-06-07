package com.nwnu.bean;

import java.util.Map;

public class Cart {
	int uid;
	//Produce id -> num  
	//�������ݿ�Ļ�������json ��Ȼ���ð�CartItem���롣̫����
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
