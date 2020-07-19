package com.qa.javapractice;

import java.util.HashMap;

public class Arraycountduplicates {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int a[]= {4,5,5,5,4,6,6,9,4};
		
		HashMap<Integer,Integer> recurssion= new HashMap<Integer,Integer>();
		
		for(int i=0; i<a.length;i++)
		{
			if(recurssion.containsKey(a[i]))
			{
				recurssion.put(a[i], recurssion.get(a[i])+1);
				
			}
			else
			{
				recurssion.put(a[i], 1);
			}

		}
       System.out.println(recurssion);
	}

}
