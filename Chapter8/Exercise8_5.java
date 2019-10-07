//@author Casey Lambert
//Date: October 4, 2019

class Exercise8_5 {
	public static void main(String[] args) {
		double [][] a = {
			{1, 2, 3},
			{1, 2, 3},
			{1, 2, 3}
			};
		double [][] b = {
			{1, 2, 3},
			{1, 2, 3},
			{1, 2, 3}
			};
		double[][] c = addMatrix(a, b);
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {		
				System.out.print(c[row][column] + " ");
			}
				System.out.println();
		}
	}
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double [3][3];
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				double temp = a[row][column] + b[row][column];
				c[row][column] = temp;
			}
		}
		return c;
	}
}
