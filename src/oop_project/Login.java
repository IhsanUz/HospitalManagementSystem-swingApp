package oop_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;

public class Login {

	private JRadioButton rdbtnAdmin;
	private JRadioButton rdbtnPatient;
	private JFrame LoginPage;
	public static HospitalManagementSystem hms = new HospitalManagementSystem();
	public JFrame getLoginPage() {
		return LoginPage;
	}


	public void setLoginPage(JFrame loginPage) {
		LoginPage = loginPage;
	}

	

	private Appointment ap;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.LoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Login() 
	{
		LoginPage = new JFrame();
		LoginPage.getContentPane().setBackground(Color.BLUE);
		LoginPage.setBounds(100, 100, 445, 314);
		LoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginPage.getContentPane().setLayout(null);
		
		JLabel lblHospitalMS = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
		lblHospitalMS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHospitalMS.setForeground(Color.GREEN);
		lblHospitalMS.setBounds(77, 38, 297, 16);
		LoginPage.getContentPane().add(lblHospitalMS);
		
		rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBounds(97, 94, 127, 25);
		rdbtnAdmin.setSelected(true);
		LoginPage.getContentPane().add(rdbtnAdmin);
		
		
		
		rdbtnPatient = new JRadioButton("Patient");
		rdbtnPatient.setBounds(97, 133, 127, 25);
		rdbtnPatient.setSelected(true);
		LoginPage.getContentPane().add(rdbtnPatient);
		
		ButtonGroup btng=new ButtonGroup();
		btng.add(rdbtnAdmin);
		btng.add(rdbtnPatient);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAdmin.isSelected()) {
					AdminPage adp=new AdminPage();
					adp.getFrame().setVisible(true);
					LoginPage.setVisible(false);
				}
				else {
					ap=new Appointment(LoginPage);
					ap.getFrmAppointment().setVisible(true);
					LoginPage.setVisible(false);
				}
				
			}
			
		});
		btnOk.setBounds(161, 192, 97, 25);
		LoginPage.getContentPane().add(btnOk);
		
		
		
		
		
	}
}
