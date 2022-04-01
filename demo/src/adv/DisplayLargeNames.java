package adv;

import java.nio.file.Files;
import java.nio.file.Path;

public class DisplayLargeNames {

	public static void main(String[] args) throws Exception {
	 
		 var path = Path.of("c:\\classroom\\feb18\\names.txt");
		 var lines =  Files.readAllLines(path);
		 
		 var avgLength = lines.stream()
				 .mapToInt( line -> line.length())
		         .average()
		         .getAsDouble();
		 
		 //System.out.println(avgLength);
		 
		 lines.stream()
		      .filter(line -> line.length() >= avgLength)
		      .forEach(System.out::println);
		 
	}

}
