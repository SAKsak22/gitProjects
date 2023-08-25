package com.kh.generic;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
	
	
		aBox.setTmp(new Apple());
		oBox.setTmp(new Orange());
		
		Apple ap = aBox.getTmp();
		Orange og = oBox.getTmp();
		
		System.out.println(ap);
		System.out.println(og);
	
	}
	
}
