
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
    FELDER NachfolgeFeld;
    KUGEL Kugel;
    /**
     * Konstruktor für Objekte der Klasse FELDER
     */
    public FELDER()
    {
       
      Kugel= null;
      feldbelegt = false;
      NachfolgeFeld = null;
    }
     public FELDER(FELDER n)
    {
        
      Kugel= null;
      feldbelegt = false;
      NachfolgeFeld = n;
    }
    

    public boolean istfeldBelegt()
    { if( Kugel == null )
    
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

    public void KugelEinfügen(KUGEL k)
    { 
        Kugel = k;
        feldbelegt = true;
    }
    
    public void Nachfolger(FELDER n)
    {
    NachfolgeFeld = n;
    }

    }
    
    

