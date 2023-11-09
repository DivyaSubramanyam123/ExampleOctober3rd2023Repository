package com.sgtesting.noargsconstructor;
/*
 * Create a class for fruits,flowers,vegetables and WAP to execute each members of the class
 */
class Fruits
{
	String Name;
	String scientificName;
	String familyName;
	int calories;
	Fruits()
	{
		Name="Muskmelon";
		familyName="Cucurbitaceae.";
		scientificName="Cucumis melo";
		calories=34;
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
	Flowers()
	{
		name="Rose";
		color="Red";
		scientificName="Rosa";
		care="6 hrs to sun";
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
	Vegetables()
	{
		name="Potato";
		FamilyName="Solanaceace";
		color="Yellow";
		vitaminRich='C';
		System.out.println("Vegetable name:"+name);
		System.out.println("Vegetable Family Name:"+FamilyName);
		System.out.println("Vegetable color:"+color);
		System.out.println("Vegetable rich in Vitamin:"+vitaminRich);
	}
}
public class DemoFive {

	public static void main(String[] args) {
		Fruits frt=new Fruits();	
		Flowers flr=new Flowers();
		Vegetables vg=new Vegetables();

	}

}
