package JAVA_M_Pos_System;

public class HAM {
	private String name;
	private String meat;
	private String kind;
	private int price;
	private int calorie;
	
	
	public HAM() {
		// TODO Auto-generated constructor stub
	}
	public HAM(String name,String kind,  int price, int calorie) {
		
		this.name = name;
		this.kind = kind;
		this.price = price;
		this.calorie = calorie;
	
	}
	
	public HAM(String name, String kind, String meat, int price, int calorie) {
	
		this.name = name;
		this.kind = kind;
		this.meat = meat;
		this.price = price;
		this.calorie = calorie;
	}
	
	


	


	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public String getMeat() {
		return meat;
	}


	public void setMeat(String meat) {
		this.meat = meat;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCalorie() {
		return calorie;
	}


	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}


	
	public String printHAM() {
		// TODO Auto-generated method stub
		return this.name+ " " + this.meat + " "+ this.price+ " "+this.calorie
				+ " "+this.kind	;
	}

	}
	
	
	
	
	
	
	

