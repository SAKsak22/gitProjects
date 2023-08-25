package testProject;

import java.util.Scanner;

public class Ifelse7 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		    int pay1, pay2, pay3;
			
			System.out.print("A사원의 연봉 : ");
			pay1 = sc.nextInt();
			System.out.print("B사원의 연봉 : ");
			pay2 = sc.nextInt();
			System.out.print("C사원의 연봉 : ");
			pay3 = sc.nextInt();
			
		
			
			System.out.println("A사원의 연봉/연봉+a :"+pay1+"/"+ (pay1 +(pay1 * 0.4)));
			if(pay1 + (pay1 * 0.4) > 3000) {
				System.out.println("3000 이상");
			}
			else {
				System.out.println("3000 미만");
			}
			System.out.println("B사원의 연봉/연봉+a :"+pay2+ "/"+ (pay2 ));
			if(pay2 >+ 3000) {
				System.out.println("3000 이상");
			}
			else {
				System.out.println("3000 미만");
			}
		    System.out.println("C사원의 연봉/연봉+a :"+pay3+ "/"+ (pay3 +(pay3 *0.15)));
		    if(pay3 + (pay3 * 0.15) >+ 3000) {
				System.out.println("3000 이상");
			}
			else {
				System.out.println("3000 미만");
			}
			
			
			
			
	}

}
