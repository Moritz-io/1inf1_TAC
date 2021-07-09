
/**
 * Beschreiben Sie hier die Klasse SPIELER.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIELER
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public KARTEN[] Karten;
 int SPIELERID;
 boolean feldbelegt;
 KUGELN Kugel;
 FELDER Start;
 
 


    public SPIELER(int y)
    {
        // Instanzvariable initialisieren
        SPIELERID = y;
        Karten = new KARTEN[5];
        feldbelegt = false;
        Start = null;

    }
void KugelSetzen(int y)
{ 
  Start = SPIELFELD.StartfeldFinden(SPIELERID);
  KUGELN K = new KUGELN(SPIELERID,y);
  Start.KugelEinfügen(K);
  
 
  
   
        
}
void Kugelbewegen()
{

}
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void Zug()
    {
        
    }
    public void Zieht(int Feldwert, int Kartenwert)
    {
        
    }
}
