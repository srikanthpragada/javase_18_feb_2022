package library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class SortDates {

	public static void main(String[] args) {
		String inputs[] = { "10-10-2021", "11-11-2020", "01-01-2022", "10-05-2020", "19-12-2021" };
		LocalDate dates[] = new LocalDate[5];

		var df = DateTimeFormatter.ofPattern("dd-MM-uuuu");

		for (int i = 0; i < inputs.length; i++) {
			dates[i] = LocalDate.parse(inputs[i], df);
		}

		Arrays.sort(dates);

		for (var d : dates)
			System.out.println(df.format(d));
	}
}
