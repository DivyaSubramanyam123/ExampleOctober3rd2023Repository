package com.sgtesting.polymorphism;
abstract class Transacations
{
	abstract void calcualteBalance(int amt);
	int  totalbalance=10000;
}
class Withdrawl extends Transacations
{
	void calcualteBalance(int amt) {	
		totalbalance=totalbalance-amt;
		System.out.println("Total balance after withdrawl:"+totalbalance);
	}
}
class Deposit extends Transacations
{
	void calcualteBalance(int amt) {
		totalbalance=totalbalance+amt;
		System.out.println("Total balance after Deposit:"+totalbalance);
	}
}
public class BankTransactions {

	public static void main(String[] args) {
		Transacations transaction=null;
		Withdrawl withdrawl=new Withdrawl();
		transaction=withdrawl;
		transaction.calcualteBalance(5000);
		Deposit deposit=new Deposit();
		transaction=deposit;
		transaction.calcualteBalance(6000);
	}

}
