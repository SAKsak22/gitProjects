package testProject;

import java.util.Scanner;

public class Ifclause {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
				System.out.println("0입니다");
		}
	}
}
