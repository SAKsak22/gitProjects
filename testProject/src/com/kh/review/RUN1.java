package com.kh.review;

import java.util.*;
public class RUN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Human jiwon = new Human("choi", 21, "201111 - xxxxxxx",'m');
	
		Book [] jiwonBookList = jiwon.getBookList();
		jiwonBookList [0] = new Book("꿈꾸는 다락방");
		System.out.println(jiwonBookList[0]);
		System.out.print(jiwon.getAge());
		
		
		
		
//		 ArrayList<Human> list = new ArrayList<>();
		 
		 
		 
		 
		 
//		 arr[0] = new Human("choi", 21, "201111 - xxxxxxx",'m');
//		 arr[1] = new Human("kim", 23, "201111 - xxxxxxx",'m');
//		 arr[2] = new Human("jin", 25, "201111 - xxxxxxx",'m');
//		 
//		 arr[1] = null;
//		 arr[1] = arr[2];
//		 arr[2] = null;
//		 System.out.println(arr[1].getAge());
//
//		 list.add(new Human("choi", 21, "201111 - xxxxxxx",'m'));
//		 list.add(new Human("kim", 23, "201111 - xxxxxxx",'m'));
//		 list.add(new Human("jin", 25, "201111 - xxxxxxx",'m'));
//		 
//		 list.remove(1);
//		 
//		 System.out.print(list.get(1));

		 
	}

}
