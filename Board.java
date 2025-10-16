public class Board {

	//variables
	private String[][] squares1; //declare 2D array of Strings called squares1
	private String[][] squares2; //declare 2D array of Strings called squares2
	private String strSquares1 = "";
	private String strSquares2 = "";
	
	//constructor(s)
	public Board(){
		//initialize the values for a 10x10 array from Runestone 4.11.3
		//the size of the array (10x10) is determined from the values given
		squares1 = new String[][] { 
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",}
		};
		
		squares2 = new String[][] { 
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",},
			{"-","-","-","-","-","-","-","-","-","-",}
		};
	}
	//methods
	
	//return representation of the board
	public String toString(){
		//use a nested for loop to concactenate row by row of square1
		for (int r=0;r<10;r++){
			for (int c=0;c<10;c++){
				strSquares1 = strSquares1 + (squares1[r][c]) + " ";
			}
			strSquares1 = strSquares1 + ("\n"); //after a row of dashes is completed, create a new line
		}
		
		//use a nested for loop to print out row by row of square2
		for (int r=0;r<10;r++){
			for (int c=0;c<10;c++){
				strSquares2 = strSquares2 + (squares2[r][c]) + " ";
			}
			strSquares1 = strSquares1 + ("\n"); //after a row of dashes is completed, create a new line
		}
		return (strSquares1 + "\n\n" + strSquares2);
	}
	






}
