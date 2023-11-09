package com.sgtesting.secondPartJava;
/*
 * Create a class for country,state,district,taluk and execute each members of the class 
 */
class Country
{
	String countryName;
	String NationalAnthem;
	String NationalAnimal;
	String NationalFlag;

}
class State
{
	String stateName;
	String statecapital;
	String stateLaguage;
	int noOfDistrict;

}
class District
{
	String districtName;
	String heritagePlace;
	String oldNameOfDistrict;
	int noOFTaluk;

}
class Taluk
{
	String talukName;
	int noOfVillages;
	String NearestRailywaystation;
	String nearestAirtport;
}
public class DemoFour {

	public static void main(String[] args) {
		Country cou=new Country();
		cou.countryName="India";
		cou.NationalAnimal="tiger";
		cou.NationalAnthem="Jana Gana Mana";
		cou.NationalFlag="Tiraṅgā";
		State st=new State();
		st.stateName="Karnataka";
		st.statecapital="Bangalore";
		st.stateLaguage="kannada";
		st.noOfDistrict=31;
		District dst=new District();
		dst.districtName="Udupi";
		dst.heritagePlace="Coin Museum";
		dst.noOFTaluk=7;
		dst.oldNameOfDistrict="Odipu";
		Taluk taluk =new Taluk();
		taluk.talukName="Kundapura";
		taluk.noOfVillages=98;
		taluk.nearestAirtport="MANGALURU";
		taluk.NearestRailywaystation="Kundapura Railway Station";
		System.out.println("Country Name:"+cou.countryName);
		System.out.println("National Anthem:"+cou.NationalAnthem);
		System.out.println("National Animal:"+cou.NationalAnimal);
		System.out.println("National Flag:"+cou.NationalFlag);
		System.out.println("+++++++++++");
		System.out.println("State Name:"+st.stateName);
		System.out.println("State capital:"+st.statecapital);
		System.out.println("State Language:"+st.stateLaguage);
		System.out.println("No of District in the State:"+st.noOfDistrict);
		System.out.println("+++++++++++");
		System.out.println("District name:"+dst.districtName);
		System.out.println("heritage place of "+dst.districtName+" is "+dst.heritagePlace);
		System.out.println("No of taluks in "+dst.districtName+" is "+dst.noOFTaluk);
		System.out.println("old name of "+dst.districtName+" is "+dst.oldNameOfDistrict);
		System.out.println("+++++++++++");
		System.out.println("taluk Name:"+taluk.talukName);
		System.out.println("No of village in "+taluk.talukName+" is "+taluk.noOfVillages);
		System.out.println("Nearsest airport to taluk "+taluk.talukName+" is "+taluk.nearestAirtport);
		System.out.println("Nearest railway station "+taluk.talukName+" is "+taluk.NearestRailywaystation);
	}

}
