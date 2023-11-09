package com.sgtesting.methodreturn;
/*]
 *3) Write a method it has to return sum of 100 to 200 which are divisible by 7
 */
class SumOfNoDivisibleSeven
{
	int sum=0;
	int findsumDivisible(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class SumOfNoDivisibleBy7 {

	public static void main(String[] args) {
		SumOfNoDivisibleSeven obj=new SumOfNoDivisibleSeven();
		int s=obj.findsumDivisible(100,200);
		System.out.println(s);

	}

}
