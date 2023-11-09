package com.sgtesting.polymorphism;

abstract class Bank
{
	abstract void displayRateOfIntrest();
}
class Canara extends Bank
{	
	void displayRateOfIntrest() {

		double intrest=6.6;
		System.out.println("Rate of intrest in canara bank:"+intrest);
	}

}
class ICICI extends Canara
{
	void displayRateOfIntrest() {

		double intrest=7.6;
		System.out.println("Rate of intrest in canara bank:"+intrest);
	}
}
public class Intrest {

	public static void main(String[] args) {
		Bank bank=null;
		Canara canara=new Canara();
		ICICI icici=new ICICI();
		bank=canara;
		bank.displayRateOfIntrest();
		bank=icici;
		bank.displayRateOfIntrest();


	}

}
