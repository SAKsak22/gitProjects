package testProject;

public class Arraymulti {

	public static void main(String[] args) {
		
//		Char[][] str1 = new Char[3][3];
		
//		str[0][0] = "(0, 0)";
//		str[0][1] = "(0, 1)";
//		str[0][2] = "(0, 2)";
//		
//		str[1][0] = "(1, 0)";
//		str[1][1] = "(1, 1)";
//		str[1][2] = "(1, 2)";
//		
//		str[2][0] = "(2, 0)";
//		str[2][1] = "(2, 1)";
//		str[2][2] = "(2, 2)";
//		
//		
//		
//		for(int i = 0; i < str.length; i++) {
//			for(int j = 0; j <str[i].length; j++) {
//				System.out.print(str[i][j]);
//			}
//			System.out.println();
//		}
		
//		char[][] ch = new char[3][3];
//		char ch2 ='a';
//		
//		ch[0][0] = ch2++;
//		ch[0][1] = ch2++;
//		ch[0][2] = ch2++;
//		
//		ch[1][0] = ch2++;
//		ch[1][1] = ch2++;
//		ch[1][2] = ch2++;
//		
//		ch[2][0] = ch2++;
//		ch[2][1] = ch2++;
//		ch[2][2] = ch2++;
//		
////		for(int i = 0; i < ch.length; i++) { 
////			for(int j = 0; j <ch[i].length; j++) {
////				ch[i][j] = ch2++;
////				
////			}
////	
////		}
//		for(int i = 0; i < ch.length; i++) { 
//			for(int j = 0; j <ch[i].length; j++) {
//				System.out.print(ch[i][j]+" ");
//			}
//			
//			System.out.println();
//		}
		
//		int[][] num = new int[4][4];
//		int num2 = 1;
//		
//		num[0][0] = num2++;
//		num[0][1] = num2++;
//		num[0][2] = num2++;
//		num[0][3] = num2++;
//		
//		num[1][0] = num2++;
//		num[1][1] = num2++;
//		num[1][2] = num2++;
//		num[1][3] = num2++;
//		
//		num[2][0] = num2++;
//		num[2][1] = num2++;
//		num[2][2] = num2++;
//		num[2][3] = num2++;
//		
//		num[3][0] = num2++;
//		num[3][1] = num2++;
//		num[3][2] = num2++;
//		num[3][3] = num2++;
		
		
		
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				num[i][j] = num2++;
//			}
//			
//		}
//		
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++)
//				System.out.print(num[i][j]+" ");
//		}
		
//		int[][] arr = new int[4][4];
//		int num = 16;
//		
//		arr[0][0] = num--;
//		arr[0][1] = num--;
//		arr[0][2] = num--;
//		arr[0][3] = num--;
//		
//		arr[1][0] = num--;
//		arr[1][1] = num--;
//		arr[1][2] = num--;
//		arr[1][3] = num--;
//		
//		arr[2][0] = num--;
//		arr[2][1] = num--;
//		arr[2][2] = num--;
//		arr[2][3] = num--;
//		
//		arr[3][0] = num--;
//		arr[3][1] = num--;
//		arr[3][2] = num--;
//		arr[3][3] = num--;
		
//		for(int i = 0; i > arr.length; i--) {
//			for(int j = 0; j > arr[i].length; j--)
//				arr[i][j] = num--;
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//		}
//			System.out.println();
//	}
		
//		int[][] arr = new int[4][4];
//		
//		//i = 0~3
//		//j = 0~3
//		for(int i = 0; i < arr[0].length; i ++) {
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[i][j] = (j + 1 + (i * 3));
//				arr[i][3] += arr[i][j];
//				arr[3][3] += arr[i][j];
//			}	
//			
//			arr[3][0] += arr[i][0];
//			arr[3][1] += arr[i][1];
//			arr[3][2] += arr[i][2];
//			arr[3][3] += arr[i][0];
//			arr[3][3] += arr[i][1];
//			arr[3][3] += arr[i][2];
//			
//		}
//		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2] +
//				arr[0][3] + arr[1][3] +  arr[2][3];
//		
//		arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
//		arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
//		arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];
//			
//		
//		}
		
		

//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = (arr[0][0]+arr[0][1]+arr[0][2]);
//		
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		arr[1][3] = (arr[1][0]+arr[1][1]+arr[1][2]);
//		
//		arr[2][0] = 7;
//		arr[2][1] = 8;
//		arr[2][2] = 9;
//		arr[2][3] = (arr[2][0]+arr[2][1]+arr[2][2]);
//		
//		arr[3][0] = (arr[0][0]+arr[1][0]+arr[2][0]);
//		arr[3][1] = (arr[0][1]+arr[1][1]+arr[2][1]);
//		arr[3][2] = (arr[0][2]+arr[1][2]+arr[2][2]);
//		
//		arr[3][3] = (arr[3][0]+arr[3][1]+arr[3][2]
//				+ arr[0][3]+arr[1][3]+arr[2][3]);
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j <arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//			sum =+ arr.length;
//			
//			System.out.print(arr[i][j]+" ");
//		}
//		System.out.println();
//	}
//		int nan = (int)(Math.random() * 10 + 1);
//		
//		for (int i = 0; i < arr.length; i++) {
//				
//		    for (int j = 0; j < arr[i].length; j++) {
//		    	
//		        sum += arr[i][j];
//		        arr[i][j]=1;
//		        System.out.print(arr[i][j] + " ");
//		    }
//		    System.out.println();
//		}
		
		
	
 }

}
