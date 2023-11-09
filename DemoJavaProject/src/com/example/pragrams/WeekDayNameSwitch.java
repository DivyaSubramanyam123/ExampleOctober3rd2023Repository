package com.example.pragrams;

public class WeekDayNameSwitch {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		switch(i)
		{
		case 1:
			System.out.println(i+"its Saturday");
			break;
		
		case 2:
			System.out.println(i+"its Monday");
			break;
		case 3:
			System.out.println(i+"its tuesday");
			break;
		case 4:
			System.out.println(i+"its wednesday");
			break;
		case 5:
			System.out.println(i+"its thursday");
			break;
		case 6:
			System.out.println(i+"its friday");
			break;
		case 7:
			System.out.println(i+"its saturday");
			break;
			default:
			System.out.println(i+"invalid input");
		}	
	}

}
