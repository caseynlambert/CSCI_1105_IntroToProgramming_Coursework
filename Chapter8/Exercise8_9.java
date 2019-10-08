//@author Casey Lambert
//Date: October 7, 2019

import java.util.Scanner;

class Exercise8_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] board = new char[3][3];
		int x = 0;
		int y = 0;
		int turn;
		boolean a = true;
		String player;
		
		for (turn = 0; turn < 9; turn++) {
			if (a)
				player = "X";
			else 
				player = "O";
			for (int i = 0; i < 3; i++)
				System.out.println(java.util.Arrays.toString(board[i]));
			System.out.println("Enter a row (0, 1, or 2) for player " + player + ":");
			x = input.nextInt();
			System.out.println("Enter a column (0, 1, or 2) for player " + player + ":");
			y = input.nextInt();
			if (mark(x, y, turn, board) == 'A' && turn != 0) {
				System.out.println("Try again!!!");
				turn--;
				a = !a;
			}
			else if (mark(x, y, turn, board) != 'O' || mark(x, y, turn, board) != 'X' || mark(x, y, turn, board) != 'A') {
				board[x][y] = mark(x, y, turn, board);
			}
			a = !a;
		}
		for (int i = 0; i < 3; i++)
			System.out.println(java.util.Arrays.toString(board[i]));
	}
	public static char mark(int x, int y, int turn, char[][] board) {
		char oh = 'O';
		char ex = 'X';
		char no = 'A';
		if (board[x][y] == 'X' || board[x][y] == 'O')
			return no;
		else if (turn % 2 == 0) {
			return ex;
		}
		else {
			return oh;
		}
			
	}
}