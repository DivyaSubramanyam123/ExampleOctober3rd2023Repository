package com.sgtesting.abstractclass;
/*
 * 6)If Abstract class contains only the instance methods ,WAP to execute Instance methods 
 */

abstract class Cars
{
	void displaytransmission(String transmission)
	{
		System.out.println("Transimission:"+transmission);
	}
	void displayCarBodyTypes(String bodytypes[])
	{
		for(int i=0;i<bodytypes.length;i++)
		{
			System.out.println("car bodytypes:"+bodytypes[i]);
		}
	}
}
class FuelType extends Cars
{	
}
public class InstanceMethods {

	public static void main(String[] args) {
		FuelType obj=new FuelType();
		String s[]= {"SUV","Sedan","MUV"};
		obj.displayCarBodyTypes(s);
		obj.displaytransmission("Automatic");

	}

}
