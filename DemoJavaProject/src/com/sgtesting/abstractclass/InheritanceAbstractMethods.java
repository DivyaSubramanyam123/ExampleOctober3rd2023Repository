package com.sgtesting.abstractclass;
/*
 * 4)In multilevel inheritance super class contains an abstract methods based on the subclass
 * object execute all the members
 */
abstract class Bank  
{
	abstract void  intersetRateFD(double percent);
	abstract void tenure(int noOfDays);
}
class SBI  extends Bank
{
	void intersetRateFD(double percent) {
		System.out.println("SBI account intrest rate for FD:"+percent);
	}

	
	void tenure(int noOfDays) {
		System.out.println("SBI account tenure for Fd:"+noOfDays);
		
	}

}
class Canara extends  SBI
{
	Canara(double percent)
	{
		super.intersetRateFD(percent);
	}
	void intersetRateFD(double percent) {
		System.out.println("canara account intrest rate for FD:"+percent);
	}	

}
public class InheritanceAbstractMethods {

	public static void main(String[] args) {
		Canara obj=new Canara(2.5);
		obj.intersetRateFD(3.5);
		obj.tenure(7);
	}
}
