package com.example.pragrams;

public class NoOfDigit {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		if(i>0 && i<=9)
		{
			System.out.println(i+" is a one digit no");
		}
		else if (i>=10 && i<=99)
		{
			System.out.println(i+" is a two digit no");
		}
		else if (i>=100 && i<=999)
		{
			System.out.println(i+" is a three digit no");
		}
		else if(i>=1000 && i<=9999)
		{
			System.out.println(i+" is a four digit no");
		}
		else
		{
			System.out.println(i+ " is greater than four digit no");
		}

	}

}
