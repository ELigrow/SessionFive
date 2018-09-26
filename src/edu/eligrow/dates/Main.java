package edu.eligrow.dates;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Date today;
        String dateOut;
        DateFormat dateFormatter;
        dateFormatter =
                DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        today = new GregorianCalendar().getTime();
        dateOut = dateFormatter.format(today);
        System.out.println(dateOut);

        Date joshuaTree = new GregorianCalendar(1987,3,9).getTime();
        Date rattleAndHum = new GregorianCalendar(1998, 10, 10).getTime();

        long JTtoNow = today.getTime() - joshuaTree.getTime();
        long JTtoRH = rattleAndHum.getTime() - joshuaTree.getTime();
        GregorianCalendar JTReleaseNow = new GregorianCalendar();
        JTReleaseNow.setTimeInMillis(today.getTime() + JTtoRH);


        System.out.println("U2's album Joshua Tree was released 9/3/1987. That date is " + (JTtoNow/(1000*60*60*24)) +
                " days ago. It is " + (JTtoNow/(1000*60*60*24*30.44)) + " months ago, and " +
                (JTtoNow/(1000*60*60*24 * 365.25)) + " years ago.\nRattle and Hum, U2's next album, was released " +
                (JTtoRH/(1000*60*60*24)) + " days later. If Joshua Tree was released today, Rattle and Hum would be" +
                " released on " + dateFormatter.format(JTReleaseNow.getTime()) + ".");

    }
}
