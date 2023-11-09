package com.sgtesting.polymorphism;
abstract class  LeafColor
{
	abstract void displayLeafColor();

}
class SummerSeason extends LeafColor
{
	void displayLeafColor()
	{
		String color="green";
		System.out.println("Leaf color in summer season:"+color);
	}
}
class AutumSeason extends LeafColor
{
	void displayLeafColor()
	{
		String color="Red";
		System.out.println("Leaf color in Autumseason:"+color);
	}
}

public class Pigment {

	public static void main(String[] args) {
		LeafColor leafcolor=null;
		SummerSeason summer=new SummerSeason();
		AutumSeason autum=new AutumSeason();
		leafcolor=summer;
		leafcolor.displayLeafColor();
		leafcolor=autum;
		leafcolor.displayLeafColor();		

	}

}
