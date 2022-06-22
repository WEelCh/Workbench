import java . util . Scanner ;
public class Fehlersuche {
    static final int loesung = 42;
    public static void main ( String [] args ) {
        Scanner in = new Scanner ( System . in ) ;
        System . out . print ( " Die ␣ halbe ␣ Wahrheit ␣ ist : ␣ " ) ;
        int hW = in . nextInt () ;
        int antwort ;

        antwort = 2* hW ;
        if ( antwort == 42) System . out . println ( " Korrekt ! " ) ;
        else System . out . println ( " Falsch " ) ;
    }
}