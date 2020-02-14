package com.jdc;

import java.util.Arrays;

public class MethodRefDemo {
	
	public MethodRefDemo() {
	}
	
	public MethodRefDemo(int i) {
		System.out.println(i * 2);
	}

	public static void main(String[] args) {
		Arrays.asList(1, 2, 3, 4, 5, 6)
		//.forEach(e -> System.out.println(2 * e));
		//.forEach(System.out::println);
		.forEach(new MethodRefDemo()::multiplyByTwo); //instance method ref
		//.forEach(MethodRefDemo::twice); //static method ref
		//.forEach(MethodRefDemo::new); //constructor ref
	}
	
	@SuppressWarnings("unused")
	private static void twice(int i) {
		System.out.println(i * 2);
	}
	
	private void multiplyByTwo(int i) {
		System.out.println(i * 2);
	}

}
