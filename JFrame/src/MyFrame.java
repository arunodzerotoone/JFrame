import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame {

	 MyFrame() {
		
		this.setVisible(true);
		this.setSize(420,420);
		this.setTitle("Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
				
		ImageIcon icon = new ImageIcon("graduate.png");
		this.setIconImage(icon.getImage());

		this.getContentPane().setBackground(new Color(56,23,123));

	}

	
	
}
