package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal =  Calendar.getInstance();
        cal.set(2016,5,19,23,59,30);
        Date date1 = cal.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String chaine1 = formateur.format(date1);

        Date currentDay = new Date();
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd à HH:mm:ss");
        String currentString =  formateur2.format(currentDay);

        SimpleDateFormat formateurFr = new SimpleDateFormat("EEEEE dd MMMMM yyyy",Locale.FRANCE);
        SimpleDateFormat formateurRu = new SimpleDateFormat("EEEEE dd MMMMM yyyy",new Locale("ru", "RU"));
        SimpleDateFormat formateurCh = new SimpleDateFormat("EEEEE dd MMMMM yyyy",Locale.CHINESE);
        SimpleDateFormat formateurGe = new SimpleDateFormat("EEEEE dd MMMMM yyyy",Locale.GERMAN);

//        System.out.println(chaine1);
//        System.out.println(currentString);
        System.out.println(formateurFr.format(date1));
        System.out.println(formateurRu.format(date1));
        System.out.println(formateurCh.format(date1));
        System.out.println(formateurGe.format(date1));

        System.out.println(formateurFr.format(currentDay));
        System.out.println(formateurRu.format(currentDay));
        System.out.println(formateurCh.format(currentDay));
        System.out.println(formateurGe.format(currentDay));
    }
}
