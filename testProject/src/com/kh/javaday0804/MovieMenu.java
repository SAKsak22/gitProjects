package com.kh.javaday0804;

public class MovieMenu {
		   
		   // 필드(데이터)
		    private String name;   // 메뉴 이름
		    private int price;     // 메뉴 가격    //추상화
		    private int stock;     // 메뉴 재고

		    
		    // 생성자
		    public MovieMenu (String name, int price, int stock) {
		        this.name = name;
		        this.price = price;
		        this.stock = stock;
		    }
		    
		    public MovieMenu (String name, int price) {
		        this.name = name;
		        this.price = price;
		        
		    }
		    

		    // 메서드 - 주문하기
		    public void order(int quantity) {
		        if (quantity <= stock) {
		            System.out.println(quantity + "개의 " + name + "를 주문했습니다.");
		            stock -= quantity;
		        } else {
		            System.out.println("주문할 수 있는 재고가 부족합니다.");
		        }
		    }

		    // 메서드 - 재고 업데이트
		    public void updateStock(int newStock) {
		        stock = newStock;
		        System.out.println(name + "의 재고가 업데이트되었습니다. 현재 재고: " + stock);
		    }

		    // 메서드 - 메뉴 정보 출력
		    public void printMenuInfo() {
		        System.out.println("메뉴: " + name);
		        System.out.println("가격: " + price + "원");
		        System.out.println("재고: " + stock);
		    }

		    // Getter 메서드 - 메뉴 이름 반환
		    public String getName() {
		        return name;
		    }
		    

		    // Getter 메서드 - 메뉴 가격 반환
		    public int getPrice() {
		        return price;
		    }

		    // Getter 메서드 - 메뉴 재고 반환
		    public int getStock() {
		        return stock;
		    }
}
