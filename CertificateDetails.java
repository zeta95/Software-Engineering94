import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CertificateDetails {

	private JFrame frmHey;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_1;
	private JTextField textField_3;
	private JLabel label_2;
	private JTextField textField_4;
	private JLabel label_3;
	private JTextField textField_5;
	private JLabel label_4;
	private JLabel label_5;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton radioButton_2;
	private JButton button;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CertificateDetails window = new CertificateDetails();
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
	
	public void show (){
		frmHey.setVisible(true);
	}
	
	public void setTitle (String s){
		frmHey.setTitle(s);
	}
	
	public CertificateDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHey = new JFrame();
		//frmHey.setTitle("hey");
		frmHey.setBounds(100, 100, 450, 371);
		frmHey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("\u202B\u0646\u0627\u0645:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("\u202B\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		label_1 = new JLabel("\u202B\u0646\u0627\u0645 \u06A9\u0627\u0644\u0627:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		label_2 = new JLabel("\u202B\u062A\u0639\u062F\u0627\u062F \u06A9\u0627\u0644\u0627:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		label_3 = new JLabel("\u202B\u0634\u0646\u0627\u0633\u0647 \u0645\u0644\u06CC \u062A\u0627\u062C\u0631:");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		label_4 = new JLabel("\u202B\u06A9\u0634\u0648\u0631 \u0645\u0628\u062F\u0627:");
		
		label_5 = new JLabel("\u202B\u0646\u062D\u0648\u0647 \u0648\u0631\u0648\u062F \u0628\u0647 \u06A9\u0634\u0648\u0631:");
		
		radioButton = new JRadioButton("\u0647\u0648\u0627\u06CC\u06CC");
		buttonGroup.add(radioButton);
		
		radioButton_1 = new JRadioButton("\u0632\u0645\u06CC\u0646\u06CC");
		buttonGroup.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("\u062F\u0631\u06CC\u0627\u06CC\u06CC");
		buttonGroup.add(radioButton_2);
		
		button = new JButton("\u0635\u062F\u0648\u0631 \u0645\u062C\u0648\u0632");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Certificate OK!");
				try {
					CertificateSuccessful nextWindow = new CertificateSuccessful();
					nextWindow.show();
					//frame.setVisible(false);
					frmHey.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmHey.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(71, Short.MAX_VALUE)
					.addComponent(radioButton_2)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(label))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(lblNewLabel))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(label_3))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(label_2))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(label_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(label_4)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(radioButton)
							.addGap(18)
							.addComponent(label_5)
							.addGap(25))))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(168)
					.addComponent(button)
					.addContainerGap(167, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(label)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(label_3)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(label_1)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(label_2)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(label_4))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(243)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5)
								.addComponent(radioButton)
								.addComponent(radioButton_1)
								.addComponent(radioButton_2))))
					.addGap(18)
					.addComponent(button)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frmHey.getContentPane().setLayout(groupLayout);
	}
}
