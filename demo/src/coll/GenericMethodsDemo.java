package coll;

public class GenericMethodsDemo {
	
	public static void printArray(int [] a) {
		for(int n : a) {
			System.out.println(n);
		}
	}
	
	public static void printArray(String [] a) {
		for(String n : a) {
			System.out.println(n);
		}
	}
	
	// Generic Method 
	public static <T> void print(T [] a) {
		for(T n : a) {
			System.out.println(n);
		}
	}
 
	public static void main(String[] args) {
		 String [] names = {"Java","C#", "Python"};
		 Integer [] marks = {10,20,15,25,11};
		 
		 print(names);
		 print(marks);

	}

}
