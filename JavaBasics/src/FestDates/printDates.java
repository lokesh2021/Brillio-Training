package FestDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class printDates {
	public static void displayDate(String[] date_inp) throws ParseException {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.print("Ganesha Festival dates fot the next 10 years are:");
		for(int i=0;i<date_inp.length;i++)
		{	
			Date date = simpleDateFormat.parse(date_inp[i]+"-"+Integer.toString(i+2021));
			System.out.println(date);
		}
	}

}
