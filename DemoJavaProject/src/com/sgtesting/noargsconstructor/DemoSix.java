package com.sgtesting.noargsconstructor;
/*
 * create a class for desktop ,laptop,mobile devices and execute each members of the class .
 */
class Desktop
{
	String desktopbrandName;
	int noofdesktop;
	int desktopprice;
	int desktopserialNo;
	Desktop()
	{
		desktopbrandName="ASUS";
		desktopprice=5000;
		desktopserialNo=34567;
		noofdesktop=10;
		System.out.println("DeskTop BrandName:"+desktopbrandName);
		System.out.println("Deskstop Price"+desktopprice);
		System.out.println("Deskstop SerialNo:"+desktopserialNo);
		System.out.println("No OF Desktop"+noofdesktop);
		System.out.println("+++++++++++");
	}
}
class Laptop
{
	String laptopbrandname;
	String laptopscrrensize;
	String processor; 
	int laptopPrice;
	Laptop()
	{
		laptopbrandname="HP";
		laptopscrrensize="14inch";
		processor="Intel";
		laptopPrice=50000;
		System.out.println("Laptop BrandName:"+laptopbrandname);
		System.out.println("Laptop ScreenSize:"+laptopscrrensize);
		System.out.println("Laptop processor:"+processor);
		System.out.println("Laptop price:"+laptopPrice);
		System.out.println("+++++++++++");

	}
}
class MobileDevices
{
	String mobileDeviceOS;
	String brandname;
	int price;
	double osversion;
	MobileDevices()
	{
		brandname="Apple";
		mobileDeviceOS="ios";
		osversion=17.0;
		price=60000;
		System.out.println("mobile BrandName:"+brandname);
		System.out.println("mobileDevice OS:"+mobileDeviceOS);
		System.out.println("mobileDevice os version:"+osversion);
		System.out.println("mobileDevice Price:"+price);
	}
}
public class DemoSix {
	public static void main(String[] args) {
		Desktop dsk=new Desktop();
		Laptop laptop=new Laptop();
		MobileDevices mobile =new MobileDevices();
	}
}