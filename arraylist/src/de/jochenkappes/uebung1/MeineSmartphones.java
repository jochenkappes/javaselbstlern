package de.jochenkappes.uebung1;

import de.jochenkappes.classesUebung1.*;
//import de.jochenkappes.classesUebung1.Kontakt;
//import de.jochenkappes.classesUebung1.Smartphone;

public class MeineSmartphones {

    public static void main(String[] args) {


            Smartphone iPhone6 = new Smartphone();

            iPhone6.addKontakt(Kontakt.erstelleKontakt("Christian", "238748234"));
            iPhone6.addKontakt(Kontakt.erstelleKontakt("Peter .B", "9823723874"));
            iPhone6.addKontakt(Kontakt.erstelleKontakt("Hans . F", "82374023"));
            iPhone6.addKontakt(Kontakt.erstelleKontakt("Petra", "083274923"));

            Kontakt petra = new Kontakt("Petra", "083274923");
            iPhone6.addKontakt(petra);

            iPhone6.ausgabe();

            System.out.println("Suchen: ");
            iPhone6.findKontakt("Petra");

        }

    }
