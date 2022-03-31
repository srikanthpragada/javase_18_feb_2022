package adv;

import java.nio.file.Files;
import java.nio.file.Path;

public class Top3Marks {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb18\\marks.txt");
		var lines = Files.lines(path);

		
		long count = lines.count();
		
		Files.lines(path)
		     .mapToInt(v -> Integer.parseInt(v))
		     .sorted()
		     .skip(count - 3)
		     .forEach(System.out::println);
	}

}
