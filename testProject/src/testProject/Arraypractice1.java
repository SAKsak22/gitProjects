package testProject;

import java.util.Scanner;

import java.util.Arrays;

public class Arraypractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int [] num = new int[10];
//		for(int i = 1; i <=10; i++ ) {
//			num[i - 1] = i;
//			System.out.print(i + " ");
//		}
		
//		int [] num2 = new int[10];
//		for(int i = 0; i < 10; i++ ) {
//			num2[10 - i] = i;
//			System.out.print(i + " ");
//		}
		
//		int j = 10;
//		for (int i = 0; i < 10; i++) {
//			num2[i] = j--;
//		}
		
//		int num;
//		System.out.print("양의 정수 : ");
//		num = sc.nextInt();
//		
//		//배열
//		int[] arr = new int[num];
//		
//		//배열의 1~n까지의 값 출력
//		for(int i = 0; i <= num; i++) {
//			arr[i] = i + 1;
//			
//			System.out.print(i + " ");
//		}
		
//		String[] str = new String[5];
//		str[0] = "사과";
//		str[1] = "귤";
//		str[2] = "포도";
//		str[3] = "복숭아";
//		str[4] = "참외";
		
//		String [] str = ("사과","귤","포도","복숭아","참외");
//		System.out.print(str[1]);
		
//		String str; //검색할 문자열
//		char ch; // 찾을 문자 하나
//		int count = 0;
////		int[] strloc; //위치값(인덱스) 저장
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
////		strloc = new int[str.length()];
//		
//		System.out.print("문자 : ");
//		ch = sc.next().charAt(0);
//		
//		
//		//ch가 존재하는 위치 구하기
//		System.out.print("application에 i가 존재하는 위치(인덱스)");
//		for(int i= 0; i < str.length(); i++ ) {
//			if(str.charAt(i) == ch) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		
//		System.out.print(ch + " 개수 : " + count);
		
//		char ch;
//		int num;
//		
//		
//		String[] day = new String [7];
//		day[0] = "월";
//		day[1] = "화";
//		day[2] = "수";
//		day[3] = "목";
//		day[4] = "금";
//		day[5] = "토";
//		day[6] = "일";
////		String[] day = {"월","화", "수", "목", "금", "토", "일"};
//		
//		
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		num = sc.nextInt();
//		
//		switch(num){
//			case 0 :
//			case 1 :
//			case 2 :
//			case 3 :
//			case 4 :
//			case 5 :
//			case 6 :
//				System.out.println(day[num] + "요일");
//				break;
//			default :
//				System.out.print("잘못 입력하셨습니다.");
//			
//			
//		}
		
//		int num;
//		int[] arr;
//		int count = 0;
//		
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		arr = new int[num];
//		
//		for(int i = 0; i < arr.length; i++ ) {
//			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
//			arr[i] = sc.nextInt();// 배열오소에 값을 입력받는다.
//		}
//		
//		
//		for(int i = 0; i <= arr.length; i++ ) {
//			count += arr[i];//값을 다 더해준다
//			System.out.print(arr[i] + " ");// 배열의 값을 출력 
//			
//		}
//		System.out.print("\n총 합 :  " + count);
		
		
//		int num, count = 0;
//		int[] arr;
//		
//		while(true) {
//			System.out.print("정수 : ");
//			num = sc.nextInt();
//			arr = new int[num];
//		
//		//0 ~ (n-1)까지 단 반복중간값까지는 1부터 1씩 늘려저장 중간이후는 1씩 빼서 저장
//			
//			if(num < 3 || num % 2==0) {
//				System.out.print("다시 입력하세요");
//			 } else {
//				for(int i = 0; i < arr.length; i++) {
//					if((arr.length / 2) < i) {
//						count--;
//					} else {
//						count++;
//					}
//					arr[i] = count;
//				
//			
//					}for (int i = 0; i < arr.length; i++) {
//					System.out.print(arr[i] + " ");
//				}
//					break;
//			}
//				
//			}	
		
//		String chicken, res = null;
//		String [] menu = {"양념","간장","갈릭","후라이드"};
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		chicken = sc.next();
//		
//		for(int i = 0; i < menu.length; i++) {
//			if(chicken.equals(menu[i])) {
//				res = chicken + "치킨 배달 가능";
//				break;
//			} else {
//				res = chicken + "치킨은 없는 메뉴입니다.";
//			}
//		}
//		System.out.print(res);
		
		//주민등록번호 *표시
//		char[] str;
//		char[] st = new char[14];
//		
//		System.out.print("주민등록번호(-포함) : ");
//		str = sc.next().toCharArray();
//		st = new char[str.length];
//		
//		for(int i = 0; i < st.length; i++) {
//			if(i >= 8) {
//				st[i] = '*';
//				continue;
//			}
//			
//			st[i] = str[i];
//		}
//		
//		for(int i = 0; i < st.length; i++) {
//			System.out.print(st[i]);
//		}
		
		//Math.randon() : 0보다 크고 1보다 작은 난수 발생
		//값을 곱하고 int형으로 변환해서 정수형 난수를 발생시킬 수 있다.
//		System.out.print((int)(Math.random() * 10));
		
//		int[] nansoo = new int[10];
//		
//		for(int i = 0; i < nansoo.length; i++ ) {
//			nansoo[i] = (int)(Math.random() * 10 + 1);
//		}
//		
//		for(int i = 0; i < nansoo.length; i++ ) {
//			System.out.print(nansoo[i] + " ");
//		}
		
//		int min = 9999, max = 0;
//		
//		int[] nansoo = new int[10];
//		
//		for(int i = 0; i < nansoo.length; i++ ) {
//			nansoo[i] = (int)(Math.random() * 10 + 1);
////			max = (nansoo[i] > max) ? nansoo[i] : 
//		}	
//		
//		for(int i = 0; i < nansoo.length; i++ ) {
//			if (nansoo[i] > max) {
//				max = nansoo[i];
//			}
//			
//			if (nansoo[i] < min) {
//				min = nansoo[i];
//			}
//		}
//		for(int i = 0; i < nansoo.length; i++ ) {
//			System.out.print(nansoo[i]);
//		}
//			System.out.print("최대값 : ");
//			System.out.print("최소값 : ");
		
		int[] arr = new int[10];
		int i = 0;
//		//[0,0,0,0,0,0,0,0,0,0,0]
		while (i < arr.length) {
			//난수 입력받기
			int nan = (int)(Math.random() * 10 + 1);
			//난수 검사
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == nan) {
					nan = 0;
					break;
				}
			}
			
			if (nan == 0)
				continue;
			else {
				arr[i] = nan;
				i++;
			}
		
		}
//		for (i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	
//		int num = 10;
//		String str;
//		str = "hi";
//		
//		System.out.println(num + str);
//		
//		if(num > 5) {
//			System.out.print("num은 5보다 작은 수 잆니다.");
//		} else if (num < 5) {
//			System.out.print("num은 5보다 큰 수 입니다.");
//		} else {
//			System.out.print("num은 5입니다.");
//		}
//		
//		for(int i = 1; i <=num; i++) {
//			System.out.print(i);
//		}
//		
//		int i = 10;
//		while(i <= 10) {
//			System.out.print(i);
//			i++;
//		}
//		
//		int[] arr = new int[20];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i =+ 1;
//		
//		} for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		
			
		
		
		
		
		
		
		
	}

}
