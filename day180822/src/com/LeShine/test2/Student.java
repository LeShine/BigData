package com.LeShine.test2;

import java.io.Serializable;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����8:59:09
 * @version: v1.0.0
 * @explain:
 */
public class Student implements Serializable {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	/**
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
