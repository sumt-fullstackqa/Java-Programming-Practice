package com.qa.javapractice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "rahul";
		
		String t="";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			
			t= t+s.charAt(i);
		
		}
		System.out.println(t);
	}
}