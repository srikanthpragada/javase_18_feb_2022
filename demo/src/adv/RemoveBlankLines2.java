package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class RemoveBlankLines2 {

	public static void main(String[] args) throws Exception {
		var sourcePath =  Path.of("c:\\classroom\\feb18\\langs.txt");
		var nbLines = new ArrayList<String>();

		Files.lines(sourcePath)
		     .filter(line -> line.trim().length() > 0)
		     .forEach(line -> nbLines.add(line));
		
		// Write non-blank lines back to source file
		var writer = Files.newBufferedWriter(sourcePath);
		
		nbLines.stream().forEach( line -> {
			try {
				writer.write(line + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		writer.close(); 
		
	}

}
