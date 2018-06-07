package com.lzy.GameOver;

public class GameOver {
	public static void sayShuYing(int ASuccess) {
		
		String s = ASuccess > 0? "A 赢了" : "B赢了";
		if(ASuccess == 0)
			System.out.println("平局");
		else
			System.out.println(s);
	}
}
