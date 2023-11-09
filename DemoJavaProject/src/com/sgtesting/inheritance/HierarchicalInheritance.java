package com.sgtesting.inheritance;
/*
 * WAP to describe  Hierarchical Inheritance
 */
class Employee
{
	void CountOfEmp(int count)
	{
		System.out.println("No Of Employees :"+count);
	}
}
class  Department extends Employee
{
	void DepartmentName(String s1,String s2)
	{
		System.out.println("Departments:"+(s1+"& "+s2));

	}
}
class  EngineeringDepartment extends Employee
{
	void EngineeringDeptCount(int deptcount)
	{
		System.out.println("Engineering Dept count:"+deptcount);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Department obj=new Department();
		obj.CountOfEmp(50);
		obj.DepartmentName("Engineering", "Ops");
		EngineeringDepartment obj1=new EngineeringDepartment();
		obj1.CountOfEmp(100);
		obj1.EngineeringDeptCount(25);
	}

}
