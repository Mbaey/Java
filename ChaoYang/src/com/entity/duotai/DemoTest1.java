package com.entity.duotai;

public class DemoTest1 {
	public static void main(String[] args) {	
		Animal am = new Cat();
		am.eat();
		am.sleep();
		am.run();
		//am.catchMouse();这里先注释掉，等会会说明
	    //System.out.println(am.name);//这里先注释，待会说明
		System.out.println(am.num);
		System.out.println(am.age);
		
		System.out.println("*****<br>***********");
		
		Cat cat = (Cat) am;
		cat.catchMouse();
		}

}
