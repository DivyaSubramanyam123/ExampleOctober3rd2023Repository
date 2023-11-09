package com.sgtesting.abstractclass;
/*
 *1) If Abstract class contains only two static methods,WAP to execute static methods from abstract class
 */
abstract class Chrome
{

	static void showVersion(String version)
	{
		System.out.println("Chrome Version:"+version);
	}
	static  void showBrowserName(String name)
	{
		System.out.println("Browser Name:"+name);
	}
}
public class Browsers {

	public static void main(String[] args) {	
		Chrome.showBrowserName("Chrome");
		Chrome.showVersion("118.0.5993.11");
	}

}
