package chapter7;

import java.util.Scanner;

//@author Casey Lambert
//Date: 10/02/2019

public class Exercise7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Creates 10 int array
		System.out.print("Enter 10 integers: ");
		int[] myList = new int[10];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
		}
		System.out.println("The new array is: " +  java.util.Arrays.toString(eliminateDuplicates(myList)));
	}
	public static int[] eliminateDuplicates(int[] list) {
		//Creates new array's length
		int x = list.length;
		//Int y used to increment the distance between array's "list" and "newList"
		int y = 0;
		//Int a is used to add length to the list number. If the number isn't a new number in the array it won't increment
		//It increments count when 
		int a = 0;
		int key = list[0];
		for(int i = 0; i < list.length; i++) {
			key = list[i];
			if (key == -1)
				x--;
			for (int z = i; z < list.length; z++){
				if (key == list[z] && z != i){
					list[z] = -1;
				}
			}
		}
		int[] newList = new int[x];
		for (int i = 0; i < list.length; i++) {
			if (list[i] == -1) {
				y++;
			}
			else if (list[i] != -1) {
				newList[a] = list[a + y];
				a++;
			}
		}
		return newList;
	}
}
