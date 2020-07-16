package com.qa.javapractice;

import java.util.ArrayList;

public class Collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4 is repeated 3 times 5 is repeated 3 times 6--2 9--1 (output ) and also unique number find out 
		//print unique number from the list 
		//Algo
		//1. prepare 1 empty arraylist
		//2. check for number exist and then scan the entire index for same number
		//3. take k variable and increment it to find the count 
		
		int a[]= {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for (int i=0; i<a.length; i++) {
			
			int k=0;
			
			if(!ab.contains(a[i])) 
			{
				
				ab.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length; j++)
				{
					
					if (a[i]==a[j])
						
					{
						k++;
					}
				}
				System.out.println(a[i] + " is repeated" +" "+ k+ " times" );
				
				if(k==1) {
					
					System.out.println(a[i]+" "+  "is unique number");
				}
			}
			
			
		}
		
		
		 
	}

}
