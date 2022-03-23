package network;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class NameClient {

	public static void main(String[] args) throws Exception {
		Socket cs = new Socket("localhost", 3000); // connect to server
		// get stream to read data from server
		PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
		Scanner s = new Scanner (System.in);
		while(true) {
			System.out.print("Enter name [end to stop] :");
			String name = s.nextLine();
			pw.println(name);
			if (name.equals("end"))
				break;
		}
		
		s.close();
		cs.close();
	}

}
