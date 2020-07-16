package com.qa.javapractice;

import java.util.ArrayList;
import java.util.Collections;

public class HeightChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find all the students who are not standing according to their heights in increasing order 
		
		int a[]= {1,5,4,3,2,6};
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
	
		for (int i=0; i<a.length; i++)
		{
			ab.add(a[i]);
		}
	      Collections.sort(ab);
	      
	    Object[] orderedheights = ab.toArray();
	    
	    int k=0;
	    
	    Integer[] integerArray= new Integer[orderedheights.length];
	    
	    for (int l=0; l<orderedheights.length; l++) {
	    	
	    	integerArray[l]=(Integer)orderedheights[l];
	    }
	      
				for (int j=0; j<a.length;j++)
				{
					
					if (!(a[j]==integerArray[j])) {
						
						System.out.println("student who is not standing according to his height is"+ a[j]);
						
						k++;
		
					}
				}
				System.out.println("Number os students who are not standing according to ther height is"+ k);
			}
			
		
	}


