package homework;


import java.util.Scanner;

//@author Casey Lambert
//Date: 09/03/2019

public class Exercise4_23 {
	public static void main(String[] args) {
            
		Scanner kb = new Scanner(System.in);
                
        double hours, hourlyPayRate, fedTax, stateTax;
                
		System.out.print("Enter employee's name:");
		String s = kb.nextLine();
		System.out.print("Enter number of hours worked:");
		hours = kb.nextDouble();
		System.out.print("Enter hourly pay rate: $");
		hourlyPayRate = kb.nextDouble();
		System.out.print("Enter federal tax withholding rate:");
		fedTax = kb.nextDouble();
		System.out.print("Enter state tax withholding rate:");
		stateTax = kb.nextDouble();
                
		double fedWR = fedTax * 100;
		double stateWR = stateTax * 100;
		double pay = hours * hourlyPayRate;
		double fedW = fedTax * pay;
		double stateW = stateTax * pay;
		double taxW = fedW + stateW;
		double netPay = (hours * hourlyPayRate) - (taxW);
                
		System.out.println("Employee Name: " + s);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + pay);
		System.out.println("Deductions:");
		System.out.print("    Federal Witholding (" + fedWR + "%):");
		System.out.printf(" $%4.2f\n", fedW);
		System.out.print("    State Withholding (" + stateWR + "%):");
		System.out.printf(" $%4.2f\n", stateW);
		System.out.printf("    Total Deduction: $%4.2f\n", taxW);
		System.out.printf("Net Pay: $%4.2f", netPay);
	}

}