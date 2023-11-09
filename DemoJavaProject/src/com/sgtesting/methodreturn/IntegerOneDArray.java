package com.sgtesting.methodreturn;
/*
 * For the given 1D integer array assign elements into another array in reverse order and return the second array 
 */
class ReverseArray
{
	int[] reverse(int x[])
	{
		int z[]=new int [x.length];
		int k=0;
		for(int i=x.length-1;i>=0;i--)
		{
			z[k]=x[i];
			k++;
		}	
		return z ;
	}
}
public class IntegerOneDArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		ReverseArray obj=new ReverseArray();
		int res[]=obj.reverse(a);
		for(int bb:res)
		{
			System.out.println(bb);
		}

	}

}
