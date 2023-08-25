package testProject;

public class Arraymulti2 {

	public static void main(String[] args) {
		
		
		String str = "안녕하세요";
		
		if(str.equals("hi")) {
			System.out.print("hi");
			
		}else {
			System.out.print(str);
		}
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 5;
			System.out.print(arr[i]);
		}
		
		
		//참조변수 선언하고 대입하고 출력
//		char[][] ch = {{'a','b'},{'c','d'},{'e','f'}};
//		
//		for(int i = 0; i < ch.length; i++) {
//			for(int j = 0; j < ch[i].length; j++) {
//				System.out.print(ch[i][j]+" ");
				
		//반복문으로 대입하고 출력
		char[][] arr2 = new char[3][2];
		char ch = 'a';
				
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = ch++;
				System.out.print(arr2[i][j]);
			
			}
			
		}

	}

}
