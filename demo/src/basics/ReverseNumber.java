package basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 
		// Read from keyboard
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = s.nextInt(); // read an int

		 
		while(num > 0)
		{
			System.out.print(num % 10);
			num = num / 10;
		}

	}

}
