package com.sgtesting.ParameterizedConstructor;
/*
 * Create a class for employee,department,Insurance and execute each class members
 */
class Employee
{
	String employeeName;
	int employeeId;
	String employeeDOB;
	String contactNo;
	Employee(String emp,int id,String DOB,String contact)
	{
		employeeName=emp;
		employeeId=id;
		employeeDOB=DOB;
		contactNo=contact;
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
	Department(String departname,int departcd,String desg,String reportM)
	{
		DepartmentCode=departcd;
		DepartmentName=departname;
		designation=desg;
		reportingManager=reportM;
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
	Insurance(String plan,String planT,int amt,String insuranceC)
	{
		planType=plan;
		planName=planT;
		premiumAmt=amt;
		insuranceCoverage=insuranceC;
		System.out.println("plantype:"+planType);
		System.out.println("Insurance Plan Name:"+planName);
		System.out.println("Insurance premium amount:"+premiumAmt);
		System.out.println("Insurance coverage:"+insuranceCoverage);
		System.out.println("+++++++++++");
	}
}
public class DemoOne {

	public static void main(String[] args) {
		Employee emp=new Employee("Rajesh",100,"12 Aug 1998","8147909090");
		Department dpt=new Department("Engineering", 001, "Quality Engineer", "Mahesh");
		Insurance insure=new Insurance("Health Insurnace", "Top-up Health Insurance Plan", 50000, "2 Lakhs");
	}

}
