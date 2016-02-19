import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SabtEzhaarnaame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SabtEzhaarnaame window = new SabtEzhaarnaame();
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
	public SabtEzhaarnaame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void show() {
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u0645\u0648\u0641\u0642");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setForeground(new Color(50, 205, 50));
		
		JLabel label_1 = new JLabel("\u0627\u0638\u0647\u0627\u0631\u0646\u0627\u0645\u0647 \u0628\u0627 \u0645\u0648\u0641\u0642\u06CC\u062A \u062B\u0628\u062A \u0634\u062F");
		
		JButton btnNewButton = new JButton("\u0628\u0627\u0632\u06AF\u0634\u062A");
		btnNewButton.addMouseListener(new MouseAdapter() {
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(194)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_1)
								.addComponent(label)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(172)
							.addComponent(btnNewButton)))
					.addContainerGap(81, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(75)
					.addComponent(label)
					.addGap(18)
					.addComponent(label_1)
					.addGap(42)
					.addComponent(btnNewButton)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
