package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VovelOrConsonent {

	public static void main(String[] args) {
		System.out.println("Enter the Alphabet: ");
		 Scanner sc = new Scanner(System.in);
		 char alphabet = sc.next().charAt(0);
		 
		 
		 switch (alphabet)
		    {
		   
		    case 'a':
		        System.out.print("Vovel ");
		        break;
		 
		    
	        case 'e':
		        System.out.print("Vovel ");
		        break;
		 
		    
		    case 'i':
		    	System.out.print("Vovels ");
	            break;
		 
		  
		    case 'o':
		    	System.out.print("Vovel ");
		        break;
		 
		    
		    case 'u':
		    	System.out.print("Vovel ");
		        break;
		        
		    default:
		          System.out.println("Consonent");
		        break;

		    }	
	}

}
