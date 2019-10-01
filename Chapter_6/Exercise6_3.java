import java.util.Scanner;


//@author Casey Lambert
//Date: 09/16/2019


class Exercise6_3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int ogNumb = kb.nextInt();
		isPalindrome(ogNumb);
	}
	
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

