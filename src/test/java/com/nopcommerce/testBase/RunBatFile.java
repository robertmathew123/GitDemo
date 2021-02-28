package com.nopcommerce.testBase;
import java.io.IOException;
import java.lang.Runtime;

public class RunBatFile {

	public static void main(String[] args) {
		
		 String filePath = System.getProperty("user.dir")+"\\cleanup.bat";
	  	 try {
			Runtime.getRuntime().exec("cmd start /c filePath");
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
	    }
	}
