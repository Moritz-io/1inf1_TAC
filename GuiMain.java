import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
public class GuiMain{
    JFrame frame;
    JPanel panel;
    
    RoundButton roundButton;
    
        GuiMain()
    {
        frame = new JFrame("Tac");
        
        frame.setSize(1000, 700);
        
        frame.addKeyListener(new KeyHandler());
        frame.setVisible(true); 
        
        panel = new JPanel();
        frame.add(panel);
      
        
        roundButton = new RoundButton("Kugel 1.1",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Blau.png"));
        panel.add(roundButton);
        roundButton.setLocation(400,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 1.1???");
            }
        });
        roundButton = new RoundButton("Kugel 1.2",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Blau.png"));
        panel.add(roundButton);
        roundButton.setLocation(400,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 1.2???");
            }
        });
        roundButton = new RoundButton("Kugel 1.3",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Blau.png"));
        panel.add(roundButton);
        roundButton.setLocation(400,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 1.3???");
            }
        });
        roundButton = new RoundButton("Kugel 1.4",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Blau.png"));
        panel.add(roundButton);
        roundButton.setLocation(400,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 1.4???");
            }
        });
        roundButton = new RoundButton("Kugel 2.1",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Rot.png"));
        panel.add(roundButton);
        roundButton.setLocation(40,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 2.1???");
            }
        });
        roundButton = new RoundButton("Kugel 2.2",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Rot.png"));
        panel.add(roundButton);
        roundButton.setLocation(40,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 2.2???");
            }
        });
        roundButton = new RoundButton("Kugel 2.3",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Rot.png"));
        panel.add(roundButton);
        roundButton.setLocation(40,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 2.3???");
            }
        });
        roundButton = new RoundButton("Kugel 2.4",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Rot.png"));
        panel.add(roundButton);
        roundButton.setLocation(40,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 2.4???");
            }
        });
        roundButton = new RoundButton("Kugel 3.1",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Gelb.png"));
        panel.add(roundButton);
        roundButton.setLocation(80,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 3.1???");
            }
        });
        roundButton = new RoundButton("Kugel 3.2",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Gelb.png"));
        panel.add(roundButton);
        roundButton.setLocation(80,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 3.2???");
            }
        });
        roundButton = new RoundButton("Kugel 3.3",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Gelb.png"));
        panel.add(roundButton);
        roundButton.setLocation(80,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 3.3???");
            }
        });
        roundButton = new RoundButton("Kugel 3.4",75);
        roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Gelb.png"));
        panel.add(roundButton);
        roundButton.setLocation(80,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 3.4???");
            }
        });
        roundButton = new RoundButton("Kugel 4.1",75);
                roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Grün.png"));

        panel.add(roundButton);
        roundButton.setLocation(120,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 4.1???");
            }
        });
        roundButton = new RoundButton("Kugel 4.2",75);
                roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Grün.png"));

        panel.add(roundButton);
        roundButton.setLocation(120,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 4.2???");
            }
        });
        roundButton = new RoundButton("Kugel 4.3",75);
                roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Grün.png"));

        panel.add(roundButton);
        roundButton.setLocation(120,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 4.3???");
            }
        });
        roundButton = new RoundButton("Kugel 4.4",75);
                roundButton.setIcon(new ImageIcon("C:\\Users\\KahlOsk\\Documents\\Info Q11\\Tac_2\\Bilder\\Grün.png"));

        panel.add(roundButton);
        roundButton.setLocation(120,100);
        roundButton.setEnabled(true);
        roundButton.setVisible(true);
        roundButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicked 4.4???");
            }
        });
    }
}
