package chapter7;

import java.util.Arrays;

public class Exercise7_23 {
	public static void main(String[] args) {
		boolean[] lockerArray = new boolean[100];
		Arrays.fill(lockerArray, false);
		for (int i = 0; i < lockerArray.length; i++) {
			for (int z = 0; z < lockerArray.length; z++) {
				if ((i + 1) % (z + 1) == 0.000000)	
					lockerArray[i] = !lockerArray[i];
					
			}
			if (lockerArray[i])
				System.out.println("The locker " + (i + 1) +  " is open");
			else
				System.out.println("The locker " + (i + 1) +  " is closed");
		}
		
	}
}
