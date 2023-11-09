package com.sgtesting.methodreturn;
/*
 * 1)For the given 2 1D integer array,Perform the addition of each element and return the result.
 */
class IntegerAddition
{
	int[] addition(int x[],int y[])
	{
		int z[]=new int [x.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i]+y[i];

		}
		return z;
	}
}
public class AdditionIntegerArray {

	public static void main(String[] args) {
		IntegerAddition obj=new IntegerAddition();
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int res[]=obj.addition(a, b);
		for(int kk:res)
		{
			System.out.println(kk);
		}

	}

}
