package oop;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength {
	
	static class LengthCompare implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
             return  s1.length() - s2.length();
		}
	}

	public static void main(String[] args) {
		 String [] names = {"Java","Go","Ruby","C","Python","JavaScript"};
		 
//		 Arrays.sort(names, new LengthCompare());
//		 
//		 for(var n : names)
//			 System.out.println(n);
		 
		 //Anonymous inner class 
		 Arrays.sort(names, new Comparator<String>() {
			public int compare(String s1, String s2) {
				 return s1.length() - s2.length();
			}
		 });
		 
		 for(var n : names)
			 System.out.println(n);
		 
//		 // Lambda Expression
//		 Arrays.sort(names,(s1,s2) -> s1.length() - s2.length());
//		 
//		 for(var n : names)
//			 System.out.println(n);

	}

}
