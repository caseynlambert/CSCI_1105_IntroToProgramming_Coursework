package javaDocs;

import java.util.Scanner;
/**
 * <h1>Exercise 6_17 JavaDoc</h1>
 * <p>This class prints a matrix n by n wide consisting of 1's and 0's</p>
 * 
 * <p>Created on: 09/30/2019</p>
 * 
 * @author Casey lambert
*/
public class ExerciseJD_17 {
	/**
	 * This is the main method. The user is asked to enter n which will determine the width and height of the matrix
	 * 
	 * @param args String[]; unused
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = kb.nextInt();
		printMatrix(n);
	}
	/**
	 * Using a for loop with a nested for loop, it prints either a 0 or 1, then after n prints
	 * prints a new line. It will continue until a new line is printed n times.
	 * 
	 * <pre>Examples:
	 * {@code printMatrix(3) Prints  010
	 *			111
	 * 			001
	 * printmatrix(1) Prints 1
	 * }</pre>
	 * @param n int; Width and height of matrix
	 */
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

