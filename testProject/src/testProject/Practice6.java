package testProject;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String rating;
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		rating = sc.next();
		
		switch(rating) {
		
		case "회원" : 
			System.out.print("회원관리, 게시글 관리, 게시글 조회, 댓글 작성");
		         break;
		case "관리자" : 
			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
		         break;
		default :
			System.out.print("비회원은 게시글 조회만 가능합니다.");
		}
		
	
//		if(rating.equals( "관리자")) {
//			    System.out.print("회원관리, 게시글 관리, 게시글 조회, 댓글 작성");
//			
//		    } else if(rating.equals( "회원")) {
//				System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
//			
//		    } else {
//				System.out.print("비회원은 게시글 조회만 가능합니다.");
//				
//		    }
 
 }
}

