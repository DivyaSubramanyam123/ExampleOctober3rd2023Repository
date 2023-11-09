package com.sgtesting.ArrayAssignment;
/*
 * create 3*3 2D double array,Read the elements from the array in reverse order
 */

public class TwoDDoubleArrayRreverse {

	public static void main(String[] args) {
		Double d[][]= {{10.5,11.5,12.5},{16.5,17.5,18.5},{26.5,27.5,28.5}};
		for(int i=d.length-1;i>=0;i--)
		{
			for(int j=d[i].length-1;j>=0;j--)
			{
				System.out.print(d[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
