package com.entity.duotai;

public class DemoTest1 {
	public static void main(String[] args) {	
		Animal am = new Cat();
		am.eat();
		am.sleep();
		am.run();
		//am.catchMouse();������ע�͵����Ȼ��˵��
	    //System.out.println(am.name);//������ע�ͣ�����˵��
		System.out.println(am.num);
		System.out.println(am.age);
		
		System.out.println("*****<br>***********");
		
		Cat cat = (Cat) am;
		cat.catchMouse();
		}

}
