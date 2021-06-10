import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GUI2 implements ActionListener
{
    JFrame fenster = new JFrame();
    JPanel mPanel = new JPanel();
    JLabel mLabel = new JLabel("Button noch nicht geklicht");
    JButton mButton = new JButton("Klick");
    public static void main(String[] args)
    {
        new GUI2();
    }
    
    GUI2()
    {
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setLocation(100,100);
        fenster.add(mPanel);
        mPanel.add(mButton);
        mPanel.add(mLabel);
        mButton.addActionListener(this);
        fenster.pack();
        


        
        fenster.setVisible(true);
    }
    
    //useless so far
    public void paint (Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Ellipse2D.Double(100,100,10,10));
        g2.fill (new Ellipse2D.Double(0, 0, 100, 50));
        
    }
    // till Here /\
    public void actionPerformed(ActionEvent e)
    {
        mLabel.setText("Wurde geklickt!");
    }
}