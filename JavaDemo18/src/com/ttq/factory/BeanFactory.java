package com.ttq.factory;

import java.lang.reflect.Constructor;

/**
 * 静态工厂
 * */
public class BeanFactory {
	public static Object getBean(String className) {
		try {
			Class manager = Class.forName(className);
			Constructor constructor = manager.getConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
