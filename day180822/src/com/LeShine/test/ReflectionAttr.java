package com.LeShine.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author LeShine
 * @date: 2018年8月22日 下午3:27:46
 * @version: v1.0.0
 * @explain:通过反射获取类属性
 */
public class ReflectionAttr {
	public static void main(String[] args) {
		try {
			System.out.println("---------公共属性-----------");
			Class stuClas = Class.forName("com.LeShine.test.Student");
			Field[] fields = stuClas.getFields();
			for (Field f : fields) {
				System.out.println(f);
			}
			System.out.println("--------所有属性------------");
			Field[] declaredFields = stuClas.getDeclaredFields();
			for (Field f : declaredFields) {
				System.out.println(f);
			}
			System.out.println("---------私有属性-----------");
			Field declaredField = stuClas.getDeclaredField("name");// 获取对应属性
			System.out.println(declaredField);
			declaredField.setAccessible(true);// 暴力访问，把私有属性设置为public
			Object newInstance = stuClas.getDeclaredConstructor().newInstance();// 获取构造函数并构造对象
			declaredField.set(newInstance, "dfdf");// 为对象设置属性值
			System.out.println(newInstance);
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
