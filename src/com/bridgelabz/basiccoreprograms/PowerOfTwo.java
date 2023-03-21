package com.bridgelabz.basiccoreprograms;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		int powerOfTwo =1;
		if(n<31)
		{
			for(int i=0;i<n;i++)
			{
				powerOfTwo *=2;
			}
		}
		else
			System.out.println("Number out of bound");
		
		System.out.println("powerOfTwo :"+powerOfTwo);
	}

}
