//@author Casey Lambert
//Date: October 7, 2019

import java.lang.*;
import java.util.Scanner;

class Exercise8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guess = "";
		boolean y = true;
		int count = 0;
		int correct = 0;
		String state;
		String capital;

		String[][] x = {
			{"Georgia", "Atlanta"},
			{"Oregon", "Salem"},
			{"Kansas", "Topeka"},
			{"Louisiana", "Baton Rouge"},
			{"Washington", "Olympia"},
			{"Texas", "Austin"},
			{"Ohio", "Columbus"},
			{"Tennessee","Nashville"},
			{"Nevada", "Carson City"},
			{"Massachusetts","Boston"}
			};
		
		for (int i = 0; i < 10; i++) {
			state = x[count][0];
			capital = x[count][1];
			System.out.print("Enter the capital of " + state + ": ");
			guess = input.nextLine();
			y = !y;
			if (guess.equalsIgnoreCase(capital)) {
				count++;
				correct++;
				System.out.println("Correct!");
				y = !y;
			}
			else {
				System.out.println("False!");
				count++;
				y = !y;
			}
		}
		System.out.println("The amount correct is " + correct);
		if (correct == 10) {
			System.out.print("Wow 10/10!!!");
		}
	}
}