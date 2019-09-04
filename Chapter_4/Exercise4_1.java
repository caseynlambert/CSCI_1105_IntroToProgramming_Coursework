package Homework;

import java.util.Scanner;

//@author Casey Lambert
//Date: 09/03/2019

public class Exercise4_1 {
	public static void main(String[] args) {
            
            Scanner kb = new Scanner(System.in);
            
            double s, a, r;
            
            System.out.print("Input the length of the pentagon from the center to a vertex:");
            r = kb.nextDouble();
            s = (2 * r) * Math.sin(Math.PI / 5);
            a = (5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5)));
            System.out.printf("The area of the pentagon is %4.2f", a);
	}
}
