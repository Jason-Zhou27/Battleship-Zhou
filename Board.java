import java.util.Scanner;

public class Board {

	//variables
	private String[][] squares1; //declare 2D array of Strings called squares1; squares1 will show the player's board
	private String[][] squares2; //declare 2D array of Strings called squares2; squares2 will show the hits/misses that the player had on the computer's board
	private String strSquares1 = "";
	private String strSquares2 = "";
	
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
	}

	//methods
	
	//return representation of the board
	public String toString(){
		//use a nested for loop to concactenate row by row of square1
		for (int r=0;r<10;r++){
			//within a row, fetch strings by shifting columns in the 2D array 
			for (int c=0;c<10;c++){
				strSquares1 = strSquares1 + (squares1[r][c]) + " "; //use the format: existing concactenation + character from particular position + space
			}
			strSquares1 = strSquares1 + ("\n"); //after a row of dashes is completed, create a new line
		}
		
		//use a nested for loop to concactenate row by row of square2
		for (int r=0;r<10;r++){
			//within a row, fetch strings by shifting columns in the 2D array
			for (int c=0;c<10;c++){
				strSquares2 = strSquares2 + (squares2[r][c]) + " "; //use the format: existing concactenation + character from particular position + space
			}
			strSquares2 = strSquares2 + ("\n"); //after a row of dashes is completed, create a new line
		}
		return (strSquares1 + "\n\n" + strSquares2); //return the concactenation of the two squares, separating the two squares by two line breaks
	}
	
	public int toInt() {
		
	}	
}
