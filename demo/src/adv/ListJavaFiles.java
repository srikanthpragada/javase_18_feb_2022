package adv;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {
	private static int count = 0;
	public static void printFile(Path p) {
		count ++;
		System.out.println(p);
	}

	public static void main(String[] args) throws Exception {
		 
		Path p = Path.of("c:\\classroom\\feb18\\demo");
		
	    Files.walk(p)
		     .filter( path -> path.toString().endsWith(".java"))
		     .forEach(ListJavaFiles::printFile);
		    
	 
	    System.out.printf("\nCount = %d\n", count);
	}
}
