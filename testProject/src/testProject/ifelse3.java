package testProject;

import java.util.Scanner;

public class ifelse3 {
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		String grade;
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if (age <= 13) {
			grade = "어린이";
		} else if (age >13 && age <= 19) {
			grade = "청소년";
	    } else {
			grade = "성인";
	    }
		
		System.out.print(grade);
			}
		
	}


