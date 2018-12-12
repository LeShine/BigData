package com.LeShine.test;

/**
 * @author LeShine
 * @date: 2018年8月22日 上午10:35:08
 * @version: v1.0.0
 * @explain:反射的三种获取类的方法
 */
public class ReflectionTest {
	public static void main(String[] args) {
		Student student = new Student();
		// 根据对象.getClass（）获取
		Class stuClass = student.getClass();
		System.out.println(stuClass);
		// 根据类.class()
		Class stuClass2 = Student.class;
		System.out.println(stuClass == stuClass2);
		// 根据class的静态方法.forName()
		try {
			Class stuClass3 = Class.forName("com.LeShine.test.Student");
			System.out.println(stuClass2 == stuClass3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
