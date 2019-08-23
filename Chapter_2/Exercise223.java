/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.pkg23;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Exercise223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // All input's by the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance:");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon:");
        double mpg = input.nextDouble();
        System.out.print("Enter the price per gallon:");
        double gas = input.nextDouble();
        
        double cost = distance / mpg * gas;
        System.out.print("The cost of driving is " + cost);
        
        
    }
    
}
