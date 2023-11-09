package com.sgtesting.MethodsAssignment;
/*
 * 1)Write a method to display cube of the first 10 numbers in reverse order
 */
class CubeOfFirstTen
{
	void findCube()
	{
		int cube=1;
		for(int i=10;i>=1;i--)
		{
			cube=i*i*i;
			System.out.println(cube);
		}
	}
}
public class DisplayCubeReverse {

	public static void main(String[] args) {
		CubeOfFirstTen obj=new CubeOfFirstTen();
		obj.findCube();
	}

}
