package com.demo;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i = 222;
/*		try {

			Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();
			scanner.close();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}*/

		
			try {
				int b =Integer.parseInt("1234fds") ; //NumberFormatException
				System.out.println(b);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("*******");
			}
		
		
		
		System.out.println(i);
	}
}
