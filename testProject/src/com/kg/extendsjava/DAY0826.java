package com.kg.extendsjava;
import java.util.Scanner;

public class DAY0826 {
	 public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int num;
	
	
	
	System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		if(num>= 1 && num <=10) {
			for(int i = 1; i<num; i ++) {
				if(i%2==1) {
					System.out.print(i +" ");
				}
			}
		}
		
		
	
	
	 }
}
