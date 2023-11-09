package com.sgtesting.ArrayAssignment;
/*
 * Create 3*3 long 2D array ,WAP to display the sum of all the elements 
 */
public class TwoDLongSum {

	public static void main(String[] args) {
		long l[][]= {{10,20,30},{40,50,60},{70,80,90}};
		long sum=0;
		for(int i=0;i<l.length;i++)
		{
			for(int j=0;j<l[i].length;j++)
			{
				sum=sum+l[i][j];
			}
		}
		System.out.println(sum);

	}
}