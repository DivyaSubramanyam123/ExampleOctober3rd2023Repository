package com.sgtesting.constructoroverloading;

class Examination
{

	Examination(int fees)
	{
		System.out.println("Exam Fees:"+fees);
	}
	Examination(String examBoard,int noOfSubject)
	{
		System.out.println("ExamBorad:"+examBoard);
		System.out.println("No of Subjects:"+noOfSubject);
	}
	Examination(String RegistrationNo)
	{
		System.out.println("RegistrationNo:"+RegistrationNo);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Examination obj1=new Examination(5000);
		Examination obj2=new Examination("1RI013EEE");
		Examination obj3=new Examination("CBSE",6);
	}

}
