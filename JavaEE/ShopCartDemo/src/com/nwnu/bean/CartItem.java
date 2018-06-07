package com.nwnu.bean;

public class CartItem {
	//product id
	private int id;
    private Product product;
    private int num;
    
    @Override
	public String toString() {
		return "CartItem [id=" + id + ", product=" + product + ", num=" + num + "]";
	}
	public CartItem(int id, Product product, int num) {
		super();
		this.id = id;
		this.product = product;
		this.num = num;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}
