package com.sgtesting.inheritance;
/*
 * WAP to describe multilevel inheritance
 */
class SchoolTrip
{
	void countOfStudents(int count)
	{
		System.out.println("No Of Students In for the Trip:"+count);
	}
}
class TripPlaces extends SchoolTrip
{
	void placesVisited(String s1,String s2)
	{
		System.out.println("Places Visted:"+(s1+"& "+s2));

	}
}
class TripExpenditure extends TripPlaces
{
	void totalTripExpenditure(int exp)
	{
		System.out.println("Trip Expenditure:"+exp);
	}
}
public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		TripExpenditure obj=new TripExpenditure();
		obj.countOfStudents(10);
		obj.placesVisited("Mysore", "Hampi");
		obj.totalTripExpenditure(100000);

	}

}
