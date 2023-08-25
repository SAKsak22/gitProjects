package testProject;

import java.util.Scanner;

public class Ifelse8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int month;
		String season;
		
		month = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
		}else if(month >=  3 && month <= 5) {
			season = "봄";
		}else if(month >=  6 && month <= 8) {
			season = "여름";
		}else if(month >=  9 && month <= 11) {
		    season = "가을";
		}else {
			season = "해당하는 계절이 없습니다.";
		}
		
		switch(month) {
		
		case 1: System.out.println("겨울");
		case 2: System.out.println("겨울");
		case 12: System.out.println("겨울");
		     season = "겨울";
		     break;
		case 3: System.out.println("봄");
		case 4: System.out.println("봄");
		case 5: System.out.println("봄");
		     season = "봄";
		     break;
		case 6: System.out.println("여름");
		case 7: System.out.println("여름");
		case 8: System.out.println("여름");
		     season = "여름";
		     break;
		case 9: System.out.println("가을");
		case 10: System.out.println("가을");
		case 11: System.out.println("가을");
		     season = "가을";
		     break;
		default : System.out.println("해당하는 계절이 없습니다.");
			
		
		
		}

	}
}
