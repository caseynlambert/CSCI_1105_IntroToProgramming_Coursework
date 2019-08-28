package skipp;

import java.util.Scanner;

//@author Casey Lambert
//Date : 08/28/2019

public class Exercise3_3 {
	 public static void main(String[] args) {
		 
		 
		 Scanner input = new Scanner(System.in);
		 
		 double x, y;
		 System.out.print("Enter a: ");
		 	double a = input.nextDouble();
		 System.out.print("Enter b: ");
		 	double b = input.nextDouble();
		 System.out.print("Enter c: ");
		 	double c = input.nextDouble();
		 System.out.print("Enter d: ");
		 	double d = input.nextDouble();
		 System.out.print("Enter e: ");
		 	double e = input.nextDouble();
		 System.out.print("Enter f: ");
		 	double f = input.nextDouble();

		 if ((a * d - b * c) != 0) {
			 x = (e * d - b * f) / (a * d - b * c);
			 y = (a * f - e * c) / (a * d - b * c);
			 
			 System.out.println("The value for x is " + x);
			 System.out.println("The value for y is " + y);
		 }
			 else {

			 System.out.print("The equation has no solution.");

		 }
	}
}
