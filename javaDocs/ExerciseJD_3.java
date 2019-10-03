package javaDocs;

import java.util.Scanner;
/**
 * <h1>Exercise 6_3 JavaDoc</h1>
 * <p>This class checks if a number is a palindrome</p>
 * 
 * <a href="file:///C:/Users/casey/eclipse-workspace/JavaDoc/Doc/javaDocs/package-summary.html"></a>
 * 
 * <p>Created on: 09/30/2019</p>
 * 
 * @author Casey lambert
*/
public class ExerciseJD_3 {
	/**
	* This is the main method of the program, it asks the user to enter an integer.
	* It then calls the method isPalindrome to check if the int palindrome is the same as int ogNumb.
	* @param args String[]; unused
	*/
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int ogNumb = kb.nextInt();
		isPalindrome(ogNumb);
	}
	/**
	 * This method reverses the number given by the main method.
	 * 
	 * <pre>Examples:
	 * {@code reverse(465) returns 564
	 * reverse(12022) returns 22021
	 * }</pre>
	 * 
	 * @param reversedNumb int; Takes the int given in the main method and reverses it.
	 * @return reverse int; Returns the number after it has been flipped.
	 */
	public static int reverse(int reversedNumb) {
		int palindrome = 0;
		int length = (int)(Math.log10(reversedNumb) + 1);
		int number = 0;
		int digit = 0;
		int x = 0;
		for (int i = length; i > 0; i--) {
			number = reversedNumb % (int)(Math.pow(10, length));
			--length;
			digit = number / (int)(Math.pow(10, length));
			palindrome += digit * (int)(Math.pow(10, x));
			++x;
		}		
		
		return palindrome;
	}
	/**
	 * Check whether the number came back as a palindrome or not
	 * 
	 * <pre>Examples:
	 * {@code isPalindrome(45) returns false
	 * isPalindrome(454) returns true
	 * }</pre>
	 * @param c int; takes the int given and compares when c is used in the reverse method.
	 * @return isPalindrome boolean; If c is equivalent to reverse(c) returns true, otherwise returns false.
	 */
	public static boolean isPalindrome(int c) {
		if (c == reverse(c)) {
			System.out.print("The number is a palindrome.");
			return true;
		}
		else {
			System.out.print("The number is not a palindrome.");
			return false;
		}
	}
}

