package com.sgtesting.ParameterizedConstructor;
/*
 * Create a class for fruits,flowers,vegetables and WAP to execute each members of the class
 */
class Fruits
{
	String Name;
	String scientificName;
	String familyName;
	int calories;
	Fruits(String fname,String fscientificn,String familyn,int calorie)
	{
		Name=fname;
		familyName=familyn;
		scientificName=fscientificn;
		calories=calorie;
		System.out.println("Fruit Name:"+Name);
		System.out.println("Fruit Family Name:"+familyName);
		System.out.println("Fruit Scientific Name:"+scientificName);
		System.out.println("Fruit calories for 100g:"+calories);
		System.out.println("+++++++++++");
	}
}
class Flowers
{
	String name;
	String color;
	String scientificName;
	String care;
	Flowers(String flwname,String flwcolor,String flwscientificn,String flwcare)
	{
		name=flwname;
		color=flwcolor;
		scientificName=flwscientificn;
		care=flwcare;
		System.out.println("Flower name:"+name);
		System.out.println("Flower Scientific Name:"+scientificName);
		System.out.println("Flower color:"+color);
		System.out.println("Flower care for a day:"+care);
		System.out.println("+++++++++++");
	}
}
class Vegetables
{
	String name;
	String color;
	String FamilyName;
	char vitaminRich;
	Vegetables(String vgname,String vgcolor,String vgfamilyn,char vegvitaminrich)
	{
		name=vgname;
		FamilyName=vgfamilyn;
		color=vgcolor;
		vitaminRich=vegvitaminrich;
		System.out.println("Vegetable name:"+name);
		System.out.println("Vegetable Family Name:"+FamilyName);
		System.out.println("Vegetable color:"+color);
		System.out.println("Vegetable rich in Vitamin:"+vitaminRich);
	}
}
public class DemoFive {

	public static void main(String[] args) {
		Fruits frt=new Fruits("Muskmelon", "Cucumis melo","Cucurbitaceae.", 34);	
		Flowers flr=new Flowers("Rose", "Red", "Rosa", "6 hrs to sun");
		Vegetables vg=new Vegetables("Potato", "Yellow","Solanaceace", 'C');

	}

}
