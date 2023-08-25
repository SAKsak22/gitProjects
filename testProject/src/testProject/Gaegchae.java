package testProject;

//public class Gaegchae {
//	public static void main(String[] args) { 
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//		
//		System.out.println(yoon.balance);
//		System.out.println(yoon.balance);
//		
//		yoon.deposit(1000);
//		park.deposit(2000);
//		
//		System.out.println(yoon.checkMyBalance());
//		System.out.println(park.checkMyBalance());
//	 }
//}
//
//	class BankAccount {
//		int balance = 0; // 예금 잔액
//		
//		public int deposit(int amount) {
//			balance += amount;
//			return balance;
//			
//		}
//		
//		public int withdraw(int amount) {
//			balance -= amount;
//			return balance;
//			
//		}
//		
//		public int checkMyBalance() {
//			System.out.println("잔액 : " + balance);
//			return balance;
//		}
//}

		// TODO Auto-generated method stub

		
		//객체는 데이터랑 기능을 갖는다
		//상호작용을 한다
		//함수(function) = 한가지 기능을 수행하는 상자
		//class안에 있는 함수를 method라고 부름 
		//객체지향에서 method는 기능의 역할을 담당함
		// main문은 돌려주는 값 없음
		//데이터만 달라질때 쓰는게 함수(method)
		
//		System.out.println("프로그램의 시작");
//		hiEveryone(12);//함수 호출
//		hiEveryone(13);
//		System.out.println("프로그램의 끝");
//	}
//	public static void hiEveryone(int age) {
//		int age = 12; //넘어오는 값
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 "+ age + "세 입니다.");
//	public static void main(String[] args) {	
//		
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		byEveryone();
//	}
//	
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는" + age + "세 입니다");
//		System.out.println("저의 키는" + height + "cm 입니다");
//	}
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다.");
//	}
		
	
	
//		int result;
//		result = adder(4, 5); //adder가 반환하는 값을 result에 저장
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 x 3.5 = "+ square(3.5));
//	}
//	
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult; // addResult의 값을 반환
		//리턴은 값을 가지고 감
//	}
//	
//	public static double square(double num) {
//		return num * num; // num * num의 결과를 반환
//	}
	
	//return의 의미 1. 값을 반환 2. 여기서 끝낸다
	
//		System.out.println(factorial(3));
//		
//	}
//	public static int factorial(int n) {
//		if(n == 1) {
//			return 1;
//			
//		}else {
//			return n * factorial(n-1);
//		}
//	}
//		
//	                                  
public class Gaegchae {
	public static void main(String[] args) { 
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount(2000, "윤승희");
		BankAccount choi = new BankAccount("윤승희");
//		BankAccount temp;
		
		System.out.println(yoon.balance);
		System.out.println(park.balance);
		
//		yoon.deposit(1000);
//		park.deposit(2000);
		
//		temp = yoon;
//		yoon = park;
//		park = temp;
//		temp = null;
		yoon.checkMyBalance();
		park.checkMyBalance();
		choi.checkMyBalance();
	 }
}
	class BankAccount {
		int balance = 0; // 예금 잔액
		String name;
		public BankAccount() {
			balance = 0;
			name = "이름 없음";
		}
		
		public BankAccount(String n) {
			balance = 0;
			name = n;
		}
		
		public BankAccount(int b, String n) {
			balance = b;
			name = n;
		}
		public int checkMyBalance() {
			System.out.println("잔액 : " + balance);
			System.out.println("이름 : " + name);
			return balance;
			
		}
}
		
//		public int deposit(int amount) {
//			balance += amount;
//			return balance;
//			
//		}
//		
//		public int withdraw(int amount) {
//			balance -= amount;
//			return balance;
//			
//		}
		

	//추상화 : 객체를 생성할 때 

	



