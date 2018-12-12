package com.LeShine.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author LeShine
 * @date: 2018年8月22日 上午11:22:56
 * @version: v1.0.0
 * @explain:反射获取类构造函数
 */
public class ReflectionTest1 {
	public static void main(String[] args) {
		System.out.println("输出public构造函数");
		try {
			Class stuClass = Class.forName("com.LeShine.test.Student");
			// getConstuctors()返回一个包含构造函数的数组
			Constructor[] constructors = stuClass.getConstructors();
			for (Constructor c : constructors) {
				System.out.println(c);
			}
		} catch (ClassNotFoundException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class cons2;
		try {
			cons2 = Class.forName("com.LeShine.test.Student");
			// System.out.println(cons2);
			System.out.println("输出所有构造函数");
			Constructor[] stuAllCons = cons2.getDeclaredConstructors();
			for (Constructor constructor : stuAllCons) {
				System.out.println(constructor);
			}
			Constructor stuClass = cons2.getDeclaredConstructor(String.class);
			Object stuIns = stuClass.newInstance("LeShine");
			System.out.println(stuIns);
			Class[] classes = new Class[] { int.class, char.class, String.class };
			Constructor constructor2 = cons2.getDeclaredConstructor(classes);
			constructor2.setAccessible(true);// 设置类的私有属性为public
			Object newInstance = constructor2.newInstance(18, '男', "15071582514");
			System.out.println(newInstance);

			System.out.println("1111111111---------------------------1111111111111");
			Constructor declaredConstructor = cons2.getDeclaredConstructor(int.class, char.class, String.class);
			declaredConstructor.setAccessible(true);
			Object newInstance2 = declaredConstructor.newInstance(19, '男', "888888");
			System.out.println(newInstance2);

		} catch (ClassNotFoundException | SecurityException | NoSuchMethodException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
