package adv;

import java.util.Arrays;

public class StreamsArrays {

	public static void main(String[] args) {
		int[] nums = { 75, 99, 10, 30, 50, 33, 44, 20, 89, 76 };

		Arrays.stream(nums)
		        .filter(v -> v % 2 != 0) // intermediate operation
				.sorted() // intermediate operation
				.forEach(System.out::println); // Terminal operation

		
		// print numbers that are > average
		System.out.println("Numbers greater than average");
		var avg  =  Arrays.stream(nums).average();    // returns OptionalDouble
	    int average = (int) avg.getAsDouble();
		Arrays.stream(nums).filter(v -> v > average).forEach(System.out::println);
	}

}
