package com.kh.test3;

public class Run {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("최지원");
		pArr[1] = new Person("윤승희");
		pArr[2] = new Person("김복남");
		
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}

	}

}
