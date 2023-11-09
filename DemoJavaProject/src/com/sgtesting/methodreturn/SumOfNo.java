package com.sgtesting.methodreturn;
/*
 * 1)Write a method to return sum of first 20 numbers
 */
class SumOfNumbers
{
	int sum=0;
	int findSum(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
public class SumOfNo {
	public static void main(String[] args) {
		SumOfNumbers obj=new SumOfNumbers();
		int a=	obj.findSum(1,20);
		System.out.println("Sum of Numbers is: "+a);

	}

}
