package com.sgtesting.noargsconstructor;
/*
 * Create a class for employee,department,Insurance and execute each class members
 */
class Employee
{
	String employeeName;
	int employeeId;
	String employeeDOB;
	String contactNo;
	Employee()
	{
		employeeName="Rajesh";
		employeeId=100;
		employeeDOB="12 Aug 1998";
		contactNo="8147909090";
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Id:"+employeeId);
		System.out.println("EmployeeDOB:"+employeeDOB);
		System.out.println("Employee contact NO:"+contactNo);
		System.out.println("+++++++++++");
	}
}
class Department
{
	String DepartmentName;
	int DepartmentCode;
	String designation;
	String reportingManager;
	Department()
	{
		DepartmentCode=001;
		DepartmentName="Engineering";
		designation="Quality Engineer";
		reportingManager="Mahesh";
		System.out.println("Department Code:"+DepartmentCode);
		System.out.println("Department Name:"+DepartmentName);
		System.out.println("Designation:"+designation);
		System.out.println("Reprotign Manager:"+reportingManager);
		System.out.println("+++++++++++");
	}

}
class Insurance 
{
	String planName;
	String planType;
	int premiumAmt;
	String insuranceCoverage;
	Insurance()
	{
		planType="Health Insurnace";
		planName="Top-up Health Insurance Plan";
		premiumAmt=5000;
		insuranceCoverage="2 lakhs";
		System.out.println("plantype:"+planType);
		System.out.println("Insurance Plan Name:"+planName);
		System.out.println("Insurance premium amount:"+premiumAmt);
		System.out.println("Insurance coverage:"+insuranceCoverage);
		System.out.println("+++++++++++");
	}
}
public class DemoOne {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Department dpt=new Department();
		Insurance insure=new Insurance();
	}

}
