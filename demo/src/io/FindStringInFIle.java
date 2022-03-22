package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FindStringInFIle {

	public static void main(String[] args) throws Exception {
		
		 Path p = Path.of("d:\\classroom\\feb18\\names.txt");
		 System.out.println(p.getClass());
		 
		 String contents =  Files.readString(p);
		 
		 System.out.println( contents.contains("Bill"));
		 
		 

	}

}
