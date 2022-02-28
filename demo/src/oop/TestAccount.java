package oop;

class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;
	private static int minbal = 10000;
	
	public static int getMinbal() {
		return Account.minbal;
	}

	public Account(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor
		this.balance = balance;
	}

	public Account(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	// Method
	public void print() {
		System.out.println(this.acno);
		System.out.println(this.ahname);
		System.out.println(this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}
}

public class TestAccount {

	public static void main(String[] args) {
		Account a1; // object reference

		a1 = new Account(1, "Joe"); // object
		a1.deposit(10000);
		a1.deposit(5000);
		a1.print();
		System.out.println(a1.getBalance());

		Account a2 = new Account(2, "Scott", 10000);
		a2.print();

	}

}
