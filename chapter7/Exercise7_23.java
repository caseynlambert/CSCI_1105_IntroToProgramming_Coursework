package chapter7;

import java.util.Arrays;

public class Exercise7_23 {
	public static void main(String[] args) {
		boolean[] lockerArray = new boolean[100];
		Arrays.fill(lockerArray, false);
		for (int i = 0; i < lockerArray.length; i++) {
			for (int z = 0; z < lockerArray.length; z++) {
				if (z == 0)
					lockerArray[i] = !lockerArray[i];
				else if (i == 0)
					lockerArray[i] = lockerArray[i];
				else if (i % z == 0)	
					lockerArray[i] = !lockerArray[i];
					
			}
			System.out.println(lockerArray[i]);
		}
		
	}
}
