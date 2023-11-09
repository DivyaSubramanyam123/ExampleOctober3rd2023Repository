package com.sgtesting.methodreturn;
/*
 * 6)Write a method for the given no it has to return factorial result
 */
class factorialOfNumber
{
	int findFactorial(int n)
	{

		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}

		return fact;
	}
}
public class FactorialOfNo {
	public static void main(String[] args) {
		factorialOfNumber obj=new factorialOfNumber();
		int b=	obj.findFactorial(5);
		System.out.println("Factorial of n:"+b);

	}

}
