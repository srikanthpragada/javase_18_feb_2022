package library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {
	      var cd = LocalDate.now();
	      System.out.println(cd); // cd.toString()
	      var pd = cd.minusDays(10);
	      System.out.println(pd); 
	      
	      LocalTime now = LocalTime.now();
	      System.out.println(now);
	      LocalTime singtime = LocalTime.now(ZoneId.of("Asia/Singapore"));
	      System.out.println(singtime);
	      
	      var cdt = LocalDateTime.now();
	      System.out.println(cdt);
	}

}
