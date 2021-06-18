import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain{

	public static void main(String[] args){
	
		JFrame frame = new JFrame("Tac");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.requestFocus();
		frame.addKeyListener(new KeyHandler());
		
		
		
		CircleButton circleButton = new CircleButton("Kugel");
		circleButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("Clicked!");
				}
		});
		
		
		JButton normalButton = new JButton("Karte");
		
		
		JPanel panel = new JPanel();
		panel.add(circleButton);
		
		panel.add(normalButton);
		frame.add(panel);
	
		
		frame.setSize(3000, 1500);
		frame.setVisible(true);	
	}
}
