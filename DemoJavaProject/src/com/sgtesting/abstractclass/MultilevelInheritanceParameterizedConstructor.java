package com.sgtesting.abstractclass;
/*
 * 3)In a Multilevel Inheritance super class is an abstract class and it contains parameterized constructor 
 */
abstract class Company 
{
	Company(int empCount,int deptCount)
	{
		System.out.println("Employee count:"+empCount);
		System.out.println("Departments count"+deptCount);
	}
}
class  Departments extends Company 
{

	Departments(int empCount, int deptCount,String deptname) {
		super(empCount,deptCount);	
		System.out.println("Department name:"+deptname);
	}

}
class Enginerring extends Departments
{

	Enginerring(int EmployeeCount, int DeptCount, String deptname,int EngdeptCount) {
		super(EmployeeCount, DeptCount,deptname );
		System.out.println("Engineering department count:"+EngdeptCount);
	}

}
public class MultilevelInheritanceParameterizedConstructor {

	public static void main(String[] args) {
		Enginerring obj=new Enginerring(100,6,"Engineering",60);	
	}

}
