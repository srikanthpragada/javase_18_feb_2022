package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames2 {

	public static void main(String[] args) throws IOException {

		String names[] = { "Anders", "Neil", "Bill", "Scott", "Stevens" };

		try (FileWriter fw = new FileWriter("d:\\classroom\\feb18\\names.txt")) {
			for (var n : names) {
				fw.write(n + "\n");
			}
		}
	}
}
