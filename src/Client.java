import Utilities.DateLoader;

import java.io.File;
import java.util.Date;
import java.util.List;

import Utilities.DateFormatNew;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Date> a = DateLoader.dates("./dateFile.txt");
//		System.out.println(a.size());
		
		for(Date d: a) {
			System.out.println(d);
		}
		
		File n1 = new File("Output.txt");
		n1 = DateFormatNew.create(a,n1);
		

	}

}
