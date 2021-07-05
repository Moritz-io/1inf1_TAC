
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
 
 


    public SPIELER(int y)
    {
        // Instanzvariable initialisieren
        SPIELERID = y;
        Karten = new KARTEN[5];
       
        feldbelegt = false;

    }
void KugelSetzen(int y)
{ 
  
  KUGELN K = new KUGELN(SPIELERID,y);
 
  
   
        
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
