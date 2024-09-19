
package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers should we sieve?");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n-1];
		for (int count = 0; count <= n-2; count++) {
			sieve[count] =  true;
		}
		
		
		
		for (int count = 0; count <= n-2; count++) {
			//System.out.println(sieve[count]);
		}
		
		
		
		for (int count = 2; count <= n; count++) {
			for (int count2 = count; count2 <= n; count2 = count2 + count) {
				if (count2 != count) {	
					sieve[count2-2] = false;
				}
				
			}
		}
	
		for (int count = 0; count <= n-2; count++) {
			//System.out.println(sieve[count]);
		}
		for (int i = 0; i < sieve.length; i++) {
            if (sieve[i]) {
                System.out.println(i+2);
            }	
	
	}
	}
}
