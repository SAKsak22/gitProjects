package testProject;

import java.util.Arrays;


public class Arrayinput {

	public static void main(String[] args) {
		
//		int[] ref = new int[5];
//		//1단계       2단계
//		
//		System.out.println(ref);
//		
//	int[] ref = new int[5];
//	ref = new int[7];
//		System.out.println(ref);
//		
//		//배열 생성할 때는 자료형 1개 밖에 설정 못함
//		
//		int[] ar1 = new int[5];
//		
//		double[] ar2 = new double[7];
//		
//		float[] ar3;
//		ar3 = new float[9];
//			System.out.println("ar1의 길이 : " + ar1.length);
//			System.out.println("ar1의 길이 : " + ar2.length);
//			System.out.println("ar1의 길이 : " + ar3.length);
//		
//		String str = "jiwon";
//		System.out.println("str의 길이 : " + str.length());
//		
//		String str[] = new String[5];
//		str[0] = "jiwon";
//		str[1] = new String("cafe");
//		str[4] = "hi";
//		str[2] = "tree";
//		str[3] = "choi";
//		
//		int count = 0;
//		
//		for(int i = 0; i < str.length; i++ )
//			count += str[i].length();
//		
//		System.out.println("총 문자의 수는 " + count );
//		
//		
//		
//		*얕은 복사*
//		실질적으로 쓰기 보다는 에러가 났을때 알기 위해
//		int[] arr1 = {1,2,3,4,5,};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.print(arr1[2]);
//		
//		//*완전한 복사(깊은 복사)*
//		int[] arr1 = {1,2,3,4,5,};
//		int[] arr2 = new int[5];
//		
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[1] = arr1[1];
//		
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		}
//		
//		//보편적인 배열 복사방법
//			arr2 = arr1.clone();
//		//배열 arr1을 전부 7로 초기화
//			Arrays.fill(arr1, 7);
		
//		String[] str = {"가","나","다","라","마","바","사","아","자","차"};
		
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
		
		//객체란
		//객체는 배열과 행동을 갖는다,
		//소프트웨어 세계에 구현할 대상이며 속성과 기능을 가지는 프로그램 단위
		
		/** 
		 * 1.배열형식의 참조변수 선언
		 * 2. 배열객체 할당
		 * 3. 배열 데이터 초기화
		 * 4. 배열 데이터 활용
		 *  */
		
		//1. int[] ref = {1,2,3,4,5,6,}
		
		//2.int[] ref;
		//ref = new int[6];
		
		int[] ref;
		ref = new int[6]; //ref = new int[] {1,2,3,4,5,6};
		ref[0] = 1;
		ref[1] = 2;
		ref[2] = 3;
		ref[3] = 4;
		ref[4] = 5;
		ref[5] = 6;
		
		//반복문을 이용해서 배열 초기화
		for (int i = 0; i < ref.length; i++)
			ref[i] = i + 1;
		
		//반복문을 이용해서 배열 출력
		for(int i = 0; i < ref.length; i++)
			System.out.print(ref[i]);
		
	}
}
