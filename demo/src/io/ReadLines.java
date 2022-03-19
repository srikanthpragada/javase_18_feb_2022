package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("d:\\classroom\\feb18\\names.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
		    String line = br.readLine();
		    if(line == null)
		    	break;
		    
		    System.out.println(line);
		}

		br.close();
		fr.close();
	}
}
