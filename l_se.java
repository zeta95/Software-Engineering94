//package last_SE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class l_se {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					l_se window = new l_se();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public l_se() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JLabel label = new JLabel("\u0635\u0641\u062D\u0647 \u06CC \u0627\u062F\u0645\u06CC\u0646");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		final JButton button = new JButton("\u0642\u0648\u0627\u0646\u06CC\u0646");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					rules nextWindow = new rules();
					nextWindow.frame.setVisible(true);
					//nextWindow.setTitle("Certificate 2");
					//frame.setVisible(false);
					frame.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			

			

			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		final JButton button_1 = new JButton("\u06A9\u0627\u0631\u0628\u0631\u0627\u0646");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					usersList nextWindow = new usersList();
					nextWindow.show();
				//	frame.setVisible(false);
					frame.dispose();
				} catch (Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		final JLabel label_1 = new JLabel("\u0628\u0631\u0627\u06CC \u062F\u0633\u062A\u0631\u0633\u06CC \u0628\u0647 \u0642\u0648\u0627\u0646\u06CC\u0646 \u0645\u0648\u062C\u0648\u062F \u0648 \u0648\u06CC\u0631\u0627\u06CC\u0634 \u06CC\u0627 \u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646 \u0642\u0648\u0627\u0646\u06CC\u0646 \u062C\u062F\u06CC\u062F");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		JLabel label_2 = new JLabel("\u0628\u0631\u0627\u06CC \u062F\u0633\u062A\u0631\u0633\u06CC \u0628\u0647 \u0627\u0633\u0627\u0645\u06CC \u06A9\u0627\u0631\u0628\u0631\u0627\u0646 \u0648 \u0648\u06CC\u0631\u0627\u06CC\u0634 \u06CC\u0627 \u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646 \u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0622\u0646 \u0647\u0627");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(57, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, Alignment.TRAILING)
						.addComponent(label_2, Alignment.TRAILING)
						.addComponent(label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(label)
					.addGap(49)
					.addComponent(button)
					.addGap(18)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
					.addComponent(button_1)
					.addGap(18)
					.addComponent(label_2)
					.addGap(66))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
