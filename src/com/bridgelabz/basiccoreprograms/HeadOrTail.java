package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HeadOrTail {

	public static void main(String[] args) {
        
		int coinFace;
		double ranNum; 
		int tailCount=0;
		int headCount=0;
		
		System.out.println("Enter number of time to flip coin :");
		Scanner sc = new Scanner(System.in);
		int numberOfFilp = sc.nextInt();
		
        
		for(int i=0;i<numberOfFilp;i++)
		{	
		ranNum = Math.random();
        
        if(ranNum<0.5)
        {	coinFace=0; //0 means Tail
            tailCount++;
        }   
        else
        {	coinFace=1; // 1 means Head
            headCount++;
        }   
	    }
		System.out.println("Head counts  :"+headCount);
		System.out.println("Tail counts :"+tailCount);
		int headPercentage = headCount*100/numberOfFilp;
		int tailPercentage = tailCount*100/numberOfFilp;
		System.out.println("Head %  :"+headPercentage);
		System.out.println("Tail %  :"+tailPercentage);

	}

}
