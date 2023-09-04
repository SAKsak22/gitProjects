package JAVA_M_Pos_System;

public class HamController {
	private HAM h = new HAM();
	
	
	public void add(String name,String kind,  int price, int calorie) {
		h.setName(name);
		h.setKind(kind);
		h.setPrice(price);
		h.setCalorie(calorie);
	}
	
	
	public void add(String name,String kind, String meat, int price, int calorie) {
		h.setName(name);
		h.setMeat(meat);
		h.setKind(kind);
		h.setPrice(price);
		h.setCalorie(calorie);
	}
	
	public void modify(String name) {
		h.setName(name);
	}
	
	public void modify2(String meat) {
		h.setMeat(meat);	
		}
	
	public void modify(int price) {
		h.setPrice(price);	
		}
	
	public void modify2(int calorie) {
		h.setCalorie(calorie);
	}
	
	
	public HAM remover() {
		h = null;
		return h;
	}
	
	public String inform() {
		return h == null ? null : h.printHAM();
	}

	
	
	
}
