package com.sgtesting.MethodsAssignment;
/*
 * Write a method for the given 3*3 char array concatenate all the elements 
 */
class ArrayConatenate
{

	void concatenateElements(char a[][])
	{
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				s1=s1+" "+a[i][j];
			}
		}
		System.out.print(s1);
	}
}
public class ConcatenateCharArray {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		ArrayConatenate obj=new ArrayConatenate();
		obj.concatenateElements(ch);
	}

}
