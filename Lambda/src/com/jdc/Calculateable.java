package com.jdc;

@FunctionalInterface
public interface Calculateable {
	int sum(int num1, int num2);
	//int sub(int num1, int num2);
	
	
	default void doCalculate() {
		System.out.println("call docalculate");
	}
}
