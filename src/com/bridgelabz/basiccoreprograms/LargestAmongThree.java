package com.bridgelabz.basiccoreprograms;

public class LargestAmongThree {

	public static void main(String[] args) {
		
		int num1 = 13;
		int num2 = 16;
		int num3 = 8;
		
		int temp1= (num1>num2)?num1:num2;
		int temp2= (temp1>num3)?temp1:num3; 
		
		System.out.println("Largest number is :"+temp2);

	}

}
