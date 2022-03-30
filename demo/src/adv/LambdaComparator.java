package adv;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class LambdaComparator {
	public static int compareByLength(String s1, String s2) {
		return s1.length() - s2.length();
	}

	public static void main(String[] args) {
		String names[] = { "Joe", "Andy", "Steves", "Jack", "Micheal", "Nichleson" };

		// Comparator implemented by LengthCompare
		Arrays.sort(names, new LengthCompare());

		// Comparator implemented by anonymous inner class
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		// Using lambda expression 
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());

		// Using method reference 
		Arrays.sort(names, LambdaComparator::compareByLength);

		for (var n : names) {
			System.out.println(n);
		}

	}

}
