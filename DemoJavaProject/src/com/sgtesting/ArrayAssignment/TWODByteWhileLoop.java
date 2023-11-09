package com.sgtesting.ArrayAssignment;
/*
 * create 3*3 byte 2D array ,Read Elements from the array using while loop 
 */
public class TWODByteWhileLoop {

	public static void main(String[] args) {
		byte b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int i=0;
		while(i<b.length)
		{
			int j=0;
			while(j<b[i].length)
			{
				System.out.print(b[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
