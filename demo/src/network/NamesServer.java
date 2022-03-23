package network;

import java.io.FileWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NamesServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(3000);
		FileWriter fw = new FileWriter("d:\\classroom\\feb18\\langs.txt",true);
		
		System.out.println("Name Server is ready!!!!!!");

		while (true) {
			Socket client = ss.accept();
			System.out.println("Client Connected!");
			Scanner s = new Scanner(client.getInputStream());
			while (true) {
				String line = s.nextLine(); // read from client socket 
				if (line.equals("end")) {
					break;
				}
				fw.write(line + "\n");
			}
			fw.flush();
			System.out.println("Client Disconnected!");
		}
	}
}
