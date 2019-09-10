//@author: Casey Lambert
//Date: 09/10/2019
class Exercise5_11 {
	public static void main(String[] args) {
		System.out.print("Numbers from 100 - 200"
		 + "\nDivisible by 5 or 6, but not 5 and 6"
		 + "\n-------------------------------------"
		 + "\n");
		// Tells the users what the program is doing
		int x = 0;
		for (int i = 100; i < 200; i++) {
			if ((i % 5 == 0) || (i % 6 == 0) && (i % 30 != 0)) {
				x++;
				System.out.print(" " + i);
			if (x % 10 == 0)
				System.out.println();
			}
		}
	}
}