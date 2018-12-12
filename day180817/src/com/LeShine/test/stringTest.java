package com.LeShine.test;

/**
 * @author LeShine
 * @date: 2018��8��17�� ����10:03:50
 * @version: v1.0.0
 */
public class stringTest {
	public static void main(String[] args) {
		function1();
		function2();
		function3();
		function4();
	}

	public static void function1() {
		String str = "dffdfd.text";
		System.out.println(str.length());// ����
		System.out.println(str.substring(1, 3));// ��1��ȡ2����3
		System.out.println(str.substring(2));// ��2��ȡ�����
		System.out.println(str.endsWith("fd"));// �Ƿ���x��β
		System.out.println(str.endsWith(".text"));
		System.out.println(str.contains(".text"));// �Ƿ����x
		System.out.println(str.contains(".tt"));// �Ƿ����x
		System.out.println(str.indexOf("f"));// cha��һ�γ��ֵ�����

		/*
		 * 11 ff fdfd.text false true true false
		 */

	}

	public static void function2() {
		String str = "abcdef";
		byte[] ch = str.getBytes();
		System.out.println(ch);// �����ַ
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		char[] cs = str.toCharArray();
		System.out.println(cs);// �ַ�����

		// ������ع��ܣ��ֽ���ز�ѯ��������ַ���ز���ѯ�����
	}

	public static void function3() {
		String st1 = "abc";
		String st2 = "abc";
		String st3 = "Abc";
		System.out.println(st1.toString());
		System.out.println(st1 == st2); //
		System.out.println(st1.equals(st2));// string ��equals������д�ˣ��Ƚϵ����ַ�����ûһ���ַ�
		System.out.println(st1.equalsIgnoreCase(st3));// ���Դ�Сд

	}

	public static void function4() {
		String st1 = new String("abc");// ��ַ��ջ�У�ֵ�ڶ���
		String st2 = "abc";// ջ
		System.out.println("f4------------------");
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
		System.out.println(st1 + " " + st2);
		System.out.println(st1.toString());

	}
}