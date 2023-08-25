package testProject;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		
//		char uni;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("문자: " );
//		uni = sc.next().charAt(0);
//		
//		System.out.println("a unicode" + (uni + 0));
		
//		float korean, english, math;
//		float total;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 : ");
//		korean = sc.nextFloat();
//		System.out.print("영어 : ");
//		english = sc.nextFloat();
//		System.out.print("수학 : ");
//		math = sc.nextFloat();
//		total = korean + english + math;
//		System.out.println("총점 : " + (int)(korean + english + math));
//		System.out.print("평균 : " + (int)(total / 3));
		
		int iNum = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum2 * 3 - iNum); //2
		System.out.println(iNum - iNum2 * 2); //2
		
		System.out.println(dNum * 4); //10.0
		System.out.println(fNum * 10 - iNum * 2); //10.0
		
		System.out.println(dNum * 1); //2.5
		System.out.println(fNum * 5 - dNum * 5); //2.5
		
		System.out.println((int)(fNum)); //3
		System.out.println((byte)(dNum * 2 - iNum2)* 3); //3
		
		System.out.println((int)iNum / fNum); //3.3333333
		System.out.println((double)iNum / fNum); //3.3333333333333335
		
		System.out.println(ch); //'A'
		System.out.println((int)ch); //65
		System.out.println((int)iNum + ch); // 75
		System.out.println((char)(ch + iNum)); // 'k'
		
		
		
	}
}
