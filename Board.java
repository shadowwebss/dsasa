
public class Board {

public static void printTheBoard(char[] board) {

	 System.out.printf("%n %s | %s | %s %n", board[0], board[1], board[2]);
	    System.out.println(" - + - + - ");
	    System.out.printf(" %s | %s | %s %n", board[3], board[4], board[5]);
	    System.out.println(" - + - + - "); 
	    System.out.printf(" %s | %s | %s %n%n", board[6], board[7], board[8]);
	
}

}
