package com.sgtesting.MethodsAssignment;
/*
 *4) Write a method to find the sum of prime no in b/w 150 to 100
 */
class PrimeNo2
{
	void findSumOfPrime()
	{
		int sum=0;
		for(int i=150;i>=100;i--)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag+=1;
					break;
				}
			}	
			if(flag==0)
			{
				sum+=i;
			}	
		}
		System.out.println(sum);
	}
}

public class SumOfPrimeNo {

	public static void main(String[] args) {
		PrimeNo2 obj=new PrimeNo2();
		obj.findSumOfPrime();

	}

}
