package com.example.pragrams;

public class LargestOfThree {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>b && a>c)
		{
			System.out.println(a+"LargestNo");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"Largest No");
		}
		else
		{
			System.out.println(c+"Largest no");
		}
	}

}
