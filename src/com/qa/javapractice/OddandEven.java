package com.qa.javapractice;

public class OddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		
		boolean flag=false;
		

			if (n%2==0) {
				
				flag=true;
				
			}
	
		if(flag) {
			
			System.out.println(n+"is a even number");
		}
		else
		{
			System.out.println(n+ "is odd number");
		}
	}

}
