package com.LeShine.com;

import java.util.ArrayList;

/**
 * @author LeShine
 * @date: 2018年8月20日 下午6:32:42
 * @version: v1.0.0
 * @explain:arr练习
 */
public class ArrTest {
	public static void main(String[] args) {
		function();
	}

	public static void function() {
		// 存储元素 必须是引用类型
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("LeShine");
		arr.add("hunter");
		// get
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		// 存储对象
		ArrayList<Person> arrPer = new ArrayList<Person>();
		arrPer.add(new Person());
		arrPer.add(new Person("leshine", 18));
		for (int i = 0; i < arrPer.size(); i++) {
			System.out.println(arrPer.get(i));
		}

	}
}
