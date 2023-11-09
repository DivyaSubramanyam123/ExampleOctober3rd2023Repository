package com.example.pragrams;

public class DivisibleByNine {

	public static void main(String[] args) {
	int i=Integer.parseInt(args[0]);
	if(i%9==0)
	{
		System.out.println(i+" Divisible by Nine");
	}
	else
	{
		System.out.println(i+" is not divisible by Nine");
	}
	}

}
