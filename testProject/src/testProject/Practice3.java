package testProject;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		
		float gaa, srr;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 :");
		gaa = sc.nextFloat();
		System.out.print("세로 :");
		srr = sc.nextFloat();
		System.out.println("면적 :" + (gaa * srr));
		System.out.print("둘레 :" + (gaa * 2 + srr * 2));

	}
}
