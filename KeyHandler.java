import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener
{
    @Override 
    public void keyTyped(KeyEvent e)
    {
        
        
    }
    
    @Override
    public void keyReleased(KeyEvent e)
    {   
       
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
          if(e.getKeyCode()==KeyEvent.VK_UP)
        {
           System.out.println("Test"); 
        }
    }
}