package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		
		String names [] = {"Anders","Neil","Bill","Scott","Stevens" };
		
		FileWriter fw = new FileWriter
				 ("d:\\classroom\\feb18\\names.txt");
		
		for(var n : names) {
			fw.write(n + "\n");
		}
		
	   fw.close();
	}
}
