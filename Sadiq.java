package com.Sadiq;


public class Sadiq {
	
	 static String fname = "Shaik";
	
	 static String lname = "Abdulsadiq";

	public static void main(String[] args) {
		
		//Sadiq obj = new Sadiq();
		//System.out.println(obj.fname+" "+obj.lname);
		
	     System.out.println(fname+lname);
	     System.out.println(lname.length());
	     System.out.println(fname.length()-1);
	     System.out.println(fname.charAt(3));
	     System.out.println(lname.replace("Abdul","ABDUL"));
	     System.out.println(fname.indexOf("i"));
	     System.out.println(fname.concat(lname));
	     System.out.println(fname.substring(2));
     
}
}