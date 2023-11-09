package com.sgtesting.interfacedemo;
/*
 * WAP to demonstrate one interface extends another interface at hierarchical level 
 */
interface Refrigerator
{
	void showBrandName(String s1);
}
interface Whirlpool extends Refrigerator
{
	void displayStyleName(String s2);
}
interface Croma extends Refrigerator
{
	void priceDetails(int x);
}
class Voltas implements Croma,Whirlpool
{

	public void showBrandName(String s1) {
		System.out.println("Brand name:"+s1);
		
	}

	
	public void priceDetails(int x) {
		System.out.println("PriceDetials:"+x);
	}
	
	public void displayStyleName(String s2) {
		System.out.println("Display Style name");		
	}
	
}
public class Assignment4 {

	public static void main(String[] args) {
		Voltas o=new Voltas();
		o.displayStyleName("183L-4 Star");
		o.priceDetails(21000);
		o.showBrandName("Voltas Beko ‘A TATA product’");

	}

}
