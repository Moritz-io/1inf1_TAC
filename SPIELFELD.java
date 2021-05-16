
import java.util.Random;

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
    public Random rand;
    /**
     * Konstruktor für Objekte der Klasse SPIELFELD
     */
    public SPIELFELD(int x)
    {
        // Instanzvariable initialisieren
        Felder = new FELDER[64];
        victory = false;
        
        Spieler1 = new SPIELER(1);
        Spieler2 = new SPIELER(2);
        Spieler3 = new SPIELER(3);
        Spieler4 = new SPIELER(4);
        

        Haus1 = new HAUS(1);
        Haus2 = new HAUS(2);
        Haus3 = new HAUS(3);
        Haus4 = new HAUS(4);
        rand = new Random(); 

    }
    
    public void Spiel()
    { 
        while (victory == false)
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
            if (Haus1.Win() ==true)
            {
                victory = true;
                System.out.println ("Spieler 1 gewinnt!");
            }
            else if (Haus2.Win() ==true)
            {
                victory = true;
                System.out.println ("Spieler 2 gewinnt!");
            }
            else if (Haus3.Win() ==true)
            {
                victory = true;
                System.out.println ("Spieler 3 gewinnt!");
            }
            else if (Haus4.Win() ==true)
            {
                victory = true;
                System.out.println ("Spieler 4 gewinnt!");
            }
        }
    }
    
    public void Kartenziehen()
    {
        for(int x = 0; x<5 ; x++) 
        {
            int int_random1 = rand.nextInt(18); 
            Spieler1.Zieht(x,int_random1);
       
            int int_random2 = rand.nextInt(18); 
            Spieler2.Zieht(x,int_random2);
       
            int int_random3 = rand.nextInt(18); 
            Spieler3.Zieht(x,int_random3);
       
            int int_random4 = rand.nextInt(18); 
            Spieler4.Zieht(x,int_random4);
        }
    }
    
    }

    
