package com.sgtesting.ArrayAssignment;
/*
 * Create 2D 2*3 Char Array ,Read Elements using do while loop 
 */
public class TwoDCharArrayDoWhileLoop {
	public static void main(String[] args)
	{
		char ch[][]= {{'H','D','U'},{'S','S','E'}};
		int i=0;
		do 
		{
			int j=0;
			do {
				System.out.print(ch[i][j]+" ");
				j++;
			}while(j<ch[i].length);
			System.out.println();
			i++;		  
		}while(i<ch.length);

	}
}
