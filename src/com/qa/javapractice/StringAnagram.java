package com.qa.javapractice;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s1= "listen";
		
		String s2= "silent";
		
		int counts1=0;
		int counts2=0;
		
		for (int i=0; i<s1.length(); i++)
		{
				
			counts1++;
		
		}
		System.out.println(counts1);

	for (int i=0; i<s2.length(); i++)
	{
			
		counts2++;
	
	}
	System.out.println(counts2);


	if (counts1==counts2) {
		
		 System.out.println(" strings are anagram");
		
	}
	else 
	{
		System.out.println("strings are not anagram");
	}
	
	}
}
