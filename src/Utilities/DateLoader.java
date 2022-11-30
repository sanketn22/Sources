package Utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.IOException;


public class DateLoader {
	static List<Date> stdFormat = new ArrayList();
	static File f;
	
	public static List<Date> dates (String pathname){
		f = new File(pathname);
		DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");		
		Scanner sc;
		
		try {
			sc = new Scanner(f);
			
				while (sc.hasNextLine()) {
					Date i = (Date) formatter.parse(sc.nextLine());
			
					stdFormat.add(i);
				}
		}catch(FileNotFoundException f1 ){
			System.out.println(f1.getMessage());
		}catch(Exception e) {
			
		}
		return stdFormat;		
	};			

}
