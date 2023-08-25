package testProject;

public class Forpractice {
public static void main(String[] args) {
		
	//초기식 : 반복문을 시작할 때 한번 세팅을 위한 값
	//조건식 : 매번 반복하기 전에 조건에 부합하는지 확인 후 부합하면 반복 진행
	//증감식 : 반복이 끝날 때마다 반복문 탈출을 위해 한번 연산을 진행
		for(int i = 0; i < 10; i++) {
			System.out.print(i + "출력");
		}
		
		int g = 0;
		while(g < 10)
			g++;
			System.out.print(g + "출력");
	}
 }
