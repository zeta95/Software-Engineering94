import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Certification {

	private JFrame frmX;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Certification window = new Certification();
					window.frmX.setVisible(true);
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
	public void show (){
		frmX.setVisible(true);
	}
	
	public Certification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmX = new JFrame();
		frmX.setTitle("\u202B\u0633\u0627\u0632\u0645\u0627\u0646 x");
		frmX.setBounds(100, 100, 450, 300);
		frmX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u0644\u06CC\u0633\u062A \u0645\u062C\u0648\u0632\u0647\u0627\u06CC \u0642\u0627\u0628\u0644 \u0635\u062F\u0648\u0631:");
		
		JLabel label_1 = new JLabel("\u0645\u062C\u0648\u0632 \u06F1");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Certificate 1");
				try {
					CertificateDetails nextWindow = new CertificateDetails();
					nextWindow.show();
					nextWindow.setTitle("Certificate 1");
					//frame.setVisible(false);
					frmX.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_1.setForeground(new Color(243, 46, 150));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_1.setForeground(new Color(0, 51, 255));
			}
		});
		label_1.setForeground(new Color(0, 51, 255));
		
		JLabel label_2 = new JLabel("\u0645\u062C\u0648\u0632 \u06F2");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Certificate 2");
				try {
					CertificateDetails nextWindow = new CertificateDetails();
					nextWindow.show();
					nextWindow.setTitle("Certificate 2");
					//frame.setVisible(false);
					frmX.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_2.setForeground(new Color(243, 46, 150));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_2.setForeground(new Color(0, 51, 255));
			}
		});
		label_2.setForeground(new Color(0, 51, 255));
		
		JLabel label_3 = new JLabel("\u0645\u062C\u0648\u0632 \u06F3");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Certificate 3");
				try {
					CertificateDetails nextWindow = new CertificateDetails();
					nextWindow.show();
					nextWindow.setTitle("Certificate 3");
					//frame.setVisible(false);
					frmX.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_3.setForeground(new Color(243, 46, 150));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_3.setForeground(new Color(0, 51, 255));
			}
		});
		label_3.setForeground(new Color(0, 51, 255));
		
		JLabel label_4 = new JLabel("\u0645\u062C\u0648\u0632 \u06F4");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Certificate 4");
				try {
					CertificateDetails nextWindow = new CertificateDetails();
					nextWindow.show();
					nextWindow.setTitle("Certificate 4");
					//frame.setVisible(false);
					frmX.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_4.setForeground(new Color(243, 46, 150));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_4.setForeground(new Color(0, 51, 255));
			}
		});
		label_4.setForeground(new Color(0, 51, 255));
		GroupLayout groupLayout = new GroupLayout(frmX.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(268, Short.MAX_VALUE)
					.addComponent(label)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(195)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(182, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGap(18)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		frmX.getContentPane().setLayout(groupLayout);
	}
}
