package com.sgtesting.interfacedemo;
/*
 * WAP for multiple inheritance in which a subclass implements more than two interfaces
 */
interface OnePlus
{
	void displayRamSize(String s1);
}
interface Samsung
{
	void displayOS(String s2);
}
interface Apple 
{
	void  showBatteryPowerRating(int x);
}
class Customer implements OnePlus,Samsung,Apple
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

}
public class Assignment1 {

	public static void main(String[] args) {
		Customer o= new Customer();
		o.displayRamSize("8GB");
		o.displayOS("OxygenOS");
		o.showBatteryPowerRating(5000);
	}

}
