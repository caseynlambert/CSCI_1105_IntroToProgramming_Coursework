/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2_13;
import java.util.Scanner;
/**
 *
 * @author Casey Lambert
 * 08/23/2109
 */
public class Exercise2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("How much do you deposit into your savings each month:");
        double monthlySavings = input.nextDouble();
        double annualInterestRate = .00417;
        System.out.println("What month's amount are you looking for?");
        int month = input.nextInt();
        // Must put -1 after month to satisfy the true value, since the first month doesn't already have the savings
        double value = (((monthlySavings * (month - 1) * (1 + annualInterestRate));
        double amount = ((monthlySavings + value) * (1 + annualInterestRate)));
        System.out.println(amount);
    }
    
}
