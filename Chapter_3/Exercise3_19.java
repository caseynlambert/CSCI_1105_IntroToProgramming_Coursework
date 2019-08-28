package skipp;

import java.util.Scanner;

public class Exercise3_19 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("Edge 1:");
		double x = kbi.nextDouble();
		System.out.print("Edge 2:");
		double y = kbi.nextDouble();
		System.out.print("Edge 3:");
		double z = kbi.nextDouble();
		
		if (x + y > z && x + z > y && y + z > x) {
			double p = x + y + z;
			System.out.print("The perimeter of the triangle is " + p);
		}
		else {
			System.out.print("Invalid input!");
		}
		
	}
}
