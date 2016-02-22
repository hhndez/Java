package com.test;

import java.util.function.BinaryOperator;

/**
 * Created by hhernandez on 24/06/15.
 */
public class Test01 {
	public static void main(final String args[]) {
		System.out.println("Test...");
		Runnable noArguments = () -> System.out.println("Hello");
		noArguments.run();

		Runnable multiStatement = () -> {
			System.out.println("Hello");
			System.out.println("World");
		};

		multiStatement.run();


		BinaryOperator<Long> add = (x, y) -> x + y;

		BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

		//Final no es necesario declararlo, aunque se comporte como tal
//		String name = getName();

	}

	private static String getName() {
		return "test";
	}
}
