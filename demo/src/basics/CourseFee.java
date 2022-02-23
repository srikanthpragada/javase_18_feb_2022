package basics;

public class CourseFee {

	public static void main(String[] args) {
		int month = 3, year = 2022;
		
		// Switch expression 
		int days = switch (month) {
		case 2 ->  year % 4 == 0 ? 29 : 28;
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};

	}

}
