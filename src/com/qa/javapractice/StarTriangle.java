package com.qa.javapractice;

public class StarTriangle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int n= 8;

		for(int i=n; i>0; i-=2) {
			
			for (int j=0; j<i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
			
			System.out.println("*");
		
	}

}

