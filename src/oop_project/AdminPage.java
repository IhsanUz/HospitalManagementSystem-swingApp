package oop_project;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;

public class AdminPage {


	private JFrame frame;
	private JTextField IdField;
	private JPasswordField passwordField;

	public AdminPage() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 562, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("UserName");
		lblUserName.setBounds(156, 163, 70, 22);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(156, 223, 70, 16);
		frame.getContentPane().add(lblPassword);
		
		IdField = new JTextField();
		IdField.setBounds(259, 163, 116, 22);
		frame.getContentPane().add(IdField);
		IdField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(259, 220, 116, 22);
		frame.getContentPane().add(passwordField);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(IdField.getText().equals("admin")&&
						passwordField.getText().equals("admin")) {
					Hospital hp=new Hospital();
					hp.getFrmHospital().setVisible(true);
					frame.setVisible(false);
					
				}
				else {
					IdField.setText("");
					passwordField.setText("");
					JOptionPane.showMessageDialog(frame, "Wrong Password or Username");
				}
				
			}
		});
		btnOk.setBounds(195, 276, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JLabel lblNewLabel = new JLabel("    HOSPITAL MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 20));
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(12, 13, 520, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN PANEL");
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.ITALIC, 17));
		lblNewLabel_1.setBounds(203, 108, 116, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
	}
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
