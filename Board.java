public class Board {

	//variables
	private int String[][] squares; //declare 2D array of Strings called squares
	
	//constructor(s)
	public Board(){
		//initialize the values for a 10x10 array from Runestone 4.11.3
		//the size of the array (10x10) is determined from the values given
		squares = { 
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
		}
	}
	//methods
	
	//return representation of the board
	public String toString(){
		//use a nested for loop to print out row by row
		for (r=0;r<10;r++){
			for (c=0;c<10;c++){
				System.out.print(squares[r][c]);
				System.out.print(" ");
			}
			System.out.print("\n"); //after a row of dashes is completed, create a new line
		}
	}
	






}
