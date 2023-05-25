package fr.diginamic.essais;

import entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1= new Cercle(5);
        Cercle cercle2= new Cercle(3);
        System.out.println(cercle1.Circumference());
        System.out.println(cercle2.Circumference());
        System.out.println(cercle1.area());
        System.out.println(cercle2.area());
    }
}
