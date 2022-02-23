package basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		double f = 10.40;
		
		int course;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter course code :");
		course = s.nextInt();
		
		// Switch expression 
		int fee = switch (course) {
			case 1,2,5 -> 10000;
			case 3 -> 15000;
			case 4 -> 5000;
			default -> 0;
		};
		
		if(fee == 0)
			System.out.println("Invalid course code!");
		else
			System.out.printf("Course Fee = %d",fee);
	}

}
