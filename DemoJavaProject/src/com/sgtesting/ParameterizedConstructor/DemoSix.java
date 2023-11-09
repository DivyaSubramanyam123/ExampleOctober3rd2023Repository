package com.sgtesting.ParameterizedConstructor;
/*
 * create a class for desktop ,laptop,mobile devices and execute each members of the class .
 */
class Desktop
{
	String desktopbrandName;
	int noofdesktop;
	int desktopprice;
	int desktopserialNo;
	Desktop(String desktopbrdname,int desktopcount,int desktoppriceamt,int desktopno)
	{
		desktopbrandName=desktopbrdname;
		desktopprice=desktoppriceamt;
		desktopserialNo=desktopno;
		noofdesktop=desktopcount;
		System.out.println("DeskTop BrandName:"+desktopbrandName);
		System.out.println("Deskstop Price:"+desktopprice);
		System.out.println("Deskstop SerialNo:"+desktopserialNo);
		System.out.println("No OF Desktop:"+noofdesktop);
		System.out.println("+++++++++++");
	}
}
class Laptop
{
	String laptopbrandname;
	String laptopscrrensize;
	String processor; 
	int laptopPrice;
	Laptop(String laptopbrndn,String laptopsize,String processortype,int laptopamt)
	{
		laptopbrandname=laptopbrndn;
		laptopscrrensize=laptopsize;
		processor=processortype;
		laptopPrice=laptopamt;
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
	MobileDevices(String mobileos,String mobilebrandn,int amt,double version)
	{
		brandname=mobilebrandn;
		mobileDeviceOS=mobileos;
		osversion=version;
		price=amt;
		System.out.println("mobile BrandName:"+brandname);
		System.out.println("mobileDevice OS:"+mobileDeviceOS);
		System.out.println("mobileDevice os version:"+osversion);
		System.out.println("mobileDevice Price:"+price);
	}
}
public class DemoSix {
	public static void main(String[] args) {
		Desktop dsk=new Desktop("ASUS", 10, 50000, 34567);
		Laptop laptop=new Laptop("HP", "14inch", "intel",50000);
		MobileDevices mobile =new MobileDevices("ios", "Apple", 50000, 17.0);
	}
}