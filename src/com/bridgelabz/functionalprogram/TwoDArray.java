package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class TwoDArray {
	
	static void printArray(int arr[][],int M,int N )
	{
		 for(int i=0;i<arr.length;i++)
	     for(int j=0;j<arr.length;j++) 
	     { 
	    	
		     System.out.print(arr[i][j] + " ");
		      	
	     }  
		
	}
 public static void main(String[] args) {


  Scanner sc = new Scanner(System.in);
  System.out.println("Enter row and column : "); 
  int M = sc.nextInt();
  int N = sc.nextInt();
 
    int arr[][] = new int[M][N];

    for(int i=0;i<arr.length;i++)
    for(int j=0;j<arr.length;j++) 
    { 
    	System.out.println("Enter values");
    	System.out.print("arr[i][j] :");
    	 arr[i][j] = sc.nextInt(); 
    }  
      printArray(arr,M,N);
    
	}
}
	
