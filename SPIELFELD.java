
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
    public SPIELER Spieler1;
    public SPIELER Spieler2;
    public SPIELER Spieler3;
    public SPIELER Spieler4;
    private boolean victory;
    public HAUS Haus1;
    public HAUS Haus2;
    public HAUS Haus3;
    public HAUS Haus4;
    
    /**
     * Konstruktor für Objekte der Klasse SPIELFELD
     */
    public SPIELFELD(int x)
    {
        // Instanzvariable initialisieren
        Felder = new FELDER[64];
        victory = false;
        
        SPIELER Spieler1 = new SPIELER(1);
        SPIELER Spieler2 = new SPIELER(2);
        SPIELER Spieler3 = new SPIELER(3);
        SPIELER Spieler4 = new SPIELER(4);
        
        HAUS Haus1 = new HAUS(1);
        HAUS Haus2 = new HAUS(2);
        HAUS Haus3 = new HAUS(3);
        HAUS Haus4 = new HAUS(4);
    }
    public void Spiel()
    { while (victory == false)
        {
            Runde();
        }
        
        
        
    }
    
    public void Runde()
    {
        Kartenziehen();
        for(int i=5;i != 0; i--)
        {
            Spieler1.Zug();
            Spieler2.Zug();
            Spieler3.Zug();
            Spieler4.Zug();
        }
    }
    public void Kartenziehen()
    {
        
    }
    }

    
