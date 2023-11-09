package com.sgtesting.secondPartJava;
/*
 * create a class for desktop ,laptop,mobile devices and execute each members of the class .
 */
class Desktop
{
	String desktopbrandName;
	int noofdesktop;
	int desktopprice;
	int desktopserialNo;
}
class Laptop
{
	String laptopbrandname;
	String laptopscrrensize;
	String processor; 
	int laptopPrice;
}
class MobileDevices
{
	String mobileDeviceOS;
	String brandname;
	int price;
	double osversion;
}
public class DemoSix {
	public static void main(String[] args) {
		Desktop dsk=new Desktop();
		dsk.desktopbrandName="ASUS";
		dsk.desktopprice=5000;
		dsk.desktopserialNo=34567;
		dsk.noofdesktop=10;
		Laptop laptop=new Laptop();
		laptop.laptopbrandname="HP";
		laptop.laptopscrrensize="14inch";
		laptop.processor="Intel";
		laptop.laptopPrice=50000;
		MobileDevices mobile =new MobileDevices();
		mobile.brandname="Apple";
		mobile.mobileDeviceOS="ios";
		mobile.osversion=17.0;
		mobile.price=60000;
		System.out.println("DeskTop BrandName:"+dsk.desktopbrandName);
		System.out.println("Deskstop Price"+dsk.desktopprice);
		System.out.println("Deskstop SerialNo:"+dsk.desktopserialNo);
		System.out.println("No OF Desktop"+dsk.noofdesktop);
		System.out.println("+++++++++++");
		System.out.println("Laptop BrandName:"+laptop.laptopbrandname);
		System.out.println("Laptop ScreenSize:"+laptop.laptopscrrensize);
		System.out.println("Laptop processor:"+laptop.processor);
		System.out.println("Laptop price:"+laptop.laptopPrice);
		System.out.println("+++++++++++");
		System.out.println("mobile BrandName:"+mobile.brandname);
		System.out.println("mobileDevice OS:"+mobile.mobileDeviceOS);
		System.out.println("mobileDevice os version:"+mobile.osversion);
		System.out.println("mobileDevice Price:"+mobile.price);
	}
}