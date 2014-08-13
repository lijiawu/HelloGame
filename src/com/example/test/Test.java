package com.example.test;

public class Test {
	int a;
	static int b;

	final static int abc__;
	static {
		abc__ = 1;
	}

	final int abc_;
	final int abc;
	{
		abc = 1;
	}

	public Test() {
		abc_ = 1;
	}

	public static void HelloMethod() {
		int a = 0;
		System.out.println("a=" + a);
	}

	/**
	 * @param args
	 */
	public static class innerclass {
		int c;

		public void Method() {
			System.out.println("Method");
		}

		public static void Method1() {
			System.out.println("static Method1");
		}
	}

	public class innerclass1 {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.HelloMethod();
		new Test.innerclass().Method();
		Test.innerclass.Method1();
		statictest a = new statictest("hello");
		System.out.println(a.str.toString());
		statictest b = new statictest("world");
		System.out.println(a.str.toString());

	}
}

class statictest {
	static String str;

	public statictest(String str) {
		this.str = new String(str);
	}
}