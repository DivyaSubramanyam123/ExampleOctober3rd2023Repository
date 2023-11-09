package com.sgtesting.methodreturn;
/*
 * 2)For the given (2)1D integer array.create a resultant array and return the resultant array.
 */
class ResultantArray
{
	int[] findResultant(int x[],int y[])
	{
		int z[]=new int [x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int j=0;j<y.length;j++)
		{
			z[x.length+j]=y[j];
		}
		return z;

	}
}
public class ResultantArrayDemo {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		ResultantArray obj=new ResultantArray();
		int res[]=	obj.findResultant(a,b);
		for(int bb :res)
		{
			System.out.println(bb);
		}

	}

}
