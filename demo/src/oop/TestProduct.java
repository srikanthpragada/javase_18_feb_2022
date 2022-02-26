package oop;

class Product {
	private String name;
	private int price;
	
	public Product(String n, int p) {
		name = n;
		price = p;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
	
	public int getNetPrice() {
		return  price + (price * 12 / 100);
	}
}
public class TestProduct {

	public static void main(String[] args) {
		 Product p = new Product("Dell XPS",200000);
		 System.out.println(p.getNetPrice());
	}

}
