package javaDocs;

import java.util.Scanner;
/**
 * <h1>Exercise 6_31 JavaDoc</h1>
 * <p>This class uses an algorithm to check if credit cards entered are valid or not</p>
 * 
 * <p>Created on: 09/30/2019</p>
 * 
 * @author Casey lambert
*/
public class ExerciseJD_31 {
	/**
	 * Asks the user to enter a credit card number. It calls the method isValid to check if the number is valid or not
	 * @param args String; unused
	 */
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a credit card number as a long integer: ");
	    long number = input.nextLong();
	    
	    if (isValid(number))
	      System.out.println(number + " is valid");
	    else
	      System.out.println(number + " is invalid"); 
	    
	  }
	  /** Return true if the card number is valid */
	  /**
	   * Checks the credit card number's size,
	   * the prefix digits,
	   * the sum of double the integers from right to left in even places,
	   * and the sum of the integers in odd places
	   * <pre>Examples:
	   * {@code isValid(4117174154677830L) returns true
	   * isValid(411717415467783015L) returns false
	   * }</pre>
	   * @param number long; Credit card number
	   * @return isValid boolean; If all parameters match then returns true otherwise false
	   */
	  public static boolean isValid(long number) {
	    return  (getSize(number) >= 13) && (getSize(number) <= 16) && 
	        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
	        prefixMatched(number, 6) || prefixMatched(number, 37)) && 
	       (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;

	  }

	  /** Get the result from Step 2 */
	  /**
	   * Adds twice the amount of each integer together in the credit card number in the even spots,
	   * if the number doubled become two digits long then it adds those two together.
	   * <pre>Examples:
	   * {@code sumOfDoubleEvenPlace(4117174154677830L) returns 35
	   * sumOfDoubleEvenPlace(377133980645968L) returns 27
	   * }</pre>
	   * @param number long; Credit card number
	   * @return sumOfDoubleEvenPlace int; Once all digits are added this becomes that number
	   */
	  public static int sumOfDoubleEvenPlace(long number) {
	    int result = 0;
	    
	    number = number / 10; // Starting from the second digit from left
	    while (number != 0) {
	      result += getDigit((int)((number % 10) * 2));
	      number = number / 100; // Move to the next even place
	    }
	    return result;
	  }
	  
	  /** Return this number if it is a single digit, otherwise, return 
	   * the sum of the two digits */
	  /**
	   * When a digit is doubled in the sumOfDoubleEvenPlace method, and it is two digits long they are added together
	   * <pre>Examples:
	   * {@code getDigit(13) returns 4
	   * getDigit(10) returns 1
	   * }</pre>
	   * @param number int; The even number if after being doubled was two digits long
	   * @return returns a number after the two digits were added together
	   */
	  public static int getDigit(int number) {
	    return number % 10 + (number / 10);
	  }
	  
	  /** Return sum of odd place digits in number */
	  /**
	   * Adds the odd place numbers together
	   * <pre>Examples:
	   * {@code sumOfOddPlace(4117174154677830L) returns 35
	   * sumOfOddPlace(377133980645968L) returns 43
	   * }</pre>
	   * @param number long; Credit card number
	   * @return sum of the odd place numbers
	   */
	  public static int sumOfOddPlace(long number) {
	    int result = 0;
	   
	    while (number != 0) {
	      result += (int)(number % 10);
	      number = number / 100; // Move two positions to the left
	    }
	    
	    return result;
	  }
	  
	  /** Return true if the number d is a prefix for number */
	  /**
	   * This methods calls the getPrefix method and the get size method
	   * It gets the size of the prefix, and then gets the prefix of the credit card number
	   * <pre>Examples:
	   * {@code prefixMatched(4117174154677830L, 4) returns true
	   * prefixMatched(377133980645968L, 37) returns true
	   * prefixMatched(8117174114677830L, 4) returns false
	   * }</pre>
	   * @param number int; Credit card number
	   * @param d int; The prefix of the credit card i.e. different card manufactures have different starting digits
	   * @return boolean; Returns true if the prefix matches otherwise it is false.
	   */
	  public static boolean prefixMatched(long number, int d) {
	    return getPrefix(number, getSize(d)) == d;
	  }
	  
	  /** Return the number of digits in d */
	  /**
	   * This method finds the amount of digits in the credit card
	   * <pre>Examples:
	   * {@code getSize(4117174154677830L) returns 16
	   * getSize(377133980645968L) returns 15
	   * getSize(411717415467L) returns 12
	   * }</pre>
	   * @param d long; Credit card number
	   * @return int; returns number of digits in the credit card
	   */
	  public static int getSize(long d) {
	    int numberOfDigits = 0;
	    
	    while (d != 0) {
	      numberOfDigits++;
	      d = d / 10;
	    }
	    
	    return numberOfDigits;
	  }
	  
	  /** Return the first k number of digits from number. If the number
	   * of digits in number is less than k, return number. */
	  /**
	   * This method gets the size of the prefix, and extracts the prefix from the credit card number
	   * <pre>Examples:
	   * {@code getPrefix(4117174154677830L), 1) returns 4
	   * getPrefix(5322811259306132L), 1) returns 5
	   * getPrefix(377133980645968L), 2) returns 37
	   * }</pre>
	   * @param number long; Credit card number
	   * @param k int; The length of the prefix
	   * @return long; Returns the prefix of the credit card matching one of the 4 options in the isValid method
	   */
	  public static long getPrefix(long number, int k) {
	    long result = number;
	    
	    for (int i = 0; i < getSize(number) - k; i++)
	      result /= 10;
	    
	    return result;
	  }
	}
