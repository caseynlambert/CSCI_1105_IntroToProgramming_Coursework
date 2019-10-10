//@author: Casey Lambert
//Date: October 9, 2019

import java.util.Scanner;

class FinalProject {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//sum of
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;

		System.out.println("What is your minimum income each month?: ");
		double minIncome = input.nextDouble();
		System.out.println("What is your maximum income each month?: ");
		double maxIncome = input.nextDouble();
		System.out.println("How many expenses do you have each month?: ");
		int expenseCount = input.nextInt();

		//New arrays for expense names, cost, and how necessary the expense is
		String[] expenseName = new String[expenseCount];
		double[] expenseCost = new double[expenseCount];
		int[] expenseEssential = new int[expenseCount];

		//New for loop, that will fill each array
		for (int i = 0; i < expenseCount; i++) {

			System.out.println("What is the name of the expense?: ");
			input.nextLine();
			String name = input.nextLine();
			expenseName[i] = name;

			System.out.println("How much does that expense cost?: ");
			double cost = input.nextDouble();
			expenseCost[i] = cost;

			System.out.println("From tier 0 - 4\n0 being necessary to live, and 4 being mostly unnecessary\nHow necessary is that expense?: ");
			int essential = input.nextInt();
			expenseEssential[i] = essential;
			while (essential < 0 || essential > 4) {
				System.out.println(expenseName[i] + " is out of bounds 0 - 4, please enter a digit in those bounds\nThe current digit is " + expenseEssential[i]);
				essential = input.nextInt();
				expenseEssential[i] = essential;
			}

		}

		//Create a sum for each tier of necessity
		for (int i = 0; i < expenseCount; i++) {
			if (expenseEssential[i] == 0) {
				sum += expenseCost[i];
			}
			else if (expenseEssential[i] == 1) {
				sum1 += expenseCost[i];
			}
			else if (expenseEssential[i] == 2) {
				sum2 += expenseCost[i];
			}
			else if (expenseEssential[i] == 3) {
				sum3 += expenseCost[i];
			}
			else if (expenseEssential[i] == 4) {
				sum4 += expenseCost[i];
			}
		}
		
		//Money after all expenses are taken
		double allSum = sum + sum1 + sum2 + sum3 + sum4;
		double minSaved = minIncome - allSum;
		double maxSaved = maxIncome - allSum;
		
		//Prints the arrays of the expenses
		System.out.println("Name\t\tCost\t\tNecessity");
		for (int i = 0; i < expenseCount; i++)
			System.out.println(expenseName[i] + "\t\t" + expenseCost[i] + "\t\t" + expenseEssential[i]);
		System.out.println("If you cut out all of the tier 4 expenses you could save $" + sum4 + "!!!");
		System.out.println("If you cut out all of the tier 3 expenses you could save $" + sum3 + "!!!");
		System.out.println("If you cut out all of the tier 2 expenses you could save $" + sum2 + "!!!");
		System.out.println("If you cut out all of the tier 1 expenses you could save $" + sum1 + "!!!");
		System.out.println("If you cut out all of the tier 0 expenses you could save $" + sum + "!!!\nBut if you did...\n");

		System.out.println("If you could cut out all of a tier plus the lower(if any)\nWhat woudl it be?");
		int saveMoney = input.nextInt();
		System.out.println("You would save: $" + getMoney(sum, sum1, sum2, sum3, sum4, saveMoney));
		System.out.println("Your money left over from your max income right now is: $" + (maxSaved)
				+ "\nBut if you added back what you saved you would have: $" + (maxSaved + getMoney(sum, sum1, sum2, sum3, sum4, saveMoney)));
		System.out.println("Your money left over from your min income right now is: $" + (minSaved)
				+ "\nBut if you added back what you saved you would have: $" + (minSaved + getMoney(sum, sum1, sum2, sum3, sum4, saveMoney)));
		
		
	}
	public static double getMoney(double sum, double sum1, double sum2, double sum3, double sum4, int saveMoney) {
		double moneySaved = 0;
		if (saveMoney == 4)
			moneySaved = sum4;
		else if (saveMoney == 3)
			moneySaved = sum4 + sum3;
		else if (saveMoney == 2)
			moneySaved = sum4 + sum3 + sum2;
		else if (saveMoney == 1)
			moneySaved = sum4 + sum3 + sum2 + sum1;
		else if (saveMoney == 0) {
			moneySaved = sum4 + sum3 + sum2 + sum1 + sum;
			System.out.println("Good luck with that!");
		}
		return moneySaved;
	}
}