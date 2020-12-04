package de.jochenkappes.uebung1;

import de.jochenkappes.classesUebung1.*;


public class MeineSmartphones {

    public static void main(String[] args) {

        Smartphone iphone6 = new Smartphone();

        iphone6.addKontakt(Kontakt.erstelleKontakt("Christian","0651 123456"));
        iphone6.addKontakt(Kontakt.erstelleKontakt("Christian","0651 123456"));
        iphone6.addKontakt(Kontakt.erstelleKontakt("Petra","0651 654321"));

        Kontakt peter = new Kontakt("Peter", "089 123456987");
        iphone6.addKontakt(peter);

        System.out.println("----Suche-------");
        iphone6.findKontakt("Christian");
        iphone6.findKontakt("xx");
        System.out.println("----Suche-------");


        iphone6.ausgabe();





        }

    }
