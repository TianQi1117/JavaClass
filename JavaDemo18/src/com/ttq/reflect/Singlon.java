package com.ttq.reflect;

//饿汉模式
public class Singlon {
	private static final Singlon singlon = new Singlon();

	public static Singlon getSinglon() {
		return singlon;
	}

	private Singlon() {

	}
}
