package com.example.test;

public class AnonymousInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClassInterface anonymousSayHi = getAnonymousClassMethod();
		anonymousSayHi.AnonymousinnerMethod();
		
		AnonymousInnerClassAbstract anonymousSayHi_ = getAnonymousClassMethod_a();
		anonymousSayHi_.AnonymousinnerMethod_0();
		anonymousSayHi_.AnonymousinnerMethod_1();
	}

	public static AnonymousInnerClassAbstract getAnonymousClassMethod_a(){
		final String hi = "Hi,";
		return new AnonymousInnerClassAbstract(){

			void AnonymousinnerMethod_0() {
				// TODO Auto-generated method stub
				System.out.println(hi+"Call AnonymousinnerMethod_0");
			}
			
		};
	}
	
	public static AnonymousInnerClassInterface getAnonymousClassMethod() {

		// String hi = "Hi,";//这个是错的，原因参考刚才阐述。
		final String hi = "Hi,";
		return new AnonymousInnerClassInterface() {

			public void AnonymousinnerMethod() {
				// TODO Auto-generated method stub
				System.out.println(hi + "Call  AnonymousInnerMethod");
			}
		};
	}
}

// 定义局部内部类的上层接口，用于允许返回匿名内部类

//用abstract class的方式
abstract class AnonymousInnerClassAbstract {
	String hi = "Hi,";
	 abstract void AnonymousinnerMethod_0();//这个必须要加abstract，应为默认的不是abstract

	void AnonymousinnerMethod_1() {
		System.out.println(hi + "Call AnonymousinnerMethod_1");
	}
}
//用interface的方式
interface AnonymousInnerClassInterface {
	String hi = "Hi,";//默认的是static final
	void AnonymousinnerMethod();//默认abstract
}