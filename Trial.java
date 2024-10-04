
public class Trial {
public static void main (String []args)
{
char[] board = {'1','2','3',
'4','5','6',
'7','8','9'};

var numberOfSqarePlayed = 0;
var whoseTurn= 'x';

while ( numberOfSqarePlayed < 9 )
{
	printTheBoard(board);
	System.out.println("Choose a Square Player Whoe's Turn "+ whoseTurn);
	var scanner = new java.util.Scanner(System.in);
	var input = scanner.nextInt();
	board [input - 1 ] = whoseTurn ;
	if (  (board[0] + board[1] + board[2] == (whoseTurn * 3)) // first row 
         || (board[3] + board[4] + board[5] == (whoseTurn * 3)) // second row
         || (board[6] + board[7] + board[8] == (whoseTurn * 3)) // third row
         || (board[0] + board[3] + board[6] == (whoseTurn * 3)) // first column
         || (board[1] + board[4] + board[7] == (whoseTurn * 3)) // second column
         || (board[2] + board[5] + board[8] == (whoseTurn * 3)) // third column
         || (board[0] + board[4] + board[8] == (whoseTurn * 3)) // first diagonal
         || (board[2] + board[4] + board[6] == (whoseTurn * 3)) // second diagonal
      )
	{
		printTheBoard(board);
		System.out.println("Badhai Ho App Jeet Gye !");
		break;
	}
	else {
		numberOfSqarePlayed++;
		whoseTurn = (whoseTurn == 'x') ? 'o' : 'x' ;
	}
	
}

}

private static void printTheBoard(char[] board) {

	 System.out.printf("%n %s | %s | %s %n",board[0], board[1], board[2]);
	    System.out.println(" - + - + - ");
	    System.out.printf(" %s | %s | %s %n", board[3], board[4], board[5]);
	    System.out.println(" - + - + - "); 
	    System.out.printf(" %s | %s | %s %n%n", board[6], board[7], board[8]);
	
}
}
