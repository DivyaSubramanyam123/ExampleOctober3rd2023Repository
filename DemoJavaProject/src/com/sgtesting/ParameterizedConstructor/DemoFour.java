package com.sgtesting.ParameterizedConstructor;

/*
 * Create a class for country,state,district,taluk and execute each members of the class 
 */
class Country
{
	String countryName;
	String NationalAnthem;
	String NationalAnimal;
	String NationalFlag ;
	Country(String countryn,String nationalA,String nationalaml,String nationalFlg)
	{
		countryName=countryn;
		NationalAnimal=nationalaml;
		NationalAnthem=nationalA;
		NationalFlag=nationalFlg;
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
	State(String staten,String statecpt,String statelng,int districtcount)
	{
		stateName=staten;
		statecapital=statecpt;
		stateLaguage=statelng;
		noOfDistrict=districtcount;
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
	District(String districtn,String heritageplc,String oldn,int talukcount)
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
	Taluk(String talukn,String nearestrailway,String nearstairport,int villagecount)
	{
		talukName=talukn;
		noOfVillages=villagecount;
		nearestAirtport=nearstairport;
		NearestRailywaystation=nearestrailway;
		System.out.println("taluk Name:"+talukName);
		System.out.println("No of village in "+talukName+" is "+noOfVillages);
		System.out.println("Nearsest airport to taluk "+talukName+" is "+nearestAirtport);
		System.out.println("Nearest railway station "+talukName+" is "+NearestRailywaystation);
	}
}
public class DemoFour {

	public static void main(String[] args) {
		Country cou=new Country("India", "Jana Gana Mana", "Tiger", "Tiraṅgā");	
		State st=new State("Karnataka","Bangalore","Kannada",31);
		District dst=new District("Udupi", "Coin Museum", "Odipu",7);
		Taluk taluk =new Taluk("Kundapura","Kundapura Railway Station", "MANGALURU", 98);


	}

}
