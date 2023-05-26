package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String chaine1 = formateur.format((date));

        Calendar cal = Calendar.getInstance();
        cal.set(2016,5,19,23,59,30);
        Date date2 = cal.getTime();
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String chaine2 = formateur2.format((date2));
        System.out.println(date2);
        System.out.println(chaine2);
    }
}
