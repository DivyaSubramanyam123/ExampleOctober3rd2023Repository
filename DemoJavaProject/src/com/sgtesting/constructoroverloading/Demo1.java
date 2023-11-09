package com.sgtesting.constructoroverloading;

class University
{

	University(String universityName)
	{
		System.out.println("University Name:"+universityName);
	}
	University(int noOfCollege)
	{
		System.out.println("noOfCollege:"+noOfCollege);
	}
	University(String Address,int pinCode)
	{
		System.out.println("Address of the university:"+Address);
		System.out.println("Pincode of the university:"+pinCode);
	}
	University(String email,String contactNo)
	{
		System.out.println("emailId of the University:"+email);
		System.out.println("Contact no:"+contactNo);

	}
}
public class Demo1 {

	public static void main(String[] args) {

		University obj=new University("VTU");
		University obj2=new University(100);
		University obj3=new University("Belagavi",590018);
		University obj4=new University("grievance@vtu.ac.in ","0831-123456");

	}

}
