import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int row, column;
		char player = 'X';

		// create 2 dimensional array for tic tac toe board
		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		//greet the player
		System.out.println("Hello, let's play Tic-Tac-Toe!");
		System.out.println("Player " + player + ":");
		System.out.println("Please enter row and column where you want an " + player + " placed on the board: \n");

		//initialize board and update board with plays
		printBoard(board);
		
		//Play until winner is found or tie game
		while (!winner(board) == true) {

			// get input for row/column
			System.out.println();
			System.out.println("Enter a row and column for player " + player + ":");
			System.out.println("Row: ");
			row = reader.nextInt();
			System.out.println("Column: ");
			column = reader.nextInt();

			// check for invalid play
			if (board[row][column] == 'X' || board[row][column] == 'O') {
				System.out.println("This spot is occupied. Please try again");
				System.out.println("Enter a row and column for player " + player + ":");
				row = reader.nextInt();
				column = reader.nextInt();
			}
			// place the X
			board[row][column] = player;
			printBoard(board);

			//Check for winner
			if (winner(board)) {
				System.out.println("Player " + player + " is the winner!");
			}

			//change players after each turn
			if (player == 'O') {
				player = 'X';

			} else {
				player = 'O';
			}
			
			//Check for tie game
			if (winner(board) == false && !checkFull(board)) {
				System.out.println("The game is a tie.");       
			}
		}

		// close the scanner
		reader.close();

	}

public static void printBoard(char[][] board) {

// Print board with # for initial placeholder
	System.out.println("  0   1  2");
	for(int i = 0;i<board.length;i++) {
		System.out.print(i + " ");
		for (int j = 0; j < board[i].length; j++) {
			if (j == board[i].length - 1)
				System.out.print(board[i][j]);
			else
				System.out.print(board[i][j] + " | ");
		}
		System.out.println();
	}
}

//check if board is completely filled with Xs and Os
	public static boolean checkFull(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != 'O' && board[i][j] != 'X') {
					return true;
				}
			}
		}
		return false;
	}

//check for winner
	public static boolean winner(char[][] board) {
		return horizontalWin(board) || verticalWin(board) || diagonalWin(board);
	}


//check horizontal win
	private static boolean horizontalWin(char[][] board) {
		for (int row = 0; row < board.length; row++) {
			if (win(board[row]))
				return true;
		}
		return false;
	}

//check all in array for same text and that the text is not empty.
	private static boolean win(char[] checkLine) {
		boolean foundWin = true;
		char prevChar = '-';
		for (char character : checkLine) {
			if (prevChar == '-')
				prevChar = character;
			if ('O' != character && 'X' != character) {
				foundWin = false;
				break;
			} else if (prevChar != character) {
				foundWin = false;
				break;
			}
		}
		return foundWin;
	}

//check vertical win
	private static boolean verticalWin(char[][] board) {
		char[] column = null;
		for (int col = 0; col < board[0].length; col++) {
			column = new char[board[0].length];
			for (int row = 0; row < column.length; row++) {
				column[row] = board[row][col];
			}
			if (win(column))
				return true;
		}
		return false;
	}

//check diagonal win
	private static boolean diagonalWin(char[][] board) {

		int row = 0;
		int col = 0;
		int size = board[0].length < board.length ? board[0].length : board.length;
		char[] diagonal = new char[size];
		
		while (row < board[0].length && col < board.length) {
			diagonal[col] = board[row][col];
			row++;
			col++;
		}
		if (win(diagonal)) {
			return true;
		}
		row = board[0].length - 1;
		diagonal = new char[size];
		while (row >= 0 && col < board.length) {
			diagonal[col] = board[row][col];
			row--;
			col++;
		}
		return win(diagonal);

	}

}
