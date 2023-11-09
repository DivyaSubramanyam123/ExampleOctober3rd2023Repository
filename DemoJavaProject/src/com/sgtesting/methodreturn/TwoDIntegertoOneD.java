package com.sgtesting.methodreturn;
/*
 * 4)For the given 2D integer array the method has to return all the elements of 2D array in the form of 1D array 
 */
class IntegerArrayTwoD
{
	int []change(int x[][])
	{
		int[] z=new int [x.length*x[0].length];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				z[k]=x[i][j];
				k++;
			}
		}
		return z;

	}
}
public class TwoDIntegertoOneD {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		IntegerArrayTwoD obj=new IntegerArrayTwoD();
		int res[]=obj.change(a);
		for(int cc:res)
		{
			System.out.println(cc);
		}

	}

}
