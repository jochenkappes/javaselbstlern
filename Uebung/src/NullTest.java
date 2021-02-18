package de.jochenkappes.uebung3;

public class NullTest {

    public static void main(String[] args) {
        Werte w = new Werte();
        System.out.println("Nur initialisiert");
        System.out.println(w.i + " " + w.j + " " + w.k);

        System.out.println("Werte zugewiesen");
        w.wertezuweisen();
        System.out.println(w.i + " " + w.j + " " + w.k);
    }

}

