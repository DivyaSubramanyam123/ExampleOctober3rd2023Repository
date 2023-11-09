package com.sgtesting.secondPartJava;
/*
 * Create a class for fruits,flowers,vegetables and WAP to execute each members of the class
 */
class Fruits
{
	String Name;
	String scientificName;
	String familyName;
	int calories;
}
class Flowers
{
	String name;
	String color;
	String scientificName;
	String care;
}
class Vegetables
{
	String name;
	String color;
	String FamilyName;
	char vitaminRich;
}
public class DemoFive {

	public static void main(String[] args) {
		Fruits frt=new Fruits();
		frt.Name="Muskmelon";
		frt.familyName="Cucurbitaceae.";
		frt.scientificName="Cucumis melo";
		frt.calories=34;
		Flowers flr=new Flowers();
		flr.name="Rose";
		flr.color="Red";
		flr.scientificName="Rosa";
		flr.care="6 hrs to sun";
		Vegetables vg=new Vegetables();
		vg.name="Potato";
		vg.FamilyName="Solanaceace";
		vg.color="Yellow";
		vg.vitaminRich='C';
		System.out.println("Fruit Name:"+frt.Name);
		System.out.println("Fruit Family Name:"+frt.familyName);
		System.out.println("Fruit Scientific Name:"+frt.scientificName);
		System.out.println("Fruit calories for 100g:"+frt.calories);
		System.out.println("+++++++++++");
		System.out.println("Flower name:"+flr.name);
		System.out.println("Flower Scientific Name:"+flr.scientificName);
		System.out.println("Flower color:"+flr.color);
		System.out.println("Flower care for a day:"+flr.care);
		System.out.println("+++++++++++");
		System.out.println("Vegetable name:"+vg.name);
		System.out.println("Vegetable Family Name:"+vg.FamilyName);
		System.out.println("Vegetable color:"+vg.color);
		System.out.println("Vegetable rich in Vitamin:"+vg.vitaminRich);
	}

}
