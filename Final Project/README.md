# Calculating Expenses

## Synopsis
This project asks for your income, your expenses, how much they cost, and how necessary they are.
After that it shows you how much you could save if you cut out certain tiers of expenses.

## Motivation
I am starting to get really interested in finance, and I thought this would be a helpful program to make for myself, and for others.
Not only that, but I would like to expand this program/make others like it.
If I can use what I know in programming to help me financially that would be very beneficial.


## How to Run
All that is needed is FinalProject.java in order to run.
Here is what it should look like
![Program running](https://github.com/caseynlambert/CSCI_1105_IntroToProgramming_Coursework/blob/master/Final%20Project/Program%20running.png)

## Code Example
I make 3 arrays based, on how many expenses the user enters. I am proud of this because I was able to create 3 arrays without
declaring their size(Well technically I did). The reason I am proud of this is because I wasn't even able to do this with one
array not too long ago, and although this isn't even a hard task. It was satisfying to me.
```
    String[] expenseName = new String[expenseCount];
		double[] expenseCost = new double[expenseCount];
		int[] expenseEssential = new int[expenseCount];
```

## Tests
I use a method in this program to change what is printed based on whether they are payed hourly or salary
I am using jUnit 4 for testing.
Here is an example
```
import static org.junit.Assert.*;

import org.junit.Test;

public class FinalProjectTest {

	@Test
	public void monthlyWageTest() {
		assertEquals(FinalProject.monthlyWage(0), "Hourly");
		assertEquals(FinalProject.monthlyWage(1), "Salary");
	}
}
```

## Contributors
My two instructors have guided me on my journey to creating this program!
Rocky Mazorow
Greg Davis
If anyone would like to contribute send me an email at caseynlambert@gmail.com
I know most of you could easily blow this measly first project out of the water, so DO IT
