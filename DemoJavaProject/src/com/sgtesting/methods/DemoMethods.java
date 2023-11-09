package com.sgtesting.methods;
/* 1)WAP a method for the given no it has to find the factorial
 * 
 */
class Maths1
{

	void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of n:"+fact);
	}
}
public class DemoMethods {

	public static void main(String[] args) {
		Maths1 math=new Maths1();
		math.factorial(5);
		math.factorial(6);

	}

}
