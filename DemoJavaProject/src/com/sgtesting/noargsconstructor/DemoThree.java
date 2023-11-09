package com.sgtesting.noargsconstructor;
/*
 * Create a class for students,library,sports CS department ,execute each members of the class 
 */
class Student
{
	String studentName;
	int studenRollNo;
	String studentDepartment;
	char studentGrade;
	Student()
	{
		studentName="Divya";
		studentDepartment="EEE";
		studenRollNo=13;
		studentGrade='A';
		System.out.println("Student Name:"+studentName);
		System.out.println("StudentDepartment:"+studentDepartment);
		System.out.println("StudentRollNO:"+studenRollNo);
		System.out.println("Student Grade:"+studentGrade);
		System.out.println("+++++++++++");
	}
}
class Library
{
	String librarianName;
	String libraryType;
	int noOfBooks;
	String libraryCardNo  ;
	Library()
	{
		librarianName="Franklin";
		libraryType="Academic Library";
		noOfBooks=100;
		libraryCardNo="1RI013A";
		System.out.println("librarianName:"+librarianName);
		System.out.println("no of books in the library"+noOfBooks);
		System.out.println("Library Type:"+libraryType);
		System.out.println("Library card no:"+libraryCardNo);
		System.out.println("+++++++++++");
	}

}
class Sports
{
	String sportname;
	int noOfTeams;
	String eventName;
	int noOfMatches;
 Sports()
 {
	 sportname="Cricket";
		eventName="ICC World Cup 2023";
		noOfTeams=10;
		noOfMatches=50;
		System.out.println("Sports Name:"+sportname);
		System.out.println("Event Name:"+eventName);
		System.out.println("No of Teams:"+noOfTeams);
		System.out.println("No of Matches:"+noOfMatches);
		System.out.println("+++++++++++");
 }
}
class CSDepartment 
{
	int NoOfLabs;
	String HOD;
	int NoOfStudents;
	int DpeartmentCode;
	CSDepartment()
	{
		DpeartmentCode=05;
		HOD="Fraklin";
		NoOfLabs=16;
		NoOfStudents=80;
		System.out.println("CS Department code:"+DpeartmentCode);
		System.out.println("HOD of CS Department:"+HOD);
		System.out.println("No of Labs in CS Department:"+NoOfLabs);
		System.out.println("No of Students in CS Department:"+NoOfStudents);

	}
}

public class DemoThree {

	public static void main(String[] args) {
		Student std=new Student();
		Library lib=new Library();
		Sports spt=new Sports();
		CSDepartment csdpt=new CSDepartment();

	}

}
