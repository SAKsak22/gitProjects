package com.kh.review;

public class Book {
	String title;
	
	Book(String title){
		this.title = title;
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title;
	}
	
	
	
	
	
}
