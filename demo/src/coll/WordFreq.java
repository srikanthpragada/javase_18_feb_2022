package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class WordFreq {

	public static void main(String[] args) throws Exception {
		 
		var contents = Files.readString(Path.of("c:\\classroom\\feb18\\test.txt"));
		
		Pattern p = Pattern.compile("\\W+"); // take non-word chars
		var words = p.split(contents);       // take all words
		
		var wordFreq = new TreeMap<String, Integer>();
		
		for (var word : words) {
			var count = wordFreq.getOrDefault(word,0);
			wordFreq.put(word, count + 1);
		}
		
		for(var word : wordFreq.keySet())
		{
			System.out.printf("%-20s  %3d\n",  word, wordFreq.get(word));
		}
		 
		

	}

}
