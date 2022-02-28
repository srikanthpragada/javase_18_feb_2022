package oop;

class Product {
	// Instance variables
	private String name;
	private int price;
	
	// Class variable
	private static int taxRate = 12;
	
	public static void setTaxRate(int newRate) {
		taxRate = newRate;
	}
	
	public Product(String n, int p) {
		name = n;
		price = p;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
	
	public int getNetPrice() {
		return  price + (price * taxRate / 100);
	}
}
public class TestProduct {

	public void main(String[] args) {
		 Product p = new Product("Dell XPS",200000);
		 System.out.println(p.getNetPrice());
	}

}
