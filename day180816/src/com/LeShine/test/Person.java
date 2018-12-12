package com.LeShine.test;

/**
 * 
 * @author LeShine PersonĬ�ϼ̳�Object��
 */
public class Person {
	private String name;
	private int age;

	// �޲ι���
	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return this.name + this.age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return name.equals(person.getName()) && age == person.getAge();
		}
		return false;
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

	public static void main(String[] args) {

	}

}
