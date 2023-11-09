package com.sgtesting.MethodsAssignment;
/*
 * 3)Write a method to find the count of prime no in between 1 to 100
 */
class PrimeNo1
{
	void countPrime()
	{
		int count=0;
		for(int i=2;i<=100;i++)
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
				count++;
			}	
		}
		System.out.println(count);
	}
}
public class CountOfprimeNo {

	public static void main(String[] args) {
		PrimeNo1 obj=new PrimeNo1();
		obj.countPrime();
	}

}
