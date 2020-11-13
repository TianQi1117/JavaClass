package com.ttq.factory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//简单工程用的不多，实例化工厂
		SimpleFactory<Date> simpleFactory = new SimpleFactory<Date>();
		Date date = simpleFactory.getBean("java.util.Date");
		System.out.println(date);
		//静态工厂
		Date date2 = (Date) BeanFactory.getBean("java.util.Date");
		System.out.println(date2);
		Random random = (Random) BeanFactory.getBean("java.util.Random");
		System.out.println(random.nextInt(10));
		ArrayList<Integer> list = (ArrayList<Integer>) BeanFactory.getBean("java.util.ArrayList");
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(e -> System.out.println(e));
	}

}
