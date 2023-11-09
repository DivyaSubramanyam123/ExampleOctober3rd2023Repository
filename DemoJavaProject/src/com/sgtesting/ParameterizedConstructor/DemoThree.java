package com.sgtesting.ParameterizedConstructor;
/*
 * Create a class for students,library,sports CS department ,execute each members of the class 
 */
class Student
{
	String studentName;
	int studenRollNo;
	String studentDepartment;
	char studentGrade;
	Student(String studentn,int studentrl,String studentDpt,char studentgrd)
	{
		studentName=studentn;
		studentDepartment=studentDpt;
		studenRollNo=studentrl;
		studentGrade=studentgrd;
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
	Library(String librariann,String libraryt,int bcount,String librarycrd)
	{
		librarianName=librariann;
		libraryType=libraryt;
		noOfBooks=bcount;
		libraryCardNo=librarycrd;
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
	Sports(String sprtn,int teamcount,String evntn,int matchcount)
	{
		sportname=sprtn;
		eventName=evntn;
		noOfTeams=teamcount;
		noOfMatches=matchcount;
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
	CSDepartment(int labcount,String headoddept,int studentc,int deptc)
	{
		DpeartmentCode=deptc;
		HOD=headoddept;
		NoOfLabs=labcount;
		NoOfStudents=studentc;
		System.out.println("CS Department code:"+DpeartmentCode);
		System.out.println("HOD of CS Department:"+HOD);
		System.out.println("No of Labs in CS Department:"+NoOfLabs);
		System.out.println("No of Students in CS Department:"+NoOfStudents);

	}
}

public class DemoThree {

	public static void main(String[] args) {
		Student std=new Student("Divya", 013, "EEE", 'A');
		Library lib=new Library("Franklin", "Academic Library", 100, "1RI013A");
		Sports spt=new Sports("Cricket", 10, "ICC World Cup 2023", 50);
		CSDepartment csdpt=new CSDepartment(6, "Fraklin", 100, 5);

	}

}
