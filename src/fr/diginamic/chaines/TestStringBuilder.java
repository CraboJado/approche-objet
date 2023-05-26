package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder =  new StringBuilder();
        long debut = System.currentTimeMillis();
//        for(int i = 1; i<= 100000 ;i++){
//            builder.append(i);
//        }

        String str ="";
        for (int i = 0; i <=100000 ; i++) {
            str = str+i;
        }
        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

    }
}
