package com.sgtesting.methodreturn;
/*
 * 3)For the given (2) 1D integer array subtract each element and return the result of  second half  of the element 
 */
class IntegerSubtraction
{
	int [] subtraction(int x[],int y[])
	{

		int z[]=new int [x.length];
		int k[]=new int [(x.length/2)];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i]-y[i];
		}
		int t=0;
		for(int j=z.length/2;j<z.length;j++)
		{
			k[t]=z[j];
			t++;
		}
		return k;
	}
}
public class SubtractionInteger {

	public static void main(String[] args) {

		int b[]= {1,2,3,2};
		int a[]= {10,6,8,9};
		IntegerSubtraction obj=new IntegerSubtraction();
		int[] res=obj.subtraction(a, b);
		for(int cc:res)
		{
			System.out.println(cc);
		}




	}

}
