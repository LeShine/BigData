package com.LeShine.test;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����10:35:08
 * @version: v1.0.0
 * @explain:��������ֻ�ȡ��ķ���
 */
public class ReflectionTest {
	public static void main(String[] args) {
		Student student = new Student();
		// ���ݶ���.getClass������ȡ
		Class stuClass = student.getClass();
		System.out.println(stuClass);
		// ������.class()
		Class stuClass2 = Student.class;
		System.out.println(stuClass == stuClass2);
		// ����class�ľ�̬����.forName()
		try {
			Class stuClass3 = Class.forName("com.LeShine.test.Student");
			System.out.println(stuClass2 == stuClass3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
