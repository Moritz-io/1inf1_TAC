
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
    KUGELN Kugel;
    int StartfeldID;
    /**
     * Konstruktor für Objekte der Klasse FELDER
     */
    public FELDER()
    {
       
      Kugel= null;
      feldbelegt = false;
      NachfolgeFeld = null;
      StartfeldID= 0;
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

    public void KugelEinfügen(KUGELN k)
    { 
        Kugel = k;
        feldbelegt = true;
    }
    
    public void Nachfolger(FELDER n)
    {
    NachfolgeFeld = n;
    }
    
    int IDAusgeben()
    {
        return StartfeldID;
    }
    FELDER IDSuche(int ID)
    {if (StartfeldID == ID)
        {
            return this;
        }
        else 
        {
            
        return NachfolgeFeld.IDSuche(ID);
        }
        
    }
    }
    
    

