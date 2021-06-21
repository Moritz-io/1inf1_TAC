import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain{
    JFrame frame;
    JPanel panel;
    
    RoundButton roundButton;
    
        GuiMain()
    {
        frame = new JFrame("Tac");
        
        frame.setSize(600, 350);
        
        frame.addKeyListener(new KeyHandler());
        frame.setVisible(true); 
        
        panel = new JPanel();
        frame.add(panel);
      
        
        roundButton = new RoundButton("Kugel",75);
        panel.add(roundButton);
        roundButton.setLocation(400,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked???");
            }
        });
        
    }
}
