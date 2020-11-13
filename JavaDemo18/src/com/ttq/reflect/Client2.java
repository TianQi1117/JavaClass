package com.ttq.reflect;

import java.lang.reflect.Constructor;

public class Client2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//唯一实例，单例，无法变多例
		/*Singlon s1 = Singlon.getSinglon();
		Singlon s2 = Singlon.getSinglon();
		System.out.println(s1);
		System.out.println(s2);*/
		Class manager = Class.forName("com.ttq.reflect.Singlon");
		//getDeclaredConstructor(); 获得所有的构造方法，所有访问权限的构造方法
		//getConstructor();只获得public的构造方法
		Constructor<Singlon> constructor = manager.getDeclaredConstructor();
		//私有构造，破冰，不破冰访问不了
		constructor.setAccessible(true);
		Singlon s1 = constructor.newInstance();
		Singlon s2 = constructor.newInstance();
		Singlon s3 = constructor.newInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//三个对象 业务层必须单例

	}

}
