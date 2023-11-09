package com.sgtesting.inheritance;
/*
 * WAP for multilevel inheritance in which super class contains constructor overloading 
 */
class Amazon
{
	Amazon(int x)
	{
		System.out.println("Percentage of discount in amazon:"+x);
	}
	Amazon(String cuponcode)
	{
		System.out.println("Cuponcode to redeem the offer:"+cuponcode);	
	}
}
class FlipCart extends Amazon
{

	FlipCart(String cuponcode)
	{
		super(cuponcode);
	}
	FlipCart(int x,int y)
	{
		super(x);
		System.out.println("Percentage of Discuount in Flipcart:"+y);
	}
}
class Myntra extends FlipCart
{

	Myntra(String cuponcode) {
		super(cuponcode);
		
	}
	Myntra(int x,int y,int z)
	{
		super(x,y);
		System.out.println("Percentage of Discount in Myntra:"+z);
	}

}
public class MultilevelInheritanceOverLoading {

	public static void main(String[] args) {
		Myntra obj=new Myntra(10 ,30,20);	
		Myntra obj1=new Myntra("ABCDF456");
	}

}