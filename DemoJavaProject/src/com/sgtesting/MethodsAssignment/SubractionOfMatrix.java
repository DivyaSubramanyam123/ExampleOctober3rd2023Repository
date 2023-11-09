package com.sgtesting.MethodsAssignment;


/*10)Write a program to perform subtraction of 2 matrix and transpose
 * 
 */
class matrix
{
	void sub(int x[][],int y[][])
	{
		if(x.length==y.length&&x[0].length==y[0].length);
		{
			int c[][] =new int[x.length][x[0].length];
			int t[][]=new int[c.length][c[0].length];
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					c[i][j] =x[i][j]-y[i][j];	
				}
			}
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{

					t[i][j]=c[j][i];
					System.out.print(t[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
public class SubractionOfMatrix {

	public static void main(String[] args) {
		int a[][]= {{8,5},{6,8}};
		int b[][]= {{3,4},{4,2}};
		matrix obj=new matrix();
		obj.sub(a,b);
	}

}
