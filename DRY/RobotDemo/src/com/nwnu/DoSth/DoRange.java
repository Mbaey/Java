package com.nwnu.DoSth;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import com.nwnu.utils.RobotUtils;

public class DoRange {
	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();
		int[] ks = new int[] {KeyEvent.VK_ALT,  KeyEvent.VK_TAB};
//		robot.keyPress(KeyEvent.VK_ALT);
		RobotUtils.pressKeys(robot, ks);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			String s = Integer.toString(i);
			for (int j = 0; j < s.length(); j++) {
				int j2 = KeyEvent.VK_0+s.charAt(j)-'0';
//				System.out.println(j2);
//				System.out.println(KeyEvent.VK_0);
//				System.out.println(KeyEvent.VK_1);
				arrayList.add(j2);
			}
			arrayList.add(KeyEvent.VK_ENTER);
			
			RobotUtils.pressKeys(robot,  arrayList);
		}
		
		
	}
}
