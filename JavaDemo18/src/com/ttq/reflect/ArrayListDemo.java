package com.ttq.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);

		//		Class manager = list.getClass();
		//		Class manager=Class.forName(className);
		Class manager = ArrayList.class;
		Method method = manager.getMethod("add", Object.class);
		method.invoke(list, "hello");
		method.invoke(list, 11);
		method.invoke(list, true);
		System.out.println(list);
	}

}
