package com.LeShine.com;

/**
 * @author LeShine
 * @date: 2018��8��20�� ����6:35:57
 * @version: v1.0.0
 * @explain:
 */
public class Person {
	private String name;
	private int age;

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

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
