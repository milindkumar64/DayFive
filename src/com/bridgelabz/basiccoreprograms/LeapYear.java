package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
	if(year>=1000)
	{		
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				System.out.println("Leap year");
				else
				System.out.println("Not a leap Year");
			}
			else {
				System.out.println("Leap Year");
			}
		}
		else {
			System.out.println("Not a leap Year");
		}
	}
	else
		System.out.println("Number must be 4 digit");
	}

}
