package testProject;

import java.util.Scanner;

public class Gaekchaepractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row, col;
      
      do {
         System.out.print("행의 크기(1 ~ 10)를 입력하세요: ");
         row = sc.nextInt();
         
         if (row < 1 || row > 10)
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
      } while(row < 1 || row > 10);
      
      do {
         System.out.print("열의 크기(1 ~ 10)를 입력하세요: ");
         col = sc.nextInt();
         
         if (col < 1 || col > 10)
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
      } while(col < 1 || col > 10);
      
            char[][] arr = new char[row][col];
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = (char)(Math.random() * 26 + 65);
         }
      }
     
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
      
      
//      String[][] strArr = new String[][] {
//         {"이", "까", "왔", "앞", "힘"}, 
//         {"차", "지", "습", "으", "냅"}, 
//         {"원", "열", "니", "로", "시"}, 
//         {"배", "심", "다", "좀", "다"},
//         {"열", "히", "! ", "더", "!! "}};
//         
//      for (int i = 0; i < strArr[i].length; i++) {
//         for (int j = 0; j < strArr.length; j++) {
//            System.out.print(strArr[j][i] + " ");
//         }
//         System.out.println();
//      }
		
//		double nem = 3.75;
//		
//		int num2;
//		num2 = sc.nextInt();
//		
//		int[] arr = new int[num2];
//		for(int i = 0; i < arr.length; i++) {
//			num2 = sc.nextInt();
//			arr[i] = 5;
//			arr[2] = 0;
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			if (arr[i] == 5) {
//				System.out.println();
//			}
//		}else
		
//		int kr, en, ma;
//		
//		System.out.print("국어 : ");
//		kr = sc.nextInt();
//		System.out.print("영어 : ");
//		en = sc.nextInt();
//		System.out.print("수학 : ");
//		ma = sc.nextInt();
//		
//		System.out.print("합계 : ");
//		System.out.print(kr + en + ma);
//		System.out.print("평균 : ");
//		System.out.print((kr + en + ma) / (float)3);
//		
//		if((kr > 50 && en > 50 && ma > 50 && ((kr + en + ma) / (float)3) >= 60 )) {
//			System.out.print("합격입니다");
//			
//			
//			}else {
//				System.out.print("불합격입니다");
//			}
		
//		int num;
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//		while(true) {
//			
//		if (num >=1) {
//			for(int i = num; i > 0; i--) {
//			System.out.print(i + " ");
//			}
//			break;
//		} else {
//			System.out.print("1 이상의 숫자를 입력해주세요.");
//		}
//		
//		}
//		
//		}
		
		
//		int num1, num2;
//		
//		System.out.print("행 크기 : ");
//		num1 = sc.nextInt();
//		System.out.print("열 크기 : ");
//		num2 = sc.nextInt();
//		
//		
//		if((num1 < 1 || num2 < 1) || (num1 > 10 || num2 > 10) ) {
//			System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다");
//		}else {
//		
//		char[][] arr = new char[num1][num2];
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (char)( Math.random() * 26 + 65);
//			}
//				
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j] + " ");
//				
//	    }
//	}
//			System.out.println();
//		
//		}
		
//		String[][] strArr = new String[][] {{"이","까","왔","앞","힘"},
//											{"차","지","습","으","냅"},
//											{"원","열","니","로","시"},
//											{"배","심","다","좀","다"},
//											{"열","하","ㅣ","더","ㅣㅣ"}};
//		
//		for(int i = 0; i < strArr.length; i++) {
//			for(int j = 0; j < strArr[i].length; j++) {
//				System.out.print(strArr[j][i]+" ");
//			}
//			System.out.println();
//		}
		
//		int num;
//		
//		System.out.print("행의 크기 : ");
//		num = sc.nextInt();
//		
//		char[][] arr = new char[num][];
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(i + "열의 크기 : ");
//			num = sc.nextInt();
//			int co1;
//			System.out.print(i + "열의 크기를 입력하세요. : ");
//			co1 = sc.nextInt();
//			
//			arr[i] = new char[co1];
//		}
//		
//		char a = 'a';
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = a++;
//				System.out.print(arr[i][j]);
//				
//			}
//			System.out.println();
//		}
		
		String[] students = {
	            "강건강", "남나나", //0,1
	            "도대담", "류라라", //2,3
	            "문미미", "박보배", //4,5
	            "송성실", "윤예의", //6,7
	            "진재주", "차천축", //8,9
	            "피풍표", "홍하하"  //10,11
	        };
	        
	        String[][] classRoom1 = new String[3][2];
	        String[][] classRoom2 = new String[3][2];
	        
	        int index = 0;
	      for (int i = 0; i < classRoom1.length; i++) {
	         for (int j = 0; j < classRoom1[i].length; j++) {
	            classRoom1[i][j] = students[index];
	            index += 1;
	         }
	      }
	        
	      for (int i = 0; i < classRoom2.length; i++) {
	         for (int j = 0; j < classRoom2[i].length; j++) {
	            classRoom2[i][j] = students[index];
	            index += 1;
	         }
	      }
	        
	      System.out.println("== 1분단 ==");
	      for (int i = 0; i < classRoom1.length; i++) {
	         for (int j = 0; j < classRoom1[i].length; j++) {
	            System.out.print(classRoom1[i][j] + " ");
	         }
	         System.out.println();
	      }
	      System.out.println("== 2분단 ==");
	      for (int i = 0; i < classRoom2.length; i++) {
	         for (int j = 0; j < classRoom2[i].length; j++) {
	            System.out.print(classRoom2[i][j] + " ");
	         }
	         System.out.println();
	      }
	      
	      System.out.println("검색할 학생 이름을 입력하세요.");
	      String target = sc.next();
	      int bundan = 0, line = 0, isRight = 0;
	      boolean isTrue = false;
	      
	      for (int i = 0; i < classRoom1.length && !isTrue; i++) {
	         for (int j = 0; j < classRoom1[i].length && !isTrue; j++) {
	            if (classRoom1[i][j].equals(target)) {
	               bundan = 1;
	               line = i;
	               isRight = j;
	               isTrue = true;
	            }
	         }
	      }
	      
	      if (!isTrue) {
	         for (int i = 0; i < classRoom2.length && !isTrue; i++) {
	            for (int j = 0; j < classRoom2[i].length && !isTrue; j++) {
	               if (classRoom2[i][j].equals(target)) {
	                  bundan = 2;
	                  line = i;
	                  isRight = j;
	                  isTrue = true;
	               }
	            }
	         }
	      }
	      
	      
	      if (isTrue) {
	         System.out.print("검색하신 "+ target +" 학생은 "+ bundan +
	         "분단 "+( line == 0 ? ("첫번째") : (line == 1 ? ("두번째") : ("세번째")) )+" 줄"
	               + " "+(isRight == 0 ? "왼쪽" : "오른쪽")+"에 있습니다.");
	      } else {
	         System.out.print("검색하신 " + target + "학생은 찾지 못했습니다.");
	      }
      
           
      
	}

}
