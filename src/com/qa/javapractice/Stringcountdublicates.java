package com.qa.javapractice;

import java.util.HashMap;

public class Stringcountdublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1= "keeperkeep";
		

		HashMap<Character,Integer> stringcount= new HashMap<Character,Integer>();
		
		char[] strArray= S1.toCharArray();
		
		for(char c: strArray ) {
			
			if(stringcount.containsKey(c)) {
				
				stringcount.put(c, stringcount.get(c) +1);
				
			}
			else
			{
				stringcount.put(c, 1);
				
			}
		}
      System.out.println(stringcount);
	}

}
