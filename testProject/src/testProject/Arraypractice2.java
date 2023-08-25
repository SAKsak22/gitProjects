package testProject;

import java.util.Scanner;

import java.util.Arrays;

public class Arraypractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// *로또번호 구하기*
//		int[] lot = new int[6];
//		
//		for(int i = 0; i < lot.length; i++) {
//			lot[i] = (int)(Math.random() * 45+1);
//			for (int j = 0; j < i; j++) {
//				if(lot[i] == lot[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		
//		Arrays.sort(lot);
//		for(int i = 0; i < lot.length; i++) {
//			System.out.print(lot[i]+" ");
//		}
		
//		String str;
//		char[] strArray;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		//application
//		
//		strArray = new char[str.length()];
//		int i = 0, j = 0, k = 0;
//		while(i < str.length() ) {
//			strArray[j] = str.charAt(i);
//			//중복검사
//			for(; k < j; k++) {
//				if(strArray[j] == strArray[k]) {
//					j--;
//					break;
//				}
//			}
//			
//			i++;
//			j++;
//		}
//		
//		System.out.println("문자열에 있는 문자 : ");
//		for (int h = 0;h < strArray.length; h++) {
//			if(h == (strArray.length - 1) || strArray[h + 1] == 0 ) {
//				System.out.print(strArray[h]);
//				System.out.println("문자 개수 : " + (h + 1));
//				break;
//			}else {
//			System.out.print(strArray[h] + ", ");
//		}
//		}
		
		int num;
		String[] strArray1, strArray2;
		
		System.out.print("배열의 크기를 입력하세요 :");
		num = sc.nextInt();
		sc.nextLine();
		
		strArray1 = new String[num];
		int i = 0;
		while(true) {
			
			//문자열을 입력받는 부분
			for(; i < strArray1.length; i++) {
				System.out.print("1번째 문자열 : ");
				strArray1[i] = sc.nextLine();
			}
			
			//더 입력할지 안할지 확인부분
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			
			//더 입력하겠다.
			if('Y' == sc.next().charAt(0) || 'Y' == sc.next().charAt(0)) {
				System.out.print("더 입력하고 싶은 개수 :");
				num = sc.nextInt();
				sc.nextLine();
				
				strArray2 = new String[strArray1.length + num];
				
				for(i = 0; i < strArray1.length; i++) {
					strArray2[i] = strArray1[i];
				}
				
				strArray1 = strArray2;
				//배열 추가로 크게 생성해주고
				//복제
			} else { //그만입력하겠다.
				System.out.print("[");
				for(i = 0; i < strArray1.length; i++) {
					if(i == strArray1.length - 1) {
						System.out.print(strArray1[i] +"]");
					}else {
						
					}
					}
				break;
			}
		}

	}

}
