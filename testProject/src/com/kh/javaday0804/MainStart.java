package com.kh.javaday0804;
import java.util.Scanner;

// main메서드를 실행해주기위한 class
public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//최대 학생에 수는 30인 클레스(i, h, j)를 3개 만들어라
		
		//Student 클래스에 iban이라는 index30개짜리 객체배열을 생성해서 대입
//		Student[] iban = new Student[30];
//		//Student 클래스에 jban이라는 index30개짜리 객체배열을 생성해서 대입
//		Student[] jban = new Student[30];
//		//Student 클래스에 hban이라는 index30개짜리 객체배열을 생성해서 대입
//		Student[] hban = new Student[30];
//		//선택한 반의 주소값을 가지고 있는 참조변수
//		Student[] selectBan;
//		//참일 경우에 계속해서 실행을 해야하니 while반복문 실행
//		while(true) {
//			// 관리할 클레스를 선택해 주세요. (i j k 반중 선택) :
//			System.out.print("관리할 클래스를 선택해 주세요. (i j h반 중 선택 다른키워드 입력시 종료) : ");
//			//i j h중 입력 받은 값을 실행해야 하니 switch문 실행
//			switch(sc.next().charAt(0)) {
//				//i 입력받으면 selectBan으로 iban을 대입
//				case 'i':
//					selectBan = iban;
//					//i 반을 입력받으면 break;로 switch문 빠져나감
//					break;
//				//j 입력받으면 selectBan으로 jban을 대입	
//				case 'j':
//					selectBan = jban;
//					//j 반을 입력받으면 break;로 switch문 빠져나감
//					break;
//				//h 입력받으면 selectBan으로 hban을 대입	
//				case 'h':
//					selectBan = hban;
//					//h 반을 입력받으면 break;로 switch문 빠져나감
//					break;
//				//입력받은 값들이 i j h가 아니면 selectBan을 null로 대입
//				default:
//					selectBan = null;
//			}
//			//selectBan이 null과 같으면 break;걸려서 밑에 문장들 실행
//			if (selectBan == null)
//				break;
//			
//			// 1. 학생추가
//			// 2. 학생제거
//			// 3. 학생목록 확인
//			// 기타입력시 뒤로 그전까지 반복
//			//boolean 자료형 안에 isTrue라는 이름의 변수를 선언해주고 거기에 true를 대입
//			boolean isTrue = true;
//			//isTrue에 true가 들어있음으로 조건식이 참일경우 아래 문장들을 모두 반복
//			while(isTrue) {
//				System.out.println("1. 학생추가");
//				System.out.println("2. 학생제거");
//				System.out.println("3. 학생목록 확인");
//				System.out.println("4. 학생조회");
//				System.out.println(" 기타입력시 뒤로");
//				//조건식을 입력 받아서 case 1, case 2, case 3, case 4에 해당하면 case문을 실행하고 아닐경우 isTrue
//				//= false가 되어서 반복문 끝남
//				switch(sc.nextInt()) {
//					//입력받은 값이 1일 경우 아래 문장들 실행
//					case 1: {
//						// selectBan의 마지막 빈자리를 찾는다.
//						// index 의 초기값은 0
//						int index = 0;
//						//index가 0임으로 selectBan의 길이가 0보다 높거나 selectBan[index]가 null이 아닐때까지
//						//반복문 실행
//						//index는 반복문 한번 돌때마다 1씩 증가
//						while(index < selectBan.length && selectBan[index] != null) {
//							index++;
//						}
//						
//						// selectBan에 자리가 있을 시 학생을 추가해 준다.
//						// index가 selectBan의 길이와 같아지면 더이상 추가해줄 수 없음으로 밑에 문장 출력
//						if (index == selectBan.length)
//							System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
//						// 그렇지 않으면 계속해서 학생을 추가한다
//						else {
//							System.out.println("추가할 학생의 이름, 나이, 성별을 입력해 주세요.");
//							//selectBan[index]에 name, age, gender 매개변수 대입
//							selectBan[index] =  new Student(sc.next(), sc.nextInt(), sc.next());
//						}
//					//case1이 끝나면 break로 밑에 문장들 실행하지 않고 switch문 탈출
//					}break;
//					//입력 받은 값이 2일 경우 아래 문장들 실행
//					case 2: {
//						//index가 0임으로 selectBan의 길이가 0보다 높거나 selectBan[index]가 null이 아닐때까지
//						//반복문 실행
//						//index는 반복문 한번 돌때마다 1씩 증가
//						int index = 0;
//						while(index < selectBan.length && selectBan[index] != null) {
//							index++;
//						}
//						//index가 0과 같아지면 밑에 문장 출력
//						if (index == 0)
//							System.out.println("삭제할 학생이 없습니다.");
//						//그게 아니라면 selectBan[index -1]에 null을 대입하고 student객체에 있는 count에 --
//						else {
//							selectBan[index - 1] = null;
//							Student.count--;
//						}
//					//case2 가 끝나면 break로 밑에 문장들 실행하지 않고 switch문 탈출
//					}break;
//					//입력받은 값이 3일경우 아래 문장들 실행
//					case 3: {
//						System.out.println("---------------------------");
//						System.out.println("이름\t나이\t성별");
//						//int i에 0을 대입,  i 가 selectBan의 길이보다 작을때 까지 반복문 실행,
//						//한번 실행 할때마다 i++
//						for (int i = 0; i < selectBan.length; i++) {
//							//selectBan[i]가 null과 같아지면 탈출
//							if (selectBan[i] == null)
//								break;
//							//selectBan은 Student 객체와 같은 곳을 가르키니 Student.info랑 같음
//							selectBan[i].info();
//						}
//						System.out.println("---------------------------");
//					//case3이 끝나면 아래 문장 실행 하지 않고 switch문 탈출
//					}break;
//					case 4: {
//						//조회할 학생의 정보를 입력하세요(이름, 나이, 성별)
//						//이름 나이 성별을 입력 받음
//						System.out.println("조회할 학생의 정보를 입력하세요(이름, 나이, 성별) : ");
//						String name = sc.next();
//						int age = sc.nextInt();
//						String gender = sc.next();
//						//Student 객체의 tmp라는 변수를 선언해서 null을 대입
//						Student tmp = null;
//						
//						//selectBan에 해당 정보와 동일한 학생조회
//						//int i에 0을 대입; i가 selectBan의 길이보다 작을때까지 반복문 실행; 한번 실행하면
//						//i에 1을 더함
//						for (int i = 0; i < selectBan.length; i++) {
//	//잘모르겠음				//selectBan[1]가 null과 같으면 탈출(어디로 탈출하는지 모르겠음)
//							if (selectBan[i] == null)
//								break;
//							//위의 문장이 참이 아니고 selextBan[i]가 name, age, gender과 같다면 
//							//tmp에 selectBAn[i]를 대입시킴. tmp에는 null이 들어있음
//							else if (selectBan[i].equals(name, age, gender)) {
//								tmp = selectBan[i];
//								//위 조건을 실행 후 탈출
//								break;
//							}
//						}
//						
//						//해당 학생은 이미 등록 완료되었습니다.
//						// or 해당학생을 찾을 수 없습니다.
//						//만약 tmp가 null과 같지 않다면 아래 문장 출력
//						if (tmp != null)
//							System.out.println("해당 학생은 이미 등록 완료되었습니다.");
//						//tmp가 null이라면 아래문장 출력
//						else 
//							System.out.println("해당학생을 찾을 수 없습니다.");
//					//case4 탈출
//					}break;
//					//위의 문장들이 모두 사실이 아니라면 isTrue = false로 반복문 실행안함
//					default:
//						isTrue = false;
//				}
//			}
//			
//		}
		
//		// 고객정보시스템
//		POSSystem pos = POSSystem.getPosInstance();
//		pos.saveCustomer(new Customer("김소망", "myId", "myPassword12", "asd123@naver.com"));
//		
//		boolean isLoop = true;
//		while(isLoop) {
//			switch(pos.printMenu()) {
//				case 1:{ // 회원등록
//					pos.joinCustomer();
//				}break;
//				case 2:{ // 회원삭제
//					pos.deleteLastCustomer();
//				}break;
//				case 3:{ // 회원목록출력
//					pos.viewCustomerList();
//				}break;
//				case 4:{ // 로그인
//					pos.login();
//				}break;
//				default:
//					isLoop = false;
//			}
//		}
		
		//길이가 10인 Customer 객체배열을 생성하고
		//0번쨰 인덱스값에 id : myId, password : myPassword12로 객체생성(이름 이메일 자유)
//		Customer[] customerArr = new Customer[10];
//		customerArr[0] = new Customer("김소망", "myId", "myPassword12", "asd123@naver.com");
//		
		//++-------------------회원삭제---------------------------++
		// 마지막으로 등록된 회원을 삭제한다.
//		for(int i = customerArr.length - 1; i >= 0; i--) {
//			if (customerArr[i] != null ) {
//				customerArr[i] = null;
//				break;
//			}
//		}
		//----------------------------------------------------------
		
		//++-------------------모든 회원 출력---------------------------++
		//이름 아이디 비밀번호 이메일
//		System.out.println("이름\t아이디\t비밀번호\t이메일");
//		for (int i = 0; i < customerArr.length; i++) {
//			if (customerArr[i] == null)
//				break;
//			System.out.println(customerArr[i].toString());
//		}
		
		//-------------------모든 회원 출력---------------------------
		
		
		//++-------------------회원가입---------------------------++
		//아이디, 비밀번호, 이름, 이메일을 입력받아 Customer객체를 추가해보자
		/*
		 * 아이디를 입력하세요 :
		 * 비밀번호를 입력하세요 :
		 * 이름을 입력하세요 :
		 * 이메일을 입력하세요 :
		 * 
		 * 이름 : ooo
		 * 이메일 : ooo
		 * ID : ooo
		 * Password : ooo
		 * 회원정보가 정상적으로 등록되었습니다.
		 */
		
//		for (int i = 0; i < customerArr.length; i++) {
//			if (customerArr[i] == null) {
//				String name, psw, id, email;
//				System.out.print("아이디 : ");
//				id = sc.next();
//				
//				System.out.print("비밀번호를 입력하세요 : ");
//				psw = sc.next();
//				
//				System.out.print("이름을 입력하세요 : ");
//				name = sc.next();
//				
//				System.out.print("이메일을 입력하세요 : ");
//				email = sc.next();
//				customerArr[i] = new Customer(name, id, psw, email);
//				
//				System.out.println(customerArr[i].toString());
//				System.out.println("회원정보가 정상적으로 등록되었습니다.");
//				break;
//			} else if (i == customerArr.length - 1) {
//				System.out.print("더이상 회원을 등록할 수 없습니다.");
//			}
//		}
		// -----------------------회원가입------------------------------
		
		// ++----------------------로그인 ---------------------++
//		Customer loginCustomer;
//
//		String id, psw;
//		
//		System.out.print("아이디 : ");
//		id = sc.next();
//		
//		System.out.print("비밀번호 : ");
//		psw = sc.next();
//		
//		for (int i = 0; i < customerArr.length; i++) {
//			if (customerArr[i] == null) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//				break;
//			} else if (customerArr[i].equals(id, psw)) {
//				loginCustomer = customerArr[i];
//				System.out.print("로그인 성공");
//				break;
//			} else if (customerArr[i].idCheck(id)) {
//				System.out.print("비밀번호가 틀렸습니다.");
//				break;
//			} else if (i == customerArr.length - 1) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//			}
//		}
		
		// ----------------------로그인 ---------------------
		
		MovieMenu popcorn = new MovieMenu("팝콘", 5000, 10);
		MovieMenu nacho = new MovieMenu("나초", 4000, 5);
		MovieMenu drink = new MovieMenu("음료수", 2000);
		
		popcorn.printMenuInfo();
		nacho.printMenuInfo();
		drink.printMenuInfo();
		
		popcorn.order(3);
		nacho.order(2);
		drink.order(1);
		
		
	}
}