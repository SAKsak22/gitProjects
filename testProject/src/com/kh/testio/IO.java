package com.kh.testio;

import java.io.*;

public class IO {
	
	public void output() {
		
		FileWriter fw = null;
		try{
			
			fw = new FileWriter("test.txt");
			fw.write(97);
			fw.close();
			fw.write(65);
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
