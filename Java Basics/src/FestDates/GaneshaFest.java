package FestDates;

import java.text.ParseException;

public class GaneshaFest {
	public static void main(String[] args) {
		String[] ganesha_dates = {"10-09","31-08","19-09","07-09","27-08","15-09"
				,"04-09","23-08","12-09","01-09","20-09"};
		try {
			printDates.displayDate(ganesha_dates);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
