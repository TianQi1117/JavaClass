package com.ttq.reflect;

import java.lang.reflect.Constructor;

/**
 * new 成本高
 * 		高耦合【一个人写Student 一个人写Client】 并行的时候就少，串行
 * */
public class Client<T> {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Student 模版是有的
		//		Student student = new Student();
		//		student.show();
		//类加载的时候会生成Student 类的管理对象，问以后叫什么名字
		getBean("com.ttq.reflect.Student");//全路径类名，不是单纯的类名
	}

	public static <T> T getBean(String className) throws Exception {//className 类的全路径类名（包名）
		//获得类管理对象 1.加载类，会执行该类的静态代码块，此外获得该类的管理对象
		Class manager = Class.forName(className);//manager就是管理className类的一项
		//manager 可以知道student的一切，默认构造方法【很重要】
		Constructor constructor = manager.getConstructor();//获得默认构造方法
		//实例化对象，调用构造方法
		return (T) constructor.newInstance();//可以生成任何对象
	}

}
