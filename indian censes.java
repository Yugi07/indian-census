package com.csv
import java.io.Reader;
import com.opencsv.CSVReader;
public class ReadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CSVReader reader = null;
     try {
    	 read=newCSVReader(newFileReader("F:\\gh.csv"));
    	 string[] nextLine;
    	 while((nextLine = Reader.readerNext()!=null)
    			 {
    		 for(string token:nextLine)
    		 {
    			 System.out.println(token);
    		 }
    		 System.out.println("\n");
    			 }
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	}

}
