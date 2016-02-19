import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FullInformation {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FullInformation window = new FullInformation();
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
	public FullInformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void show(){
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u0627\u0638\u0647\u0627\u0631\u0646\u0627\u0645\u0647");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("B Nazanin", Font.PLAIN, 18));
		
		JLabel lblNewLabel = new JLabel("\u0634\u0646\u0627\u0633\u0647 \u0645\u0644\u06CC \u062A\u0627\u062C\u0631:");
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u0648 \u0646\u0627\u0645 \u062D\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC \u062A\u0627\u062C\u0631:");
		
		JLabel label_2 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0627\u0638\u0647\u0627\u0631:");
		
		JLabel label_3 = new JLabel("\u0627\u0631\u0632\u0634 \u06A9\u0644 \u06A9\u0627\u0644\u0627\u0647\u0627 \u0628\u0647 \u062F\u0644\u0627\u0631:");
		
		JLabel label_4 = new JLabel("\u06A9\u0634\u0648\u0631 \u0645\u0628\u062F\u0623:");
		
		JLabel label_5 = new JLabel("\u0646\u062D\u0648\u0647 \u06CC \u0648\u0631\u0648\u062F \u0628\u0647 \u06A9\u0634\u0648\u0631:");
		
		JLabel label_6 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u06A9\u0627\u0644\u0627:");
		
		JLabel label_7 = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u06A9\u0627\u0644\u0627:");
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("B Nazanin", Font.PLAIN, 18));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JRadioButton radioButton = new JRadioButton("\u0647\u0648\u0627\u06CC\u06CC");
		buttonGroup.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u0632\u0645\u06CC\u0646\u06CC");
		buttonGroup.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u062F\u0631\u06CC\u0627\u06CC\u06CC");
		buttonGroup.add(radioButton_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel label_8 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u06A9\u0627\u0644\u0627:");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel label_9 = new JLabel("\u0648\u0632\u0646 \u06A9\u0627\u0644\u0627:");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel label_10 = new JLabel("\u0634\u0631\u06A9\u062A \u062A\u0648\u0644\u06CC\u062F\u06A9\u0646\u0646\u062F\u0647 \u06CC \u06A9\u0627\u0644\u0627:");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel label_11 = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0644\u0627:");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel label_13 = new JLabel("\u0642\u06CC\u0645\u062A \u0648\u0627\u062D\u062F \u06A9\u0627\u0644\u0627 \u0628\u0647 \u062F\u0644\u0627\u0631:");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JRadioButton radioButton_3 = new JRadioButton("\u06CC\u06A9 \u06A9\u0627\u0644\u0627");
		buttonGroup_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\u0628\u06CC\u0634\u062A\u0631 \u0627\u0632 \u06CC\u06A9 \u06A9\u0627\u0644\u0627");
		buttonGroup_1.add(radioButton_4);
		
		JButton button = new JButton("\u062B\u0628\u062A");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!textField_3.getText().equals("")){
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								RadEzhaarname nextWindow = new RadEzhaarname();
								nextWindow.show();
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								SabtEzhaarnaame nextWindow = new SabtEzhaarnaame();
								nextWindow.show();
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_11))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(139)
									.addComponent(label_9))
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(132)
									.addComponent(label_8))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(63)
									.addComponent(label_10))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_13))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_7)
								.addComponent(label)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(radioButton_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
										.addComponent(radioButton_4, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addComponent(radioButton)
											.addGap(32)
											.addComponent(label_5))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(button)
												.addComponent(radioButton_3, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(label_6))))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_4))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_3))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_2))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_1))
									.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(93)
										.addComponent(lblNewLabel))))))
					.addGap(45))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(radioButton)
						.addComponent(radioButton_1)
						.addComponent(radioButton_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_6)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_7))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(radioButton_3)
							.addComponent(radioButton_4)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_11))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_10)))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_9)))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_8)))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13))
					.addGap(45)
					.addComponent(button)
					.addGap(181)
					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
