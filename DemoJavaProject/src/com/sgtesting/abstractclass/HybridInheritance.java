package com.sgtesting.abstractclass;
/*
 * 5)In Hybrid Inheritance the superclass contains abstract methods based on the subclass object execute all the members
 */
abstract class Calculator
{
	abstract int addition(int x,int y);
}
class Addition extends Calculator
{
	int addition(int x, int y) {
		int z=x+y;
		return z;
	}	
	int add(int x,int y)
	{
		int z=x+y+5;
		return z;
	}
}
class Substraction  extends Calculator
{	
	int addition(int x, int y) {
		int 	z=x+y+10;
		return z;
	} 
	int sub(int x,int y)
	{
		int z=x-y;
		return z;
	}
}
class Division extends Substraction
{
	int div(int x,int y)
	{
		int z=x/y;
		return z;
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Addition obj=new Addition();
		System.out.println("Sub class method:"+obj.add(1, 2));
		System.out.println("Super class method:"+obj.addition(1, 2));
		Division obj2=new Division();
		System.out.println("Super class method:"+obj2.addition(1, 2));
		System.out.println("Subclass method:"+obj2.div(10, 2));
		System.out.println("Sub class method:"+obj2.sub(10, 9));
	}

}
