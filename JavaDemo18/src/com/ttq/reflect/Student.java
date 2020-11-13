package com.ttq.reflect;

/**
 * Student 类模版
 * */
public class Student {
	private String name;
	private int age;

	public Student() {//默认构造
	}

	public Student(String name, int age) {//name和age参数的构造
		super();
		this.name = name;
		this.age = age;
	}

	public Student(int age) {//age参数的构造
		super();
		this.age = age;
	}

	public Student(String name) {//name参数的构造
		super();
		this.name = name;
	}

	static {
		System.out.println("我被加载了");
	}

	public void show() {
		System.out.println("hello");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
