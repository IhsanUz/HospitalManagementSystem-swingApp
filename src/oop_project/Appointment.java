package oop_project;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Appointment  {

	private JFrame frmAppointment;
	private JTextField NameField;
	private JTextField SurnameField;
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	private JTextField townField;
	private JTextField streetField;
	private JTextField cityField;
	private JTextField phoneNumberField;
	private JTextField countrycodeField;
	private JTextField citycodeField;
	
	

	public Appointment(JFrame superF) {
		
			
		frmAppointment = new JFrame();
		frmAppointment.getContentPane().setBackground(Color.MAGENTA);
		frmAppointment.setTitle("Add Appoinment,Add Patient");	
		frmAppointment.setBounds(100, 100, 599, 519);		
		frmAppointment.getContentPane().setLayout(null);
		frmAppointment.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				superF.setVisible(true);
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(101, 59, 56, 16);
		frmAppointment.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname :");
		lblSurname.setBounds(86, 101, 83, 19);
		frmAppointment.getContentPane().add(lblSurname);
		
		NameField = new JTextField();
		NameField.setBounds(181, 56, 116, 22);
		frmAppointment.getContentPane().add(NameField);
		NameField.setColumns(10);
		
		SurnameField = new JTextField();
		SurnameField.setBounds(181, 99, 116, 22);
		frmAppointment.getContentPane().add(SurnameField);
		SurnameField.setColumns(10);
		
		JLabel lblBirthdate = new JLabel("Birthdate :");
		lblBirthdate.setBounds(86, 154, 71, 16);
		frmAppointment.getContentPane().add(lblBirthdate);
		
		dayField = new JTextField();
		dayField.setBounds(181, 151, 43, 22);
		frmAppointment.getContentPane().add(dayField);
		dayField.setColumns(10);
		
		monthField = new JTextField();
		monthField.setBounds(241, 151, 43, 22);
		frmAppointment.getContentPane().add(monthField);
		monthField.setColumns(10);
		
		yearField = new JTextField();
		yearField.setBounds(305, 151, 83, 22);
		frmAppointment.getContentPane().add(yearField);
		yearField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("day");
		lblNewLabel_1.setBounds(191, 174, 25, 16);
		frmAppointment.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("month");
		lblNewLabel_2.setBounds(241, 174, 36, 16);
		frmAppointment.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("year");
		lblNewLabel_3.setBounds(332, 174, 56, 16);
		frmAppointment.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("/");
		lblNewLabel_4.setBounds(230, 154, 19, 16);
		frmAppointment.getContentPane().add(lblNewLabel_4);
		
		JLabel label = new JLabel("/");
		label.setBounds(290, 154, 19, 16);
		frmAppointment.getContentPane().add(label);
		
		JLabel lblNewLabel_5 = new JLabel("Address :");
		lblNewLabel_5.setBounds(90, 259, 56, 16);
		frmAppointment.getContentPane().add(lblNewLabel_5);
		
		townField = new JTextField();
		townField.setBounds(297, 256, 91, 22);
		frmAppointment.getContentPane().add(townField);
		townField.setColumns(10);
		
		streetField = new JTextField();
		streetField.setBounds(169, 256, 91, 22);
		frmAppointment.getContentPane().add(streetField);
		streetField.setColumns(10);
		
		cityField = new JTextField();
		cityField.setBounds(419, 256, 91, 22);
		frmAppointment.getContentPane().add(cityField);
		cityField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Street");
		lblNewLabel.setBounds(181, 237, 56, 16);
		frmAppointment.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Town");
		lblNewLabel_6.setBounds(307, 237, 56, 16);
		frmAppointment.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("City");
		lblNewLabel_7.setBounds(430, 237, 56, 16);
		frmAppointment.getContentPane().add(lblNewLabel_7);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(90, 311, 56, 16);
		frmAppointment.getContentPane().add(lblPhone);
		
		phoneNumberField = new JTextField();
		phoneNumberField.setBounds(307, 308, 116, 22);
		frmAppointment.getContentPane().add(phoneNumberField);
		phoneNumberField.setColumns(10);
		
		countrycodeField = new JTextField();
		countrycodeField.setBounds(169, 308, 43, 22);
		frmAppointment.getContentPane().add(countrycodeField);
		countrycodeField.setColumns(10);
		
		citycodeField = new JTextField();
		citycodeField.setBounds(241, 308, 43, 22);
		frmAppointment.getContentPane().add(citycodeField);
		citycodeField.setColumns(10);
		
		
		JButton btnAddAppointment = new JButton("Add Appointment");
		btnAddAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Phone ph = new Phone(countrycodeField.getText(), 
						citycodeField.getText(), 
						phoneNumberField.getText());
				Address ad=new Address(streetField.getText(),townField.getText(),cityField.getText());
				Date d =new Date(dayField.getText(),monthField.getText(),yearField.getText());
				
				Patient p = new Patient(NameField.getText(), 
						SurnameField.getText(), 
						ad,d, ph);
				boolean admessage=ad.isStatus(streetField.getText(), townField.getText(), cityField.getText());
				boolean phmessage=ph.isStatus(countrycodeField.getText(), 
						citycodeField.getText(), 
						phoneNumberField.getText());
				boolean dmessage=d.isStatus(dayField.getText(),monthField.getText(),yearField.getText());	
				String name=NameField.getText();
				String surname=SurnameField.getText();
				
				
				if(admessage && phmessage && dmessage && !name.equals("") && !surname.equals(""))
				{
					Login.hms.addPatient(p);
					JOptionPane.showMessageDialog(frmAppointment, "Successfully added!");
				}
				else
				{
					JOptionPane.showMessageDialog(frmAppointment, "Error! All blank must be fill");

				}
			}
		});
		btnAddAppointment.setBounds(216, 369, 147, 25);
		frmAppointment.getContentPane().add(btnAddAppointment);
		
		
	}

	public JFrame getFrmAppointment() {
		return frmAppointment;
	}

	public void setFrmAppointment(JFrame frame) {
		this.frmAppointment = frame;
	}
}
