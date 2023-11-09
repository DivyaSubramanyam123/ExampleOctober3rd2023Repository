package com.sgtesting.inheritance;

/*
 * WAP for  multilevel inheritance in which class contains same variable name;
 */
class BMW 
{
	String name;

	void BMWCompanyOrgin()
	{
		System.out.println("BMW Country Origin  :"+name);
	}
}
class Ford  extends BMW 
{

	String name;
	Ford(String name1,String name)
	{
		super.name=name1;
		this.name=name;
	}

	void fordCompanyCountry()
	{
		System.out.println("Ford Company origin:"+name);

	}
}
class Toyota extends Ford 
{
	String name;
	Toyota(String name1,String name2,String name)
	{
		super(name1, name2);
		this.name=name;
	}

	void toyotaCompanyorigin()
	{
		System.out.println("Toyota Company Origin:"+name);
	}
}
public class MultilevelInheritanceVariableName {

	public static void main(String[] args) {
		Toyota obj=new Toyota("Germany","UnitedStates","japan");
		obj.fordCompanyCountry();
		obj.toyotaCompanyorigin();
		obj.BMWCompanyOrgin();
	}

}
