package com.sgtesting.MethodsAssignment;
/*
 * 9)Write a method for the given 3*3 Integer array assign 2nd row of elements into a 1D Array and display 
 * the elements from 1D array 
 */
class IntegerArray
{
	void assignToOneDArray(int a[][])
	{
		int b[]=new int[(a.length-2)*(a[1].length)];
		int k=0;
		for(int i=a.length-2;i<=a.length-2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[k]=a[i][j];
				k++;
			}
		}
		for(int zz:b)
		{
			System.out.print(zz+" ");
		}
		System.out.println();

	}
}
public class IntegerArraySecondRow {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		IntegerArray obj=new IntegerArray();
		obj.assignToOneDArray(arr);
	}

}
