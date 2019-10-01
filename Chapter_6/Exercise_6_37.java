import java.util.Scanner;

//@author Casey Lambert
//Date 09/19/2019

class Exercise_6_37 {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		System.out.println("Enter the width: ");
		int width = kb.nextInt();
		System.out.print(format(number, width));
	}
	
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
