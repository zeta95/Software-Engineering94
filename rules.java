//package last_SE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class rules {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rules window = new rules();
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
	public rules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}
		});
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 490, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u0642\u0648\u0627\u0646\u06CC\u0646");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_1 = new JLabel("\u0627\u0641\u0631\u0627\u062F \u0645\u062A\u0642\u0627\u0636\u06CC \u0645\u062C\u0648\u0632 \u0628\u0627\u06CC\u062F 10 \u0631\u0648\u0632 \u0642\u0628\u0644 \u062F\u0631\u062E\u0648\u0627\u0633\u062A \u0622\u0646\u0631\u0627 \u0648\u0627\u0631\u062F \u06A9\u0646\u0646\u062F. ");
		
		JLabel label_2 = new JLabel("\u0642\u0627\u0646\u0648\u0646 2");
		
		final JLabel label_3 = new JLabel("\u0648\u06CC\u0631\u0627\u06CC\u0634");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setForeground(Color.blue);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("Certificate OK!");
				try {
					changeRules nextWindow = new changeRules();
					nextWindow.frame.setVisible(true);
					//frame.setVisible(false);
					frame.dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		final JLabel label_4 = new JLabel("\u0648\u06CC\u0631\u0627\u06CC\u0634");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_4.setForeground(Color.blue);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
				changeRules nextWindow = new changeRules();
				nextWindow.frame.setVisible(true);
				//frame.setVisible(false);
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		
		final JTextArea textArea = new JTextArea();
		
		final JLabel label_5 = new JLabel("\u0627\u0641\u0632\u0648\u062F\u0646 \u0642\u0627\u0646\u0648\u0646 \u062C\u062F\u06CC\u062F");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_5.setForeground(Color.orange);
				textArea.getText();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(label_5)
							.addGap(18)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
							.addComponent(label_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_4)
							.addPreferredGap(ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
							.addComponent(label_2))
						.addComponent(label))
					.addGap(38))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(label_3))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(label_4))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_5)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(91))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
