package com.sgtesting.inheritance;
/*
 * WAP for multilevel inheritance in which each class contains same method name with signature 
 */
class BridgestoneCompany
{
	void CountOfEmployee(int count)
	{
		System.out.println("Employee Count in Bridgestone COmpany:"+count);
	}
}
class  Danlaw extends BridgestoneCompany
{
	Danlaw(int count)
	{
		super.CountOfEmployee(count);
	}

	void CountOfEmployee(int count)
	{
		System.out.println("Employee Count in Danlaw Company :"+count);
	}

}
class Azuga extends Danlaw
{
	Azuga(int count1,int count)
	{
		super(count1);
		super.CountOfEmployee(count);	
	}
	void CountOfEmployee(int count)
	{
		System.out.println("Employee Count in Azuga Company :"+count);
	}
}
public class MultiLevelInheitanceSameMethods {

	public static void main(String[] args) {
		Azuga a=new Azuga(5000,15000);
		a.CountOfEmployee(1000);

	}

}
