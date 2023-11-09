package com.sgtesting.methods;
/*
 * 2)Write method to display the no 100 to 50 which are divisible by 3
 */
class Maths2
{
	void divisibleby3()
	{
		for(int i=100;i>=50;i--)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Maths2 obj=new Maths2();
		obj.divisibleby3();

	}

}
