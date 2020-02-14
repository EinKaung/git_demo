package com.jdc;

public class Client {

	public static void main(String[] args) {
//		Calculateable cal = new Calculator();
//		System.out.println("Result : " + cal.sum(30, 20));
//		cal.doCalculate();
//		
//		cal = new Calculateable() {
//			@Override
//			public int sum(int num1, int num2) {
//				return num1 + num2;
//			}
//		};
//		
//		System.out.println("Sum value : " + cal.sum(100, 200));
//		
//		Calculateable cal = (a, b) -> a + b;
		
		doCalculate((a, b) -> a + b, 2000, 3000);
		
		Client c = new Client();
		
		doCalculate(c::add, 20, 40);
	
	}
	
	private int add(int num1, int num2) {
		return num1 + num2;
	}
	
	private static void doCalculate(Calculateable cal, int a, int b) {
		System.out.println(cal.sum(a, b));
	}
}
