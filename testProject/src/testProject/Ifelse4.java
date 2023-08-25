package testProject;

import java.util.Scanner;

public class Ifelse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean, english, math;
		int total; 
		float avg;
		
	    System.out.print("국어 : ");
	    korean = sc.nextInt();
	    System.out.print("영어 : ");
	    english = sc.nextInt();
	    System.out.print("수학 : ");
	    math = sc.nextInt();
	    total = korean + english + math;
	    avg = total / (float)3;
	    System.out.println("합계 : " + total);
	    System.out.println("평균 : " + avg);
	    if (korean >= 40 && english >= 40 && math >= 40 && avg >= 60) {
	    	System.out.println("합격");
	    }
	    else 
	    	System.out.println("불합격");
	    
	    
	    

	}

}
