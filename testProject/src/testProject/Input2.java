package testProject;

import java.util.Scanner;

public class Input2 {
	public class Helloworld {
		public static void main(String[] args ) {
			
			
			int num1, num2;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 정수:");
			num1 = sc.nextInt();
			System.out.print("두 번째 정수:");
			num2 = sc.nextInt();
			System.out.print("더하기 결과:"+ num1 + num2);
			System.out.print("빼기 결과:" + (num1 - num2));
			System.out.print("곱하기 결과:" + num1 * num2);
			System.out.print("나누기 결과:" + (num1 / num2));
			
		}		
	}
}
