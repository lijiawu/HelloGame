package com.example.test;

public class TryCatchTest {

	public void tryCatchThrowTest() {
		try {
			int b = 2 / 0;
		} catch (ArithmeticException e) {
//			throw e;
			e.printStackTrace();
		}
		System.out.println("Hello,World.After Exception");
	}

	public static void main(String args[]) {
			new TryCatchTest().tryCatchThrowTest();
	}
}
