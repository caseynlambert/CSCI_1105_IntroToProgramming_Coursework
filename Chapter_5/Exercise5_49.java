import java.util.Scanner;

//@author Casey Lambert
//Date: 09/10/2019


class Untitled {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int c = 0;
		int vow = 0;
		int consonant = 0;

		char vowel1 = 'A';
		char vowel2 = 'E';
		char vowel3 = 'I';
		char vowel4 = 'O';
		char vowel5 = 'U'; 
		
		System.out.print("Enter a string: ");
		String newString = kb.nextLine().toUpperCase();
		int length = newString.length();
		
		do {
			if ((newString.charAt(c) == vowel1) || (newString.charAt(c) == vowel2) || (newString.charAt(c) == vowel3) || (newString.charAt(c) == vowel4) || (newString.charAt(c) == vowel5)) {
				++vow;
				++c;
			}
			if (newString.charAt(c) > 'A' && newString.charAt(c) < 'Z') {
				++c;
				++consonant;
			}
			else 
				++c;
		}
		while (c < length);
		System.out.println("Amount of vowels is " + vow + "\nAmount of consonants is " + consonant);
	}
}