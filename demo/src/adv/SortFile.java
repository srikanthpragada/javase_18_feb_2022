package adv;

import java.nio.file.Files;
import java.nio.file.Path;

public class SortFile {

	public static void main(String[] args) throws Exception {
	 
		 var lines =  Files.lines(Path.of("c:\\classroom\\feb18\\names.txt"));
		 
		 lines
		    .distinct()
		    .sorted()
		    .limit(5)
		    .forEach( line -> System.out.println(line.toUpperCase()));
		  

	}

}
