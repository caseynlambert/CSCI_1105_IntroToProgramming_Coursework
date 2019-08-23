/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2_1;
import java.util.Scanner;
/**
 *
 * @author Casey Lambert
 * 08/23/2019
 */
public class Exercise2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree for celsius:");
        double celsius;
        celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.print("The degree if fahrenheit is " + fahrenheit);
    }
    
}
