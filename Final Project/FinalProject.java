import java.util.Scanner;

/**
 * <h1>FinalProject</h1>
 * <p>This class asks for the users expenses(name, cost, and tier of necessity, 0 - 4),
 * and then shows them how much they could save by getting rid of lower tiers</p>
 * @author Casey Lambert
 * <p>Date: October 9, 2019</p>
 */
public class FinalProject {
	/**
	 * This is the main method.
	 * Everything is done in this method except for finding out if the user is payed hourly or salary
	 * 
	 * @param args String[]; unused
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//sum of expenses by tier
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;
		
		double income = 0;
		double salary = 0;
		System.out.println("Are you payed hourly, or by salary?\nEnter 0 for hourly\nEnter 1 for salary");
		int wage = input.nextInt();
			
		int hours = 0;
		double wagePerHour = 0;
		if (monthlyWage(wage) == "Hourly") {
			System.out.println("How many hours do you work a week?: ");
			hours = input.nextInt();
			System.out.print("How much are you payed per hour?: \n$");
			wagePerHour = input.nextDouble();
			income = 4 * hours * wagePerHour;
		}
		if (monthlyWage(wage) == "Salary") {
			System.out.print("How much are you payed a year in salary?: \n$");
			salary = input.nextDouble();
			income = salary / 12;
		}
		
		System.out.print("How many expenses do you have each month?: \n");
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

			System.out.print("How much does that expense cost per month?: \n$");
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
		double savedIncome = income - allSum;
		
		//Prints the arrays of the expenses
		System.out.println("Name\t\tCost\t\tNecessity");
		for (int i = 0; i < expenseCount; i++) {
			System.out.printf("%s\t\t$%.2f\t\t%d\n", expenseName[i], expenseCost[i], expenseEssential[i]);
		}
		System.out.printf("If you cut out all of the tier 4 expenses you could save $%.2f per month!!!\n", sum4);
		System.out.printf("If you cut out all of the tier 3 expenses you could save $%.2f per month!!!\n", sum3);
		System.out.printf("If you cut out all of the tier 2 expenses you could save $%.2f per month!!!\n", sum2);
		System.out.printf("If you cut out all of the tier 1 expenses you could save $%.2f per month!!!\n", sum1);
		System.out.printf("If you cut out all of the tier 0 expenses you could save $%.2f per month!!!\nBut if you did...\n", sum);

		System.out.println("If you could cut out all of a tier plus the lower(if any)\nWhat would it be?");
		int saveMoney = input.nextInt();
		if (saveMoney < 0 || saveMoney > 4) {
			System.out.println("Invalid input, must be between 0 - 4");
			saveMoney = input.nextInt();
		}
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
		System.out.printf("You would save: $%.2f per month\n", moneySaved);
		System.out.printf("Your money left over from your income per month right now is: $%.2f per month\nBut if you added back what you saved you would have: $%.2f per month\n", savedIncome, (savedIncome + moneySaved));
	}
	/**
	 * 
	 * @param wage int; This is just a 0 or 1
	 * The user inputs 0 if they are payed hourly and 1 for salary
	 * @return wageType String; Returns a string telling the program if they are on salary or hourly pay.
	 */
	public static String monthlyWage(int wage) {
		String wageType = " ";
		if (wage == 0)
			wageType = "Hourly";
		if (wage == 1) 
			wageType = "Salary";
		return wageType;
	}
}
