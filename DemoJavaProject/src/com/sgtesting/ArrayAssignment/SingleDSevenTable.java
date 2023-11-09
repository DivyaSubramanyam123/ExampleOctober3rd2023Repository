package com.sgtesting.ArrayAssignment;
/*
 * Programmatically assign results of 7 seven table into single Dimensional Array in reverse order and read the elements from array in reverse order 
 */
public class SingleDSevenTable {

	public static void main(String[] args) {
		/*int count=0;
		for (int b=1;b<=10;b++)
		{
			count++;
		}
		*/
		int x=7;
		int a[]=new int[10];
		int k=0;
		for(int y=1;y<=10;y++)
		{
			int m=x*y;
			a[k]=m;
			k++;
		}
		for(int n=a.length-1;n>=0;n--)
		{
			System.out.println(a[n]);
		}


	}
}
