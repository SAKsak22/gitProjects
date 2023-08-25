package com.kh.testfood;

import java.io.File;
import java.io.IOException;


public class Run {
		   public static void main(String[] args) {
		      String filePath = "myFile.txt";

		      try {
		         File file = new File(filePath);
		         boolean isFileCreated = file.createNewFile();

		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		      
		      Food apple = new Food("사과", 50);
		      apple.saveFile(filePath);

 }
}