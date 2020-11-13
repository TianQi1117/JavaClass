package com.ttq.factory;

import java.lang.reflect.Constructor;

public class SimpleFactory<T> {
	public T getBean(String className) {
		try {
			Class manager = Class.forName(className);
			Constructor<T> constructor = manager.getConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
