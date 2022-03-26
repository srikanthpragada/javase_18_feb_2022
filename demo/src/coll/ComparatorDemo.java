package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
	    return  s1.length() - s2.length();
	}
}

public class ComparatorDemo {
	public static void main(String[] args) throws Exception {
		var names = Files.readAllLines
				 (Path.of("d:\\classroom\\feb18\\names.txt"));
		
		Collections.sort(names, new LengthCompare());
	
		for(var n : names)
			 System.out.println(n);
		
		
		
	}

}


