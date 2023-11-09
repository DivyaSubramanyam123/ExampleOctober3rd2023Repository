package com.sgtesting.ArrayAssignment;

/*
 * Programmatically Assign numbers 200 to 100 which are divisible by nine into single dimensional array and read second half of the elements
 */
public class SingleDNineDivisible {

	public static void main(String[] args) {
		int count=0;
		for (int i=200;i>=100;i--)
		{
			if(i%9==0)
			{
				count++;

			}
		}
		int a[]=new int[count];
		int k=0;
		for(int j=200;j>=100;j--)
		{
			if(j%9==0)
			{
				a[k]=j;
				k++;
			}
		}
		for(int m=a.length/2;m<a.length;m++)
		{
			System.out.println(a[m]);
		}
	}

}
