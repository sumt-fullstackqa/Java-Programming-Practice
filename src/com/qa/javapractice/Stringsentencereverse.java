package com.qa.javapractice;

import java.util.regex.Pattern;

public class Stringsentencereverse {
	
	
	
	public static void reversewords(String str)
	{
		  Pattern pattern = Pattern.compile("\\s");
		
		String result="";
		
		String[] temp= pattern.split(str);
		
		for(int i=temp.length-1; i>=0; i--)
		{
			
			result=result+" "+ temp[i];
				
		}
		
		System.out.println(result);
	}
		
		
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		reversewords("Ram is going to school");
		
		
	}

}
