package com.sgtesting.ArrayAssignment;
/*
 * Create Integer 3*3 2D array ,read only first row of the elements 
 */

public class TwoDIntegerArrayFirstRow {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};


		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i][0]);
		}


	}

}
