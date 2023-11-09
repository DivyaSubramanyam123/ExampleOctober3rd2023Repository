package com.sgtesting.methods;
/* 
 * 4)For the given 2D char array return first row of the elements
 */
class charArrayDisplay
{
	char[] findFirstRow(char ch[][])
	{
	
		char[] z=new char[(ch.length-2)*ch[0].length];
		for(int i=0;i<ch.length;i++)
		{
			z[i]=ch[0][i];
		}

		return z;
	}
}
public class CharArrayTwoD {
	public static void main(String[] args) {
		charArrayDisplay obj=new charArrayDisplay();
		char a[][]= {{'A','B','X'},{'C','D','y'},{'E','F','G'}};
	char res[]=	obj.findFirstRow(a);
		for(char kk:res)
		{
			System.out.println(kk);
		}
	}

}
