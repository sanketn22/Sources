package Utilities;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateFormatNew {
	static FileWriter writer;
	static SimpleDateFormat formatter; 
	
	public static File create(List<Date> a, File g) {
		try {
			writer = new FileWriter(g);
			formatter = new SimpleDateFormat("mm/dd/yy");
			 for(int i=0; i<a.size(); i++) {
				 Date j =  a.get(i);
				 writer.write(formatter.format(j));				 
			 }
		
		}catch(IOException u) {
			
		}
		catch(Exception c) {
			
		}
		finally {
			
		}
		return g;
	}

}
