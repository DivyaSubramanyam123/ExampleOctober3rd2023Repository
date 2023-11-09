package com.sgtesting.MethodsAssignment;

/*
 * 2)Write a method to display prime no in between 50 to 100
 */
class PrimeNo
{
	void findPrime()
	{
		for(int i=50;i<=100;i++)
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
				System.out.println(i);
			}	
		}
	}
}

public class DisplayPrimeNo {

	public static void main(String[] args) {
		PrimeNo obj=new PrimeNo();
		obj.findPrime();

	}
}
