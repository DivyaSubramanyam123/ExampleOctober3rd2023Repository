package com.sgtesting.MethodsAssignment;
/*
 * 5)Write a method to display prime no in b/w 250 to 200
 */
class PrimeNO3
{
	void findPrime()
	{
		for(int i=250;i>=200;i--)
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
public class DisplayPrimeNo2 {

	public static void main(String[] args) {
		PrimeNO3 obj=new PrimeNO3();
		obj.findPrime();
	}

}
