package com.kh.testfood;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int kcal;
	
	public Food() {
		
	}
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return this.kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	   public String toString() {
	      // TODO Auto-generated method stub
	      return this.name + this.kcal;
	   }
	   
	   public void saveFile(String fileName) {
	      try(FileOutputStream fos = new FileOutputStream(fileName); 
	         ObjectOutputStream oos = new ObjectOutputStream (fos)){
	         
	         oos.writeObject(this);
	         
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	   }
	

}
