package JAVA_M_Pos_System;
import java.util.Scanner;
public class HAMMENU {
	private Scanner sc = new Scanner(System.in);
	
	
	private HamController hc = new HamController();
	public void HamController() {
			int menuNum;
		while(true)	{
			System.out.println("1. 메뉴추가");
			System.out.println("2. 메뉴수정");
			System.out.println("3. 메뉴삭제");
			System.out.println("4. 주문하기");
			System.out.println("9. 프로그램 종료");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				insertHam();
				break;
			case 2:
				updateHam();
				break;
//			case 3:
//				deleteHam();
//				break;
//			case 4:
//				printHam();
//				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");

				return;
//			default:
//				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
//				
			}

		}
	}
	
	
	public void insertHam() {
	
		while(true) {
			System.out.println("제품 이름 :");
			String name =sc.next();
			
			System.out.println("제품 종류 :");
			String kind=sc.next();
			
			if(kind.equals("햄버거") ) {
				
			System.out.println("고기 종류 :");
				String meat = sc.next();
			} 
			
			
			System.out.println("가격 :");
			int price =sc.nextInt();
			
			System.out.println("칼로리 :");
			int calorie =sc.nextInt();
			
		
				System.out.println("추가로더 입력하시겠습니까?(Y/N) :");
				String choice = sc.next();
				
			
			
				if(choice.toUpperCase().equals("Y")) {
					System.out.println("추가 제품을 등록합니다.");
					continue;
			}
				
				else if (choice.toUpperCase().equals("N")){
					System.out.println("처음으로 돌아갑니다.");
					break;
					
				}
					else {
						System.out.println("잘못입력하셨습니다.");
						System.out.println("처음으로 돌아갑니다.");

						break;

}
			
			
}
		
}
	
	public void updateHam() {
		System.out.print("가장 최신의 사원 정보를 수정하게 됩니다");
		System.out.print("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.print("1. 제품 이름");
		System.out.print("2. 가격 수정");
		System.out.print("3. 정보수정");
		
		
		
		
	}
	
			
			}
			
		
			
		
		
		
	
		
		
		
		
		

	
	
	
	

