import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui
{
    public Gui()
    {
        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.screenwidth,Var.screenheigth);
        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.setLayout(null);
        Var.jf1.setTitle("Tac");
        Var.jf1.setResizable(false);
        Var.jf1.requestFocus();
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.setVisible(true);
        
    
        
        
            }
}