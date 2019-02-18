package course.capitulos.basicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatesClass {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf1.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);

		// PEGAR PARTE DO TEMPO
		int minutes = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);

		System.out.println("Month: " + (1 + month));

		System.out.println(sdf1.format(d));
	}

	void date() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5);
		Date y1 = sdf.parse("25/06/2019");
		Date y2 = sdf1.parse("25/06/2019 20:00:00");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("---------------------------");
		System.out.println("x1: " + sdf1.format(x1));
		System.out.println("x2: " + sdf1.format(x2));
		System.out.println("x3: " + sdf1.format(x3));
		System.out.println("x4: " + sdf1.format(x4));
		System.out.println("y1: " + sdf.format(y1));
		System.out.println("y2: " + sdf1.format(y2));
		System.out.println("y3: " + sdf1.format(y3));
		System.out.println("---------------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
	}
}
