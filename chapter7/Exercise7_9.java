package chapter7;

import java.util.Scanner;

public class Exercise7_9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] myList = new double[10];
		System.out.print("Enter 10 doubles: ");
		System.out.print("The minimum of the array is: " + min(myList));
	}
	public static double min(double[] myList) {
		Scanner input = new Scanner(System.in);
		double minVal = 0;
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
			minVal = myList[0];
			if (minVal > myList[i]) {
				double temp = minVal;
				minVal = myList[i];
			}
		}
		return minVal;
	}
}