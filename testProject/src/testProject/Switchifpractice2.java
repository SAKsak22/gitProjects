package testProject;

import java.util.Scanner;

public class Switchifpractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mids, fins, asm, che;
		double all;
		
		System.out.print("중간 고사 점수 : ");
		mids = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		fins = sc.nextInt();
		System.out.print("과제 점수 : ");
		asm = sc.nextInt();
		System.out.print("출석 회수 : ");
		che = sc.nextInt();
		
		System.out.println("===============결과===============");
		System.out.println("중간 고사 점수(20) :" + (mids * 0.2));
		System.out.println("기말 고사 점수(30) :" + (fins * 0.3));
		System.out.println("과제 점수		(30)" + (asm * 0.3));
		System.out.println("출석 점수		(20)" + (double) che);
		all = ((mids * 0.2f) + (fins * 0.3f) + (asm * 0.3f) + che);
		
		System.out.println("총점 :"+ all);
			
			if(all < 70 ) {
				System.out.println("Fail [점수 미달]");
			}else if( (20 * 0.7) <= che) {
				System.out.println("Fail [출석횟수미달]");
			}else {
				System.out.println("Pass");
			}
	
			
	}
		
}

