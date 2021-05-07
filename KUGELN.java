
/**
 * Beschreiben Sie hier die Klasse KUGELN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KUGELN
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
<<<<<<< HEAD
    private int x;

    /**
     * Konstruktor für Objekte der Klasse KUGELN
     */
    public KUGELN()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
=======
    int KugelID;
    int KugelSpielerID;

    /**
     * Konstruktor für Objekte der Klasse KUGELN
     */
    public KUGELN(int ID, int id)
    {
        this.KugelID = id;
		this.KugelSpielerID = ID;
        
    }

public String toString() {
		return(KugelSpielerID + ". Spieler-Kugel " + KugelID);
	}  
    
>>>>>>> 8ca0e4918f75f03a2b88d6b404b558238339435b
}
