
/**
 * Beschreiben Sie hier die Klasse HAUS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HAUS
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int Wert;
    public FELDER[] Felder;

    /**
     * Konstruktor für Objekte der Klasse HAUS
     */
    public HAUS(int x)
    {
        // Instanzvariable initialisieren
        Wert = x;
        Felder = new FELDER[4];
    }
    
    
    boolean Win()
    {
        if (Felder[0] != null && Felder[1] != null && Felder[2] != null && Felder[3] != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 
}
