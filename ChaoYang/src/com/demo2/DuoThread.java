package com.demo2;


public class DuoThread {
	
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		System.out.println("**********");
	}
}
