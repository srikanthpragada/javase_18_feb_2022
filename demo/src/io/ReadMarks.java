package io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class ReadMarks {

	public static void main(String[] args) throws Exception {

       var raf = new RandomAccessFile("d:\\classroom\\feb18\\marks.dat","r");
       
       int rollno = 1;
       
       int pos = (rollno - 1) * 4;
       raf.seek(pos);
       System.out.println( raf.readInt());
       
       raf.close();
	}

}
