package basics;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// Read from keyboard
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = s.nextInt(); // read an int

		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
