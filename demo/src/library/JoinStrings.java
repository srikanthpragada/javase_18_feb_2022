package library;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringJoiner sj = new StringJoiner("-");

		while (true) {
			System.out.print("Enter name [end to stop] :");
			String name = s.nextLine();
			if (name.equals("end"))
				break;

			sj.add(name);
		}

		System.out.println(sj);

	}

}
