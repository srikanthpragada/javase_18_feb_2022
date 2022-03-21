package io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {

       var raf = new RandomAccessFile("d:\\classroom\\feb18\\marks.dat","rw");
       
       for (int i = 1; i <= 10; i ++)
       {
    	   int marks = (int) Math.round(Math.random() * 100);
    	   System.out.println(marks);
    	   raf.writeInt(marks);
       }
       
       raf.close();
	}

}
