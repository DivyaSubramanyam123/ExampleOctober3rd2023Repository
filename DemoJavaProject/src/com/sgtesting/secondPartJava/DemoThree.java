package com.sgtesting.secondPartJava;
/*
 * Create a class for students,library,sports CS department ,execute each members of the class 
 */
class Student
{
	String studentName;
	int studenRollNo;
	String studentDepartment;
	char studentGrade;
}
class Library
{
	String librarianName;
	String libraryType;
	int noOfBooks;
	String libraryCardNo  ;

}
class Sports
{
	String sportname;
	int noOfTeams;
	String eventName;
	int noOfMatches;

}
class CSDepartment 
{
	int NoOfLabs;
	String HOD;
	int NoOfStudents;
	int DpeartmentCode;
}

public class DemoThree {

	public static void main(String[] args) {
		Student std=new Student();
		std.studentName="Divya";
		std.studentDepartment="EEE";
		std.studenRollNo=13;
		std.studentGrade='A';
		Library lib=new Library();
		lib.librarianName="Franklin";
		lib.libraryType="Academic Library";
		lib.noOfBooks=100;
		lib.libraryCardNo="1RI013A";
		Sports spt=new Sports();
		spt.sportname="Cricket";
		spt.eventName="ICC World Cup 2023";
		spt.noOfTeams=10;
		spt.noOfMatches=50;
		CSDepartment csdpt=new CSDepartment();
		csdpt.DpeartmentCode=05;
		csdpt.HOD="Fraklin";
		csdpt.NoOfLabs=16;
		csdpt.NoOfStudents=80;
		System.out.println("Student Name:"+std.studentName);
		System.out.println("StudentDepartment:"+std.studentDepartment);
		System.out.println("StudentRollNO:"+std.studenRollNo);
		System.out.println("Student Grade:"+std.studentGrade);
		System.out.println("+++++++++++");
		System.out.println("librarianName:"+lib.librarianName);
		System.out.println("no of books in the library"+lib.noOfBooks);
		System.out.println("Library Type:"+lib.libraryType);
		System.out.println("Library card no:"+lib.libraryCardNo);
		System.out.println("+++++++++++");
		System.out.println("Sports Name:"+spt.sportname);
		System.out.println("Event Name:"+spt.eventName);
		System.out.println("No of Teams:"+spt.noOfTeams);
		System.out.println("No of Matches:"+spt.noOfMatches);
		System.out.println("+++++++++++");
		System.out.println("CS Department code:"+csdpt.DpeartmentCode);
		System.out.println("HOD of CS Department:"+csdpt.HOD);
		System.out.println("No of Labs in CS Department:"+csdpt.NoOfLabs);
		System.out.println("No of Students in CS Department:"+csdpt.NoOfStudents);



	}

}
