package com.ttq.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Client1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//		Student s1 = new Student();
		//		Student s2 = new Student("张三");
		//		Student s3 = new Student(12);
		//		Student s4 = new Student("李四", 20);
		//反射
		Class manager = Class.forName("com.ttq.reflect.Student");
		//构造方法封装
		Constructor<Student> constructor1 = manager.getConstructor();//获得无参构造
		Student s11 = constructor1.newInstance();//无参构造
		//name的构造方法	
		Constructor<Student> constructor2 = manager.getConstructor(String.class);//形参的类管理对象，第三种方案
		Student s22 = constructor2.newInstance("张三");
		//age的构造方法
		Constructor<Student> constructor3 = manager.getConstructor(int.class);//基本数据类型的类管理对象
		Student s33 = constructor3.newInstance(20);
		//双参构造
		Constructor<Student> constructor4 = manager.getConstructor(String.class, int.class);
		Student s44 = constructor4.newInstance("陈舒怡", 32);
		//属性私有化，如果不提供set和get方法外部访问不了，反射破
		//获得属性
		Field name = manager.getDeclaredField("name");//获得name属性
		Field age = manager.getDeclaredField("age");//获得age属性
		name.setAccessible(true);
		age.setAccessible(true);
		//s11对象的属性赋值
		name.set(s11, "陈舒怡");
		age.set(s11, 40);
		System.out.println(s11);
		System.out.println(s22);
		Method show = manager.getMethod("show");
		show.invoke(s11);
	}

}
//单例模式->运用反射创建多例
