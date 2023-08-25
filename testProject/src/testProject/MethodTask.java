//package testProject;
//
//public class MethodTask {
//
//	void getSumFrom1(int end){
//		int result = 0;
//		
//		if(end > 1) {
//			for (int i = 1; i < end+1; i++) {
//				result += i;
//			}
//			System.out.println(result);
//		} else {
//			System.out.println("1보다 큰 수를 입력하세요.");
//		}
//	}
//	
//	void div(int num1, int num2) {
//		double result = 0.0;
//		if(num2 != 0) {
//			result = Double.parseDouble(String.format("%.3f", (double)num1/num2));
//			System.out.println(result);
//		} else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		MethodTask m = new MethodTask();
//		m.getSumFrom1(5);
//		m.div(10, 3);
//	 
//	}
//
//}
