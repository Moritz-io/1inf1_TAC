
/**
 * Beschreiben Sie hier die Klasse FELDER.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FELDER
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    KUGELN[] spielFeldArray;
 boolean feldBelegt;
    /**
     * Konstruktor für Objekte der Klasse FELDER
     */
    public FELDER()
    {
        // Instanzvariable initialisieren
      spielFeldArray = new KUGELN[1];
      feldBelegt = false;
    }
void istFeldBelegt()
{ if ( feldBelegt == false)
    {
    System.out.println("Nicht Belegt");
    
    }
    else 
    {
    System.out.println("Belegt");
    }


}
    
}
