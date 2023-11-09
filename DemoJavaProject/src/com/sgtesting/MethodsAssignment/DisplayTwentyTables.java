package com.sgtesting.MethodsAssignment;
/*
 * 6)Write a method to display all the 20 tables
 */
class ArrrayTables
{
	void tables()
	{
		int mul=1;

		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				mul=i*j;
				System.out.println(i+"*"+j+"="+mul);
			}
		}
	}
}

public class DisplayTwentyTables {

	public static void main(String[] args) {
		ArrrayTables obj=new ArrrayTables();
		obj.tables();
	}

}
