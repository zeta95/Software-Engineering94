import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RadEzhaarname {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadEzhaarname window = new RadEzhaarname();
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
	public RadEzhaarname() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void show (){
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u0646\u0627\u0645\u0648\u0641\u0642");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setForeground(Color.RED);
		
		JLabel label_1 = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0648\u0627\u0631\u062F \u0634\u062F\u0647 \u0628\u0627 \u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u062C\u0648\u0632\u060C \u0645\u0637\u0627\u0628\u0642\u062A \u0646\u062F\u0627\u0631\u0646\u062F.");
		
		JButton button = new JButton("\u0628\u0627\u0632\u06AF\u0634\u062A");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					FirstPage nextWindow = new FirstPage();
					nextWindow.show();
					//frame.setVisible(false);
					frame.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(183)
					.addComponent(label)
					.addContainerGap(188, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(285, Short.MAX_VALUE)
					.addComponent(label_1)
					.addGap(103))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(357, Short.MAX_VALUE)
					.addComponent(button)
					.addGap(173))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_1)
					.addGap(51)
					.addComponent(button)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
