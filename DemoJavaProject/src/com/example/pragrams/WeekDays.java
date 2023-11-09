package com.example.pragrams;

public class WeekDays {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		if(i==1)
		{
			System.out.println(i+" its Sunday");
		}
		else if(i==2)
		{
			System.out.println(i+" its Monday");
		}
		else if(i==3)
		{
			System.out.println(i+" its tuesday");
		}
		else if(i==4)
		{
			System.out.println(i+"its wednesday");
		}
		else if(i==5)
		{
			System.out.println(i+"its Thursaday");
		}
		else if(i==6)
		{
			System.out.println(i+"its Friday");
		}
		else if (i==7)
		{
			System.out.println(i+"its Saturday");
		}
		else 
		{
			System.out.println(i+" invalid input ");
		}
	}

}
