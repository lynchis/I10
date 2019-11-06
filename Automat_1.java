public class KASTEN {
    private int links;
    private int oben;
    private int breite;
    private int hoehe;

    public KASTEN(){
        links = 50;
        oben = 100;
        hoehe = 200;
        breite = 50;
    }

    public void zeichne() {
        /** 
         * 
         * ZEICHENFENSTER.gibFenster().loescheAlles(); 
         * 
        */
        ZEICHENFENSTER.gibFenster().zeichneRechteck(links,oben,breite,hoehe);
    }

    public void setzeLinks(int linksNeu) {
        links = linksNeu;
    }

    public void setzeGroesse(int breiteNeu, int hoeheNeu) {
        breite = breiteNeu;
        hoehe = hoeheNeu;
    }


    public void verschiebe(int nachRechts, int nachUnten) {
        links = links + nachRechts;
        oben = oben + nachUnten;
    }

    
}
