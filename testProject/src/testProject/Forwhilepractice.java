package testProject;

import java.util.Scanner;

public class Forwhilepractice {

	public static void main(String[] args) {
		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int dan = 2;
//		1
//		2
//		
//		
//		
//		
//		for (int i = 1  (1); i <= 9 (2); i++(4)) { // i는 지역변수
//			(3)
//			System.out.println(dan + " * " + i + " = " + (i*dan));
//		}
		
		Scanner sc = new Scanner(System.in);
		
//		int num;
//		
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		for (int i = 1 ; i <= num; i++)  {
//			System.out.println(i);
//		}

//		int i = 1;
//		
//		while(i <) {
//			
//		}
		
		//입력 1개 받기
		//입력받은 값까지 전부 출력(1~입력)
		//만약 1 미만 예외처리 반복
		
//		int num = 0;
//		
//		do {
//			
//		
//		while(num < 1) {
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		if(num < 1) {
//			System.out.print("1 이상의 숫자를 입력해주세요.");
//		} else {
//				int i = 1;
//				while(i <= num) {
//					System.out.print(i + " ");
//					i++;
//				}
//				
//			}
//		}
//	} while(num < 1);
		
		
		//~부터 ~까지 반복해라(for문의 핵심)
//		int num;
//		
//		while(num < 1) { //num은 1이상의 숫자가 나올때 까지 반복
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		if(num < 0) {
//		
//		for(int i = num; i >= 1; i--) {
//			System.out.print(i + " ");
//		else {
//			System.out.print("1이상의 숫자를 입력하세요")
//		}			
//		 }
//	  }
//   }	
		
//		int num, sum = 0;// 변수 num은 입력할려고 정함, sum은 0
//		
//		System.out.print("정수를 하나 입력하세요 : ");
//		num = sc.nextInt();
//		15
//		15
//		for(int i = 1; i <= num; i++) { 
//			sum = sum + i;
//			if (i == num) {
//		     System.out.print(i + " = " + sum);
//			}
//		    else {
//		    	System.out.print(i + " + ");
//		    	}
//		}
		
//		int num1, num2, max, min;
//		do {
//			System.out.print("첫 번째 숫자 :");
//			num1 = sc.nextInt();
//		
//			System.out.print("첫 번째 숫자 : ");
//			num2 = sc.nextInt();
//		
//			if (num1 < 0 || num2 < 0){
//			System.out.print("1 이상의 숫자를 입력해주세요");
//		}
//		
//		
//		}while(num1 < 0 || num2 < 0);
//		if (num1 > 0 && num2 > 0) {
//			//1 ~ 10까지
//			//작은수부터 큰수까지
//			
//			
//			if(num1 > num2) {
//				max = num1;
//				min = num2;
//			}else {
//				max = num2;
//				min = num1;
//			}
//			for (int i = min; i <= max; i++) {
//				System.out.print(i + " ");
//			}
//		}
		
		

//		for(int i=2; i < 10; i++) {
//			System.out.println(i + "단을 출력 합니다.");
//            
//			for(int j=1; j < 10; j++) {
//				System.out.println(i + " x " + j + " = " + i * j);
//			}
//			System.out.println();
//		}	
		
		
//		int k = 0;
//		
//		while(k < 1) {
//			System.out.print("1이상의 숫자를 입력하세요 :  ");
//			k = sc.nextInt();
//			if() {
//				
//			}
//			
//			if(k < 1) {
//				System.out.println("1이상의 숫자를 입력하세요");
//			    } else {
//				for(int i = 1; i <= k; i++ ) {
//					
//					System.out.print(i + "  ");
//				}
//				
//			}
//		}
		
		//계속 분석해보기
//		int k;
//		System.out.print("정수를 하나 입력하세요 : " );
//		k = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1 ; i <= k; i++) {
//			sum += i;
//			if(i==k) {
//				System.out.print(i + " = " + sum);
//			}else {
//				System.out.print(i + " + ");
//			}
//		}	
		
//		int [] ref = new int[5]; //위에 걸 선호 0번 부터 시작함
//		int ref [] = new int[3];
//		
//		System.out.print(ref);
		
//		int [] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[0] = 8;
//		ar[0] = 9;
//		
//		int num = ar[0] + ar[1] + ar[2];
//		System.out.print(num);
		
//		int num;
//		System.out.print(" 숫자  : ");
//		num = sc.nextInt();
//		
//		System.out.println("===== 4단 =====");
//		
//		for (int i = 1; i < 10; i++) {
//			
//			System.out.println("4 *" + i +" = " + (4 * i));
//			
//		}
		
//		int num;
//		System.out.print(" 숫자  : ");
//		num = sc.nextInt();
//		
//		if (num > 9 ) {
//			
//			System.out.print("9 이하의 숫자만 입력해주세요");}
//			
//			else {
//				for (int i = 1; i < 10; i++) {
//			
//			
//			    System.out.println("=====" + i + "단 =====");
//			
//				for(int j=1; j < 10; j++) {
//				System.out.println(i + " x " + j + " = " + i * j);
//			
//				}
//		
//				
//		
//		
//		     }
//		}
		
		// 세로 구구단 출력
		
//		int k;
//		System.out.print(" 숫자  : ");
//		k = sc.nextInt();
//		
//		if(k > 9) {
//			System.out.println("다시 입력하세요");
//		}else {
//			for(int i = k; i <= 9; i++) {
//				System.out.println("===== " + i + "단======");
//				for(int j = 2; j <=9; j++) {
//					System.out.println(i + " * " + j + " = " + (i * j ));}
//				
//			}
//		}
	
//		//반복문 공차
//		int startnum, space;
//		
//		System.out.print("시작 숫자 : ");
//		startnum = sc.nextInt();
//		System.out.print("공차 : ");
//		space = sc.nextInt();
//		
//		for (int i = 0; i < 10 ; i++ ) {
//			System.out.print(startnum + " ");
//			startnum = startnum + space;
//		}
		
//		int num1, num2;
//		String yunsan;
//		while (true) {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			yunsan = sc.nextLine();
//			System.out.print("정수1 : ");
//			num1 = sc.nextInt();
//			System.out.print("정수2 : ");
//			num2 = sc.nextInt();
//			
//			if(yunsan.equals("exit"))
//		
//			switch(yunsan) {
//				case "+" :
//					System.out.print(num1+" + "+num2+ " = " + (num1+num2));
//					break;
//				case "-" :
//					System.out.print(num1+" + "+num2+ " = " + (num1-num2));
//					break;
//				case "*" :
//					System.out.print(num1+" + "+num2+ " = " + (num1*num2));
//					break;
//				case "/" :
//					if (num2 == 0) {
//						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
//					}else {
//					 System.out.print(num1+" + "+num2+ " = " + (num1/num2));
//					}break;
//				case "%" :
//					System.out.print(num1+" + "+num2+ " = " + (num1%num2));
//					break;
//				default :
//					System.out.print("없는 연산자입니다. 다시 입력해주세요");
//					}
//		     }
//		int num;
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		//몇줄 실행할 것인가? 세로
//		for (int i = 1; i <= num; i++) {
//			// 몇번 실행하고 싶은가? 가로
//			for(int j = 0; j < i; j++) {
//			System.out.print('*');
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>i; j--) {
//				
//				System.out.print("*");
//			}
//				System.out.println("*");
//		}
//				System.out.println();

 }
}
