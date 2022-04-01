package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchJavaFiles {

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

		Path p = Path.of("c:\\classroom\\feb18\\demo");
		String searchString = "System.out.printf";

		Files.walk(p).filter(path -> searchFile(path, searchString)).forEach(System.out::println);

	}
}
