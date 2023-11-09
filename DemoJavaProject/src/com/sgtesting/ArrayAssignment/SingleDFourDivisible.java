package com.sgtesting.ArrayAssignment;
/*
 * Programmatically Assign numbers in between 100 to 50,Which are divisible by 4 into Single Dimensional Array ,read the elements from single dimensional array  
 */
public class SingleDFourDivisible {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		int a[]=new int[count];
		int k=0;
		for(int j=100;j>=50;j--)
		{
			if(j%4==0)
			{
				a[k]=j;
				k++;

			}
		}
		for(int m=0;m<a.length;m++)
		{
			System.out.println(a[m]);
		}
	}

}
