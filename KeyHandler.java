import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener
{
    @Override 
    public void keyTyped(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
           System.out.println("Test"); 
        }
        
        
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
          if(e.getKeyCode()==KeyEvent.VK_UP)
        {
           System.out.println("Test"); 
        }
    }
    @Override
    public void keyReleased(KeyEvent e)
    {   
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
           System.out.println("Test"); 
        }
    }
    
}