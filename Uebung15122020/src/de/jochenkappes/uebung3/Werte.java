package de.jochenkappes.uebung3;

class Werte {
    int i;
    int j;
    int k;

    public void wertezuweisen() {
        try {
            this.i = 5;
            this.j = Integer.parseInt("");
            this.k = 8;
        } catch(Exception ex){
            System.out.println("Fehler bei der Wertezuweisung");
            System.out.println("Name der Fehlerklasse:  "+ex.getClass().getName());
            System.out.println("Message:                "+ ex.getMessage());
        }


    }


}
