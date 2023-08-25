package testProject;
import java.util.*;

public class Input {
	public static void main(String[] args) {
//		String name = "아무개";
//		char gender  = '남';
//		int age;
//		double height = 180.5;
//		
//		System.out.println("이름을 입력하세요 :" + name);
//		System.out.println("성별을 입력하세요(남/여) :" + gender);
//		System.out.println("나이를 입력하세요 :");
//		System.out.println("키를 입력하세요(cm)" + height);
//		System.out.println("키 180.5cm인 20살 남자 아무개님 반갑습니다^^");
		
		// 1. 변수가 몇개 필요한지 체크
		// 2. 내가 할 수 있는 출력 해보고
		// 3. 입력받아야 할 곳에 입력 넣고
		// 4. 입력받은 값을 활용해서 출력
		
		//키보드 쓰려면 무조건 써라
		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		int age;
		float height;
		
		System.out.print("이름을 입력하세요:");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여):");
		gender = sc.nextLine();
		System.out.print("나이를 입력하세요:");
		age = sc.nextInt();
		System.out.print("키를 입력하세요:");
		height = sc.nextFloat();
		System.out.print("키 "  + height+"cm인 "+age+"살"
				+ "" + gender + "자 "+name+"남"+ "반갑습니다^^");
	
	
	}
}

