package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Arrays
{
public static void main(String[] args) 
{
	 System.out.println("Enter the First String");
	  String s1 = utility.readString();
	  
	  System.out.println("Enter the second String");
	  String s2 = utility.readString();
	  
	s1 = s1.toUpperCase();
	s2 = s2.toUpperCase();
	
	utility.getArrayequal(s1,s2);
	
	
}
}