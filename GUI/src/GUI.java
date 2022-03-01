import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

	private int count;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;

	
	public static void main(String[] args) {
		new GUI();
	}
	
	public GUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Click Me");
		label = new JLabel();
		
		// creating the border for the GUI
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);					// adds the panel to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// sets what happens when the frame is closed
		frame.setTitle("Our GUI");								// sets the title of the window
		frame.pack();											// sets the frame to be a certain size
		frame.setVisible(true);									// sets window to be visible and in focus
		
		// using "this" tells the button to look for the ActionListener that is within this class
		button.addActionListener(this);							 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}
}
