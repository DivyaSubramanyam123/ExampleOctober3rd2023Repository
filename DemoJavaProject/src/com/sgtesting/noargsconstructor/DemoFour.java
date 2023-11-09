package com.sgtesting.noargsconstructor;
/*
 * Create a class for country,state,district,taluk and execute each members of the class 
 */
class Country
{
	String countryName;
	String NationalAnthem;
	String NationalAnimal;
	String NationalFlag ;
	Country()
	{
		countryName="India";
		NationalAnimal="tiger";
		NationalAnthem="Jana Gana Mana";
		NationalFlag="Tiraṅgā";
		System.out.println("Country Name:"+countryName);
		System.out.println("National Anthem:"+NationalAnthem);
		System.out.println("National Animal:"+NationalAnimal);
		System.out.println("National Flag:"+NationalFlag);
		System.out.println("+++++++++++");
	}
}
class State
{
	String stateName;
	String statecapital;
	String stateLaguage;
	int noOfDistrict;
	State()
	{
		stateName="Karnataka";
		statecapital="Bangalore";
		stateLaguage="kannada";
		noOfDistrict=31;
		System.out.println("State Name:"+stateName);
		System.out.println("State capital:"+statecapital);
		System.out.println("State Language:"+stateLaguage);
		System.out.println("No of District in the State:"+noOfDistrict);
		System.out.println("+++++++++++");
	}
}
class District
{
	String districtName;
	String heritagePlace;
	String oldNameOfDistrict;
	int noOFTaluk;
	District()
	{
		districtName="Udupi";
		heritagePlace="Coin Museum";
		noOFTaluk=7;
		oldNameOfDistrict="Odipu";
		System.out.println("District name:"+districtName);
		System.out.println("heritage place of "+districtName+" is "+heritagePlace);
		System.out.println("No of taluks in "+districtName+" is "+noOFTaluk);
		System.out.println("old name of "+districtName+" is "+oldNameOfDistrict);
		System.out.println("+++++++++++");
	}
}
class Taluk
{
	String talukName;
	int noOfVillages;
	String NearestRailywaystation;
	String nearestAirtport;
	Taluk()
	{
		talukName="Kundapura";
		noOfVillages=98;
		nearestAirtport="MANGALURU";
		NearestRailywaystation="Kundapura Railway Station";
		System.out.println("taluk Name:"+talukName);
		System.out.println("No of village in "+talukName+" is "+noOfVillages);
		System.out.println("Nearsest airport to taluk "+talukName+" is "+nearestAirtport);
		System.out.println("Nearest railway station "+talukName+" is "+NearestRailywaystation);
	}
}
public class DemoFour {

	public static void main(String[] args) {
		Country cou=new Country();	
		State st=new State();
		District dst=new District();
		Taluk taluk =new Taluk();


	}

}
