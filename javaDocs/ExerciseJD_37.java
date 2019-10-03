package javaDocs;

import java.util.Scanner;
/**
 * <h1>Exercise 6_37 JavaDoc</h1>
 * <p>This class asks the user for a number and width, then displays a number with that width</p>
 * 
 * <p>Created on: 10/01/2019</p>
 * 
 * @author Casey lambert
*/
public class ExerciseJD_37 {
	/**
	 * This method asks the user for a number with width. After the two ints are entered,
	 * it calls the format method to display the String properly
	 * @param args String; unused
	 */
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		System.out.println("Enter the width: ");
		int width = kb.nextInt();
		System.out.print(format(number, width));
	}
	/**
	 * This method add's string x, a single "0", to a string a,
	 * by 1 for the difference between the width entered, and the length of the number given
	 * <pre>Examples:
	 * {@code format(34, 3) returns 034
	 * format(1, 7) returns 0000001
	 * format(34567, 4) returns 34567}
	 * </pre>
	 * @param number int; Number entered by the user
	 * @param width int; The width entered by the user
	 * @return String; Returns a string
	 */
	public static String format(int number, int width) {
		String x = "0";
		String z = number + "";
		String a = "";
		int length = (int)(Math.log10(number) + 1);
		if (width > length) {
			for (int i = 1; i < (width - length); i++) {
				x += "0";
			}
			a = x + z;
		}
		else 
			a = z;
		return a;
	}
}