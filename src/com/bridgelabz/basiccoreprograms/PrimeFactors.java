package com.bridgelabz.basiccoreprograms;

public class PrimeFactors {

	public static void main(String[] args) {
	
        long n = 108;//Long.parseLong(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");
       
        for (long fact = 2; fact*fact <= n; fact++) //  for(long factor = 2;factor<=n/2;factor++) this logic also works
        {
            while (n % fact == 0) {
                System.out.print(fact + "and ");
                n = n / fact;
            }
        }
        if (n > 1) System.out.println(n);
        else       System.out.println();
	}

}

