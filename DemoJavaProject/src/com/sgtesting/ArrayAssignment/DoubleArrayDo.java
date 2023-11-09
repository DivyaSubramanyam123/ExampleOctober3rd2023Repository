package com.sgtesting.ArrayAssignment;
/*
 WAP to create double array and read the elements from double array in reverse order using do while loop
 */
public class DoubleArrayDo {

	public static void main(String[] args) {
		double d[]=new double[4];
		d[0]=12.5;
		d[1]=10.5;
		d[2]=13.5;
		d[3]=14.5;
		int i=d.length-1;
		do
		{
			System.out.println(d[i]);
			i--;
		}while(i>=0);

	}

}
