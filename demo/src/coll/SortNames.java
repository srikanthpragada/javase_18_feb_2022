package coll;

import java.util.ArrayList;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		 var s = new Scanner(System.in);
		 var names = new ArrayList<String>();
		 
		 while(true) {
			 System.out.print("Enter name [end to stop] :");
			 var name = s.nextLine();
			 if (name.equals("end"))
				 break;
			 
			 names.add(name);
		 }
		 
		 names.sort(null);
		 
		 for(var n : names) {
			 System.out.println(n);
		 }
		 
		 
		 
		 

	}

}
