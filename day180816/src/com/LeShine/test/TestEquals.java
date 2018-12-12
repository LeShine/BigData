package com.LeShine.test;

public class TestEquals {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 18);
		Person p2 = new Person("张三", 18);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);// ==比较的是引用数据类型的地址false
		System.out.println(p1.equals(p2));// 改写equals后比较引用数据类型的值true
		System.out.println(p1.toString());

		String st1 = "张三18";
		String st2 = "张三18";
		String st3 = new String("张三18");
		System.out.println(st1 == st2);//
		System.out.println(st1.equals(st2));//
		System.out.println(st1.equals(st3));//
	}
}
