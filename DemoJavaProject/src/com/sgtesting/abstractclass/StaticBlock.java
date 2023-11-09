package com.sgtesting.abstractclass;
/*
 * 2)If Abstract class has static block alone,WAP to execute the static block 
 */
abstract class Books  
{
	static 
	{
		System.out.println("Abstract class static block executuion");
	}
}
class Authors extends Books
{
}
public class StaticBlock {

	public static void main(String[] args) {
		Authors obj=new Authors();

	}

}
