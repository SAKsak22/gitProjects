package testProject;

import java.util.Scanner;

public class Ifelse6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String number;
		number = sc.next();
		
		System.out.println("주민번호를 입력하세요(- 포함) : " + number);
		number = sc.next();
		
		if (number.charAt(7) == '1' && number.charAt(7) == '3' ) {
			System.out.print("남자");
		}
		else
			System.out.print("여자");
		
//		System.out.print((number.charAt(7) == '1' || number.charAt(7) == '3' ) ? "남자" : "여자");
		//삼항연산자
	}
}
