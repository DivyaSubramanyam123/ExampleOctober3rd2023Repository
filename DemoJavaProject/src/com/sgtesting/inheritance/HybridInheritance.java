package com.sgtesting.inheritance;
/*
 * WAP to describe hybrid inheritance
 */
class MainUniversity {
	
	void totalDepartmentInuniversity (int x )
	{
		System.out.println("Total Departments in VTU university:"+x);
	}

}
class Departments extends MainUniversity
{
	void totalDepartmentsinNotEnginneering (int x)
	{
		System.out.println("No of non Engineering departments:"+x);
	}
}
class EEEDept extends MainUniversity
{
	void totalStudentsEEE(int x)
	{
	System.out.println("No of students in EEE department:"+x);	
	}
}
class EEEFaculty extends EEEDept
{
	void totalFaculties(int x)
	{
		System.out.println("No of faculty in EEE department:"+x);
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Departments obj=new Departments();
		obj.totalDepartmentInuniversity(20);
		obj.totalDepartmentsinNotEnginneering(5);
		EEEFaculty obj2=new EEEFaculty();
		obj2.totalDepartmentInuniversity(100);
		obj2.totalStudentsEEE(60);
		obj2.totalFaculties(10);
		
		
	}
		
	}

