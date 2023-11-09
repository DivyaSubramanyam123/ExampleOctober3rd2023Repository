package com.example.pragrams;

class A
{
	int zz=100;
	void addition (int x,int y)
	{
		int z=x+y;
		System.out.println("Class A:"+z);
	}
}
class B extends A
{
int zz=200;
	void addition (int x,int y)
	{
		int z=x+y;
		z++;
		System.out.println("Class B:"+z);
	}
	
}
public class TestAbc {

	public static void main(String[] args) {
		A obj=new B();
		System.out.println(obj.zz);
		obj.addition(1, 2);
		B obj2=new B();
        System.out.println(obj2.zz);
        obj2.addition(1, 2);
	}

}
