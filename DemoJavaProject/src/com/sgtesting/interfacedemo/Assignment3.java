package com.sgtesting.interfacedemo;
/*
 * WAP to demonstrate one interface extends another interface at multilevel
 */
interface Earphones
{
	void showBrand(String s1);
}
interface Boult extends Earphones
{
	void showModelName(String s2);
}
interface SamsungGalaxy extends Boult 
{
	
	void  countryOfBrandOrigin(String s3);	
}
class Sony implements SamsungGalaxy
{
	public void showModelName(String s1) {
		System.out.println("Model name:"+s1);
		
	}
	public void showBrand(String s2) {
		System.out.println("Brand Name:"+s2);
		
	}
	public void countryOfBrandOrigin(String s3) {
		System.out.println("Country of brand origin"+s3);
		
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		Sony o=new Sony();
		o.countryOfBrandOrigin("Japan");
		o.showBrand("SONY");
		o.showModelName("WI-C100 Neckband");
		
	}

}
