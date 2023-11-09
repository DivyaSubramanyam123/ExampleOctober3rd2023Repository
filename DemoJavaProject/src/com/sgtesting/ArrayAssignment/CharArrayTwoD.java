package com.sgtesting.ArrayAssignment;
/* 
 * 4)For the given 2D char array return first row of the elements
 */
class charArrayDisplay
{
	char[][] findFirstRow(char ch[][])
	{

		char[][] z=new char[ch.length-2][ch[0].length];
		for(int i=0;i<ch.length;i++)
		{
			z[0][i]=ch[0][i];
		}

		return z;
	}
}
public class CharArrayTwoD {
	public static void main(String[] args) {
		charArrayDisplay obj=new charArrayDisplay();
		char a[][]= {{'A','B','X'},{'C','D','y'},{'E','F','G'}};
		char res[][]=obj.findFirstRow(a);
		for(char b[]:res)
		{
			for(char kk:b)
			{
				System.out.println(kk+" ");
			}
			System.out.println();
		}
	}

}
