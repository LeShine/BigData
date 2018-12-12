package com.LeShine.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����4:07:05
 * @version: v1.0.0
 * @explain:�����ȡ�෽��
 */
public class ReflectionMethod {
	public static void main(String[] args) {
		// ��ȡ��
		try {
			Class stuCla = Class.forName("com.LeShine.test.Student");
			// ��ȡ��������
			Method[] methods = stuCla.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println(m);
			}

			// ��ȡ�ض���������
			Method method = stuCla.getMethod("show", null);
			System.out.println(method);
			Object newInstance = stuCla.getDeclaredConstructor().newInstance();
			method.invoke(newInstance, null);
			// ��ȡ˽���ض�����
			Method method2 = stuCla.getDeclaredMethod("show", String.class);
			method2.setAccessible(true);
			Object obj = stuCla.getDeclaredConstructor(String.class).newInstance("lalalal");

			// declaredConstructor.setAccessible(true);
			method2.invoke(obj, "��Ҫ����");

		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}