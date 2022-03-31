package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class RemoveBlankLines {

	public static void main(String[] args) throws Exception {
		var source = "c:\\classroom\\feb18\\langs.txt";

		var tempfile = Files.newBufferedWriter(Path.of("temp.txt"));
		try (tempfile) {
			Files.lines(Path.of(source))
			    .filter(line -> line.trim().length() > 0)
			    .forEach(line -> {
				  	try {
					    tempfile.write(line + "\n");
				    } catch (IOException e) {

				    }
			});
		}

		Files.move(Path.of("temp.txt"), Path.of(source), StandardCopyOption.REPLACE_EXISTING );
 
	}

}
