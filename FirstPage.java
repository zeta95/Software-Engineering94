import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FirstPage {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstPage() {
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
		frame.setTitle("\u06AF\u0645\u0631\u06A9 \u062C\u0645\u0647\u0648\u0631\u06CC \u0627\u0633\u0644\u0627\u0645\u06CC \u0627\u06CC\u0631\u0627\u0646");
		frame.setBounds(100, 100, 450, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("\u202B\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC:");
		
		JLabel lblPassword = new JLabel("\u202B\u0631\u0645\u0632 \u0639\u0628\u0648\u0631:");
		lblPassword.setToolTipText("");
		
		JButton btnLogin = new JButton("\u0648\u0631\u0648\u062F");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("login");
				if (textField.getText().equals("certificate")){
					try {
						Certification nextWindow = new Certification();
						nextWindow.show();
					//	frame.setVisible(false);
						frame.dispose();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				else if (textField.getText().equals("ezharname")){
					try {
						Checking nextWindow = new Checking();
						nextWindow.show();
					//	frame.setVisible(false);
						frame.dispose();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				else if (textField.getText().equals("admin")){
					try {
						usersList nextWindow = new usersList();
						nextWindow.show();
					//	frame.setVisible(false);
						frame.dispose();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		passwordField = new JPasswordField();
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(103)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField)
								.addComponent(textField))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPassword)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel)))
							.addGap(10))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(184)
							.addComponent(btnLogin)))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(107)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword))
					.addGap(28)
					.addComponent(btnLogin)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
