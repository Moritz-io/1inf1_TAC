
/**
 * Beschreiben Sie hier die Klasse KUGELN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KUGELN
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

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
    

}
