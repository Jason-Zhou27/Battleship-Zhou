import java.util.Scanner;

public class Board {

	//variables
	private String[][] squares1; //declare 2D array of Strings called squares1; squares1 will show the player's board
	private String[][] squares2; //declare 2D array of Strings called squares2; squares2 will show the hits/misses that the player had on the computer's board
	private String strSquares1;
	private String strSquares2;
	private char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
	private String temp;
	private char c;
	private String[] shipNames = {};
	
	//constructor(s)
	public Board(){
		//specify size of the 2D arrays squares1 and squares2
		squares1 = new String[10][10];
		squares2 = new String[10][10];
		//initialize the values for two 10x10 2D arrays with dashes using nested for loop which circulates through the arrays going row by row (Runestone 4.11)
		for (int r=0;r<10;r++){
			for (int c=0;c<10;c++){
				squares1[r][c] = "-";
				squares2[r][c] = "-";
			}
		}
		strSquares1 = "*";
		strSquares2 = "*";
		Scanner sc = new Scanner(System.in);
	}

	//methods
	
	//return representation of the board
	public String toString(){
		strSquares1= strSquares1 + ("Your guess");
		strSquares1 = strSquares1 + "  1 2 3 4 5 6 7 8 9 10\n";
		//use a nested for loop to concactenate row by row of square1
		for (int r=0;r<10;r++){
			strSquares1 = strSquares1 + letters[r] + " ";
			
			//within a row, fetch strings by shifting columns in the 2D array 
			for (int c=0;c<10;c++){
				strSquares1 = strSquares1 + (squares1[r][c]) + " "; //use the format: existing concactenation + character from particular position + space
			}
			strSquares1 = strSquares1 + ("\n"); //after a row of dashes is completed, create a new line
		}
		
		strSquares2 = strSquares2+ ("Your board");
		strSquares2 = strSquares2 + "  1 2 3 4 5 6 7 8 9 10\n";
		//use a nested for loop to concactenate row by row of square2
		for (int r=0;r<10;r++){
			strSquares2 = strSquares2 + letters[r] + " ";
			//within a row, fetch strings by shifting columns in the 2D array
			for (int c=0;c<10;c++){
				strSquares2 = strSquares2 + (squares2[r][c]) + " "; //use the format: existing concactenation + character from particular position + space
			}
			strSquares2 = strSquares2 + ("\n"); //after a row of dashes is completed, create a new line
		}
		return (strSquares1 + "\n\n" + strSquares2); //return the concactenation of the two squares, separating the two squares by two line breaks
	}
	
	/*public int toInt() {
		temp = sc.next();
		c = temp.charAt(0);
		for (int i=0;i<10;i++){
			if (c==letters[i]){
				return i;
			}	
		}			
	}
	*/
	/*
	public boolean addShips(int row, int col, int len, boolean horizontal) {
		
		define and initilize boolean possible to FALSE
		* if boolean horizontal is true, execute the for loop mentioned in lines 81-84 with the iteration going through c (b/c the for loop will transverse the columns of a particular row)
		* if otherwise (false), execute the for loop in lines 81-84 with the iteration going through r (b/c of the same reasoning mentioned in line 77)
		
		**the following for loop metnioned in lines 81-84 will be existing twice with slightly different ways of transversing the array (one row and one column)
		transverse the array in the direction which parameter specifies at its specific length starting at squares1[row][col]
		* 	use a for each loop to determine whether the characters at those locations of an array EXIST or are occupied already by a "b"
		* 		if a location EXISTS and is occupied not by a "b," do not do anything
		* 		if a location DOES NOT EXIST OR is OCCUPIED by a "b," turn the boolean called possible FALSE
		* 
		* if boolean possbile is FALSE
		* 	return FALSE to notify user nd do not change array 
		* 
		*  if boolean possible is TRUE 
		* 	change each value where the ship exists in the array that is a "-" to "b" using a for loop 
		* 	return TRUE to notify user that the placement of ship is possible and was executed
		
	}
	*/		
}
