package com.sgtesting.polymorphism;
abstract class CarSpeed
{
	abstract void speed();
}
class Maruti extends CarSpeed
{
	void speed() {
		String s="60km/h";
		System.out.println("Speed of maruti car:"+s);
	}

}
class Alto extends CarSpeed
{ 
	void speed() {
		String s1="70km/h";
		System.out.println("Speed of maruti car:"+s1);
	}
}
public class Car {

	public static void main(String[] args) {
		CarSpeed carspeed=null;
		Maruti maruti=new Maruti();
		Alto alto=new Alto();
		carspeed=maruti;
		carspeed.speed();
		carspeed=alto;
		carspeed.speed();
	}

}
