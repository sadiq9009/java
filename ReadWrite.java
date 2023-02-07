package com.Sadiq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWrite {
	
	  void Readfile() throws FileNotFoundException {
			 
	        FileInputStream fis = new FileInputStream ("d:/abd.txt"); 
		}
	
//    void Savefile() throws FileNotFoundException {
//		
//    	FileOutputStream fos = new FileOutputStream("d:/abc.txt");
//	}
    
	

	  public static void main(String[] args) {
		
		  
		  ReadWrite rw = new ReadWrite();
		  
			try 
			{
			rw.Readfile();
			}
			catch(FileNotFoundException e) 
			{
				e.printStackTrace();
			}
		  
			
//			try {
//				rw.Savefile();
//			}
//			catch(FileNotFoundException e) 
//			{
//				e.printStackTrace();
//			}
			
		  
		  
	}

}
