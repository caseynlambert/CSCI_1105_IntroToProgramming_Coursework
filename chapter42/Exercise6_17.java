package chapter42;

//@author Casey Lambert
//Date: 09/13/2019

import java.util.Scanner;

public class Exercise6_17 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = kb.nextInt();
		printMatrix(n);

	}
	public static void printMatrix(int n) {
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				int z = ((int)(Math.random() * 2));
				System.out.print(z);
				if (z == 0) {
					z = 1;
				}	
				else {
					z = 0;
						
				}
					
			}
			System.out.println();
		}
	}
}

