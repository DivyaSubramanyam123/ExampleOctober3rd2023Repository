package com.sgtesting.polymorphism;
abstract class TrafficSignal
{
	abstract void signalColor();

}
class Green extends TrafficSignal
{

	void signalColor() {
		String color="Green";
		System.out.println("Vehicle Should Start Moving:"+color);
	}
}
class Red extends Green
{
	void signalColor() {
		String color="Red";
		System.out.println("Vehicle should Stop:"+color);
	}
}
class Yellow extends Red
{
	void signalColor() {
		String color="Yellow";
		System.out.println("Vehicle should be ready to start and stop:"+color);
	}
}
public class TrafficLight {

	public static void main(String[] args) {
		TrafficSignal signal=null;
		Red red=new Red();
		signal=red;
		signal.signalColor();
		Green green=new Green();
		signal=green;
		signal.signalColor();
		Yellow yellow =new Yellow();
		signal=yellow;
		signal.signalColor();
	}

}
