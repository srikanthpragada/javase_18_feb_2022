package oop;

class Account {
	// Instance variables 
	private int acno;
	private String ahname;
	private double balance;
	
    // Constructor 
	public Account(int no, String name) {
		acno = no;
		ahname = name;
	}
	
	// Method 
	public void print() { 
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}

public class TestAccount {

	public static void main(String[] args) {
		 Account a1; // object reference 
		 
		 a1 = new Account(1, "Joe");  // object 
		 a1.deposit(10000);
		 a1.deposit(5000);
		 a1.print(); 
		 System.out.println(a1.getBalance());
	
		 
		 Account a2 = new Account(2, "Scott");
		 a2.print();
		 
		 
		 
	}

}
