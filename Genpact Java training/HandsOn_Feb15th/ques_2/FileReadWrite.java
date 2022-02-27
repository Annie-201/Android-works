package Genpact_Day_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReadWrite {
//
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			 FileReader	fr = new FileReader("C:\\Users\\850058650\\Documents\\reader.txt");
		      FileWriter fw = new FileWriter("C:\\Users\\850058650\\Documents\\reader.txt",false);
		      fw.write("This is the overwritten content");
		      fw.close();
		      int i;
		      while((i=fr.read())!= -1) 
		    	  System.out.print((char)i);
		          fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

	}