package testProject;

import java.util.Scanner;

public class Switchpractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String ID,PW;
		ID = "abc";
		PW = "1234";
		
		String id2, pw2;
				
		System.out.print("아이디 : ");
		id2 = sc.next();
		System.out.print("비밀번호 : ");
		pw2 = sc.next();
		
		
		if(ID.equals(id2) && PW.equals(pw2)) {
			System.out.print("로그인 성공");
		}
		else if(!ID.equals(id2)){
			System.out.print("아이디가 틀렸습니다.");
		}else if(!PW.equals(pw2)) {
			System.out.print("비밀번호가 틀렸습니다.");
		}
		
	}
}
