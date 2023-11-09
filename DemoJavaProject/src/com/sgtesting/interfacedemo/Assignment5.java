package com.sgtesting.interfacedemo;
/*
 * WAP to demonstrate an interface contains variables and execute those variables 
 */
interface Television
{
  int price = 10000;
	void displayScreenInch(int inch);
}
class SonyTV implements Television
{	
	public void displayScreenInch(int inch) {
	System.out.println("Sony Tv Screen Size:"+inch);	
	}
	void displayTvPrice()
	{	
		System.out.println("Sony Tv Price:"+price);
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		SonyTV o=new SonyTV();
		o.displayScreenInch(14);
		o.displayTvPrice();
	}

}
