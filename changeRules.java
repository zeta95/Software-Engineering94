

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class changeRules {

	 JFrame frame;
	private JTextField textField;
	private JButton button;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changeRules window = new changeRules();
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
	public changeRules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u0648\u06CC\u0631\u0627\u06CC\u0634 \u0642\u0627\u0646\u0648\u0646");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setForeground(Color.BLUE);
		
		button = new JButton("\u0627\u0639\u0645\u0627\u0644 \u062A\u063A\u06CC\u06CC\u0631\u0627\u062A");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							changeRuleSuccessful window = new changeRuleSuccessful();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(36))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(154)
					.addComponent(button)
					.addContainerGap(191, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGap(55)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(button)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
