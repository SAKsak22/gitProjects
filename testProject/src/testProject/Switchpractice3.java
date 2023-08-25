package testProject;

import java.util.Scanner;

public class Switchpractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		int kor, mat, eng, all;
		float avg;
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		all = kor + mat + eng;
		avg = (kor + eng + mat) / 3;
		
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + mat);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + all);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!"); 
		} else {
			System.out.print("불합격입니다."); 
		}
		
		
	}
}
