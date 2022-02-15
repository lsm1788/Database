package com.naver.lsm17888.app;

public class MethodC extends MethodP{
	public MethodC() {
		//super();
		System.out.println("methodC()");
	}
	@Override
	public void show() {
		System.out.println("자식메소드");
	}
}
