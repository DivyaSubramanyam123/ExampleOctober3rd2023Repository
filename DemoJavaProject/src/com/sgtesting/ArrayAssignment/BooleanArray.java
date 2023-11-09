package com.sgtesting.ArrayAssignment;
/*
 * WAP to create boolean array and read the elements from boolean array using for loop
 */
public class BooleanArray {

	public static void main(String[] args) {
		boolean val[]=new boolean[5];
		val[0]=true;
		val[1]=false;
		val[2]=false;
		val[3]=true;
		val[4]=true;
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
	}

}
