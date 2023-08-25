package com.kh.generic;

public class Box<P> {
	private P tmp;
	private int age;
	private String name;
	
	public void setTmp(P o) {
		tmp = o;
	}
	
	public P getTmp() {
		return tmp;
	}

}
