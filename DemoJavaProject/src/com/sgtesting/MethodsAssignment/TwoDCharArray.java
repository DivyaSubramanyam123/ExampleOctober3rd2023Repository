package com.sgtesting.MethodsAssignment;
/*
 * 7)Write a method for the given 2D 3*3 char Array transpose the array
 */
class DemoArray
{
	void transposeArray(char a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{

				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
public class TwoDCharArray {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		DemoArray obj=new DemoArray();
		obj.transposeArray(ch);
	}

}
