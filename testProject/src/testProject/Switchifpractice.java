package testProject;

import java.util.Scanner;

public class Switchifpractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		double hei, wei, bmi;
//		
//		System.out.print("키(m)를 입력해 주세요");
//		hei = sc.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요");
//		wei = sc.nextDouble();
//		
//		bmi = (wei / (hei * hei));
//		
//		System.out.println("BMI 지수 : " + bmi);
//		
//		if(bmi < 18.5) {
//			System.out.print("저체중");
//		}else if(bmi > 18.5 && bmi < 23) {
//			System.out.print("정상체중");
//		}else if(bmi >= 23 && bmi < 25) {
//			System.out.print("비만");
//		}else {
//			System.out.print("고도비만");
//		}
		
		int pyn1, pyn2;
		String ai;
		
		System.out.print("피연산자 1 입력 : ");
		pyn1 = sc.nextInt();
		System.out.print("피연산자 2 입력 : ");
		pyn2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		ai = sc.next();
		
		
		if(pyn1 >0 && pyn2 > 0) {
			if (ai.equals("+")) 
				System.out.println(pyn1 + " + " + pyn2 + " = " + (pyn1 + pyn2));	
			}else if (ai.equals("-")) {
				System.out.println(pyn1 + " - " + pyn2 + " = " + (pyn1 + pyn2));
			}else if (ai.equals("*")) {
				System.out.println(pyn1 + " * " + pyn2 + " = " + (pyn1 + pyn2));
			}else if (ai.equals("/")) {
				System.out.println(pyn1 + " / " + pyn2 + " = " + (pyn1 + pyn2));
			}else if (ai.equals("%")) {
				System.out.println(pyn1 + " % " + pyn2 + " = " + (pyn1 + pyn2));
			
		    }else {
			System.out.print("잘못 입력하셨습니다.프로그램을 종료합니다");
		}
		
		if(pyn1 >0 && pyn2 > 0) {	
			switch(ai) {
			case "+" :
				System.out.println(pyn1 + " + " + pyn2 + " = " + (pyn1 + pyn2));
			case "-" :
				System.out.println(pyn1 + " - " + pyn2 + " = " + (pyn1 + pyn2));
			case "*" :
				System.out.println(pyn1 + " * " + pyn2 + " = " + (pyn1 + pyn2));
			case "/" :
				System.out.println(pyn1 + " / " + pyn2 + " = " + (pyn1 + pyn2));
			case "%" :
				System.out.println(pyn1 + " % " + pyn2 + " = " + (pyn1 + pyn2));
			default:
				System.out.print("잘못 입력하셨습니다.프로그램을 종료합니다");
			
			}
		}
		
		
		
	}
}
