package com.sgtesting.secondPartJava;
/*
 * Create a class for employee,department,Insurance and execute each class members
 */
class Employee
{
	String employeeName;
	int employeeId;
	String employeeDOB;
	String contactNo;
}
class Department
{
	String DepartmentName;
	int DepartmentCode;
	String designation;
	String reportingManager;

}
class Insurance 
{
	String planName;
	String planType;
	int premiumAmt;
	String insuranceCoverage;
}
public class DemoOne {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.employeeName="Rajesh";
		emp.employeeId=100;
		emp.employeeDOB="12 Aug 1998";
		emp.contactNo="8147909090";
		System.out.println("Employee Name:"+emp.employeeName);
		System.out.println("Employee Id:"+emp.employeeId);
		System.out.println("EmployeeDOB:"+emp.employeeDOB);
		System.out.println("Employee contact NO:"+emp.contactNo);
		System.out.println("+++++++++++");
		Department dpt=new Department();
		dpt.DepartmentCode=001;
		dpt.DepartmentName="Engineering";
		dpt.designation="Quality Engineer";
		dpt.reportingManager="Mahesh";
		System.out.println("Department Code:"+dpt.DepartmentCode);
		System.out.println("Department Name:"+dpt.DepartmentName);
		System.out.println("Designation:"+dpt.designation);
		System.out.println("Reprotign Manager:"+dpt.reportingManager);
		Insurance insure=new Insurance();
		insure.planType="Health Insurnace";
		insure.planName="Top-up Health Insurance Plan";
		insure.premiumAmt=5000;
		insure.insuranceCoverage="2 lakhs";
		System.out.println("plantype:"+insure.planType);
		System.out.println("Insurance Plan Name:"+insure.planName);
		System.out.println("Insurance premium amount:"+insure.premiumAmt);
		System.out.println("Insurance coverage:"+insure.insuranceCoverage);
		System.out.println("+++++++++++");
	}

}
