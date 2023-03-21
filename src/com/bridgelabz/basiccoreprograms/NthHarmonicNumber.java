package com.bridgelabz.basiccoreprograms;

public class NthHarmonicNumber {

	public static void main(String[] args) {
		
		float harmonic = 1;
		int N =12; 
	
	    for (int i = 2; i <= N; i++) {
	        
	    	harmonic += (float)1 / i;
	    }	
	    
	    System.out.println("nth Harmonic value :"+harmonic);
	 
	}

}
