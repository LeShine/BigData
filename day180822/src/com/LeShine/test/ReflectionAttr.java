package com.LeShine.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����3:27:46
 * @version: v1.0.0
 * @explain:ͨ�������ȡ������
 */
public class ReflectionAttr {
	public static void main(String[] args) {
		try {
			System.out.println("---------��������-----------");
			Class stuClas = Class.forName("com.LeShine.test.Student");
			Field[] fields = stuClas.getFields();
			for (Field f : fields) {
				System.out.println(f);
			}
			System.out.println("--------��������------------");
			Field[] declaredFields = stuClas.getDeclaredFields();
			for (Field f : declaredFields) {
				System.out.println(f);
			}
			System.out.println("---------˽������-----------");
			Field declaredField = stuClas.getDeclaredField("name");// ��ȡ��Ӧ����
			System.out.println(declaredField);
			declaredField.setAccessible(true);// �������ʣ���˽����������Ϊpublic
			Object newInstance = stuClas.getDeclaredConstructor().newInstance();// ��ȡ���캯�����������
			declaredField.set(newInstance, "dfdf");// Ϊ������������ֵ
			System.out.println(newInstance);
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
