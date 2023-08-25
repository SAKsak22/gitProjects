package testProject;

import java.util.Scanner;

public class Practice4 {
public static void main(String[] args) {
		
		int bop1,bop2,bop3,bop4,bop5,bop6;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년");
		bop1 = sc.nextInt();
		System.out.print("월");
		bop2 = sc.nextInt();
		System.out.print("일");
		bop3 = sc.nextInt();
		System.out.print("시");
		bop4 = sc.nextInt();
		System.out.print("분");
		bop5 = sc.nextInt();
		System.out.print("초");
		bop6 = sc.nextInt();
		System.out.print("지금은 " +bop1+ "년 " +bop2+ "월 " +bop3+ "시 "
				+bop4+ "분 " +bop5+ "초입니다.");
	}
}
