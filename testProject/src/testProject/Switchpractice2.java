package testProject;

import java.util.Scanner;

public class Switchpractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("양수만 입력해주세요.");
		} else if(num %2 == 0 && num > 0) {
			System.out.println("짝수다"); 
		} else {
			System.out.println("홀수다");
		}
		
		
	}

}
