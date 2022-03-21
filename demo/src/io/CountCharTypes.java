package io;

import java.io.FileReader;
import java.io.IOException;

public class CountCharTypes {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("d:\\classroom\\feb18\\names.txt");
	    int upper = 0, lower = 0, digits = 0;
	    int ch;
		while(true) {
		    ch = fr.read();
		    if(ch == -1)
		    	break;
		    
		   if ( Character.isUpperCase(ch))
			   upper ++;
		   else
			   if (Character.isLowerCase(ch))
				   lower ++;
			   else
				   if (Character.isDigit(ch))
					   digits ++;
		   
		}

		fr.close();
		System.out.printf("Upper = %d, Lower = %d, Digits = %d", upper, lower, digits, args);
		
	}
}
