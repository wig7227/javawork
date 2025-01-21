package _03_enum;

import java.util.Calendar;

public class T03_enumWeek {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int w = calendar.get(calendar.DAY_OF_WEEK);
		
		Week week = null;
		
		switch(w) {
		case 1:
			week = Week.MONDAY;
			break;
		case 2:
			week = Week.TUESDAY;
			break;
		case 3:
			week = Week.WEDSEDAY;
			break;
		case 4:
			week = Week.THURSDAY;
			break;
		case 5:
			week = Week.FRIDAY;
			break;
		case 6:
			
			week = Week.SATURDAY;
			break;
		case 7:
			week = Week.SUNDAY;
			break;
		}
		
		if(week == Week.SUNDAY) {
			System.out.println("오늘은" + Week.SUNDAY + " 일요일엔 짜파게티 먹는날");
		} else {
			System.out.println("아주 열심히 자바공부하는날");
		}
		
		
		

	}

}
