package com.LeShine.test;

public class TestEquals {
	public static void main(String[] args) {
		Person p1 = new Person("����", 18);
		Person p2 = new Person("����", 18);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);// ==�Ƚϵ��������������͵ĵ�ַfalse
		System.out.println(p1.equals(p2));// ��дequals��Ƚ������������͵�ֵtrue
		System.out.println(p1.toString());

		String st1 = "����18";
		String st2 = "����18";
		String st3 = new String("����18");
		System.out.println(st1 == st2);//
		System.out.println(st1.equals(st2));//
		System.out.println(st1.equals(st3));//
	}
}
