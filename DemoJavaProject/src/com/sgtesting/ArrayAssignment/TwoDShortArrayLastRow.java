package com.sgtesting.ArrayAssignment;
/*
 * Create 3*3 short 2D array ,WAP to read last row of the elements alone
 */
public class TwoDShortArrayLastRow {

	public static void main(String[] args) {
		Short s[][]= {{10,20,30},{40,50,60},{70,80,90}};
		/*for(int i=s.length-1;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]+" ");
			}
		}
		*/
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[2][i]);
		}

	}

}
