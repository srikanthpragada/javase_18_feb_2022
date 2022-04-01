package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FindJavaFiles {

	public static boolean searchFile(Path p, String searchString) {
		if (!p.toString().endsWith(".java"))
			return false;

		try {
			var contents = Files.readString(p);
			return contents.contains(searchString);
		} catch (IOException e) {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		
		if (args.length < 2) {
			System.out.println("Usage : java FindJavaFiles <startdirectory> <searchstring>");
			return;
		}

		Path p = Path.of(args[0]);      // Starting directory
		String searchString = args[1];  // Search string 

		Files.walk(p)
		     .filter(path -> searchFile(path, searchString))
		     .forEach(System.out::println);

	}
}
