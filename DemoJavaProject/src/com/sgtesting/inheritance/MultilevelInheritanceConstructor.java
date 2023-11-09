package com.sgtesting.inheritance;
/*
 * WAP for  multilevel inheritance in which Super class contains parameterized constructor
 */
class CollegeTrip
{
	CollegeTrip(String organiser)
	{
		System.out.println("Trip Organizer:"+organiser);
	}
	void countOfStudents(int count)
	{
		System.out.println("No Of Students In for the Trip:"+count);
	}
}
class CollegeTripPlaces extends CollegeTrip
{

	CollegeTripPlaces(String s)
	{
		super(s);
	}
	void placesVisited(String s1,String s2)
	{
		System.out.println("Places Visted:"+(s1+"& "+s2));

	}
}
class CollegeTripExpenditure extends CollegeTripPlaces
{
	CollegeTripExpenditure(String s) {
		super(s);

	}

	void totalTripExpenditure(int exp)
	{
		System.out.println("Trip Expenditure:"+exp);
	}
}
public class MultilevelInheritanceConstructor {

	public static void main(String[] args) {
		CollegeTripExpenditure obj= new CollegeTripExpenditure("Armaan Holidays");
		obj.countOfStudents(100);
		obj.placesVisited("Mysore", "Hampi");
		obj.totalTripExpenditure(100000);

	}

}
