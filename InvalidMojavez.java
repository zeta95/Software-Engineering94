import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;

public class InvalidMojavez {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabel msg=new JLabel("");
					InvalidMojavez window = new InvalidMojavez(msg);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	
	public void show(){
		frame.setVisible(true);
	}
	public InvalidMojavez(JLabel msg) {
		initialize(msg);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JLabel msg) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("");
		JLabel label_1 = new JLabel("Not Valid");
		label=msg;
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(201, Short.MAX_VALUE)
					.addComponent(label)
					.addComponent(label_1)
					.addGap(187))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(104)
					.addComponent(label)
					.addComponent(label_1)
					.addContainerGap(143, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
