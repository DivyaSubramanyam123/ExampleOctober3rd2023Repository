package com.sgtesting.inheritance;

/*
 * WAP for  Hierarchical Inheritance in which super class contains parameterized constructor 
 */
class University
{
	University(String name)
	{
		System.out.println("University name:"+name);
	}
	void CountOfStu(int count)
	{
		System.out.println("No Of Students :"+count);
	}
}
class  ListOfDepartments extends University
{
	ListOfDepartments(String name, String univLocation) {
		super(name);
		System.out.println("University Location:"+univLocation);

	}

	void DepartmentName(String s1,String s2)
	{
		System.out.println("Departments:"+(s1+"& "+s2));

	}
}
class  EEEDepartment extends University
{
	EEEDepartment(String name,String hodname) {
		super(name);
		System.out.println("EEE dept HOD Name:"+hodname);
	}

	void EEEDeptCount(int deptcount)
	{
		System.out.println("EEE Dept count:"+deptcount);
	}
}
public class HierarchicalInheritanceConstructor {

	public static void main(String[] args) {
		ListOfDepartments obj=new ListOfDepartments("VTU","Belgum");
		obj.CountOfStu(200);
		obj.DepartmentName("EEE", "cs");
		EEEDepartment obj1=new EEEDepartment("BangaloreUniversity","Shankar");
		obj1.CountOfStu(300);
		obj1.EEEDeptCount(50);
	}

}
