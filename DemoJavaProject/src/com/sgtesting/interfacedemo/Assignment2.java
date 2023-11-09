package com.sgtesting.interfacedemo;
/*
 * WAP for multiple inheritance in which a subclass extends an abstract class and implements 
 * more than two interfaces
 */
interface Vivo
{
	void displayRamSize(String s1);
}
interface oppo
{
	void displayOS(String s2);
}
interface  LG
{
	void  showBatteryPowerRating(int x);
}
abstract class Motrola
{
	abstract void displayModelName(String s3);
	void displayColoursAvailable(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Colors avaiable:"+s[i]);
		}
	}
}
class MobilePhone extends Motrola implements Vivo,oppo,LG
{

	
	public void showBatteryPowerRating(int x) {
		
		System.out.println("Battery Power Rating:"+x);
	}

	
	public void displayOS(String s2) {
		
		System.out.println("OS details:"+s2);
	}

	
	public void displayRamSize(String s1) {
		
		System.out.println("Ram Size:"+s1);		
	}
	
	void displayModelName(String s3) {
		System.out.println("Model Name"+s3);
		
	}	
}
public class Assignment2 {

	public static void main(String[] args) {
		String s[]= {"Black","Green","Red"};
		MobilePhone o=new MobilePhone();
		o.displayModelName("Moto Edge 40 Neo ");
		o.displayOS("Oxygen");
		o.displayRamSize("16 GB");
		o.showBatteryPowerRating(50000);
		o.displayColoursAvailable(s);
		
	}

}
