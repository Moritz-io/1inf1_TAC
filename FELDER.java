
/**
 * Beschreiben Sie hier die Klasse FELDER.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FELDER
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    boolean feldbelegt;
    KUGELN Kugel; 
    FELDER NachfolgeFeld;
    
    /**
     * Konstruktor für Objekte der Klasse FELDER
     */
    public FELDER(FELDER n)
    {
        // Instanzvariable initialisieren
      Kugel= null; 
      feldbelegt = false;
      NachfolgeFeld = n;
    }
    

    boolean istfeldBelegt(int KugelID )
    { if( KugelID == 0 )
    
    {
     feldbelegt = false;  
    return false;
    
    }
    else 
    {
     feldbelegt =true;    
    return true;
    }


    }
    void KugelZieht (KUGELN KugelNeu)
    {
        Kugel = KugelNeu;
    }
    
}
