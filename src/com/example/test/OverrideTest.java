package com.example.test;

public class OverrideTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("隐藏测试————————");

		System.out.println("引用类型为Father，即Father son=...");
		Father son1 = new Son();
		son1.StaticMethod();
		System.out.println("引用类型为Son，即Son son=...");
		Son son2 = new Son();
		son2.StaticMethod();

		System.out
				.println("个人发现，之前不知道，希望大家别见笑：Son不具有，Father具有的静态方法，Son.Father的静态方法也是可以的");
		Son.OnlyFatherStaticMethod();
	}
}

class Father {
	// 隐藏测试，隐藏仅限于Father跟Son同名方法都是Static的时候，具体调用那个函数，看该对象的引用类型是什么
	// Ps:在就是同名的情况仅仅接受的情况是：相同的方法名称，相同的参数列表，及相同的返回类型（或者子类的方法的返回类型是父类的子类）
	// 仅仅改变方法前面的修饰符号是不允许的，比如父方法：public static void M();子方法：public void M();是不对滴
	public static void StaticMethod() {
		System.out.println("Father's Static Method");
	}

	// public void StaticMethod(){
	//
	// }//错
	public static void OnlyFatherStaticMethod() {
		System.out.println("OnlyFatherHasThisMethod");
	}

	// 重写测试，非静态方法方法相同的方法名称，相同的参数列表，及相同的返回类型（或者子类的方法的返回类型是父类的子类）是重写，这个根据实例来调用，不是根据实例的引用类型
	 public  void Method() {
		System.out.println("Father's Method.");
	}
}

class Son extends Father {
	public static void StaticMethod() {
		System.out.println("Son's Static Method");
	}

	 public void Method() {
		System.out.println("Son's Method.");
	}
}