
/**
 * Beschreiben Sie hier die Klasse SPIELFELD.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIELFELD
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private FELDER[] Felder;
    
    /**
     * Konstruktor für Objekte der Klasse SPIELFELD
     */
    public SPIELFELD(int x)
    {
        // Instanzvariable initialisieren
        Felder = new FELDER[64];
        
        SPIELER Spieler1= new SPIELER(1);
        SPIELER Spieler2= new SPIELER(2);
        SPIELER Spieler3= new SPIELER(3);
        SPIELER Spieler4= new SPIELER(4);
    }
    public void Runde()
    {
        for(int i=5;i != 0; i--)
        {
            Spieler1.Zug();
        }
    }
    public void Zug()
    {
        
    }
    }

    
