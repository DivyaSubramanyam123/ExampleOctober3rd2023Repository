package com.sgtesting.constructoroverloading;
class College
{
	/*String collegeName;
	int collegeCode;
	String university;
	int noOfCourse;
	 */
	College(String collegeName)
	{
		System.out.println("College Name:"+collegeName);
	}
	College(int collegeCode)
	{
		System.out.println("College code:"+collegeCode);
	}
	College(String university,int noOfCourse,String collegeName )
	{ 
		System.out.println("University the college "+collegeName+" belongs to"+university);
		System.out.println("No of courses available "+collegeName+" is"+noOfCourse);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		College obj1=new College(49);
		College obj2=new College("RRIT");
		College obj3=new College("VTU", 45,"RRIT");
	}

}
