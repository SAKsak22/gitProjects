package DAY0825;

public class TEST1 {

	class Man{
		String name;
		public void tellYourName() {
			System.out.println("My name is " + name);
		}
	}
	
	class BusinessMan extends Man {
		String company;
		String position;
		public void tellYourInfo() {
			System.out.println("My company is" + company);
			System.out.println("My company is" + position);
			tellYourName();
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
