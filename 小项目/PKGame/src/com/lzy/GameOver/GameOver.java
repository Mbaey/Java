package com.lzy.GameOver;

public class GameOver {
	public static void sayShuYing(int ASuccess) {
		
		String s = ASuccess > 0? "A Ӯ��" : "BӮ��";
		if(ASuccess == 0)
			System.out.println("ƽ��");
		else
			System.out.println(s);
	}
}
