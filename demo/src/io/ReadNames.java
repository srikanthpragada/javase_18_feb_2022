package io;

import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("d:\\classroom\\feb18\\names.txt");
		
		while(true) {
			int ch = fr.read();
			if (ch == -1)
				break;
			System.out.print((char) ch);
		}

		fr.close();
	}
}
