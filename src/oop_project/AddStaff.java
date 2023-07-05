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

public class AddStaff  {

	private JFrame frmAddstaff;
	
	public JFrame getFrmAddstaff() {
		return frmAddstaff;
	}
	public void setFrmAddstaff(JFrame frmAddstaff) {
		this.frmAddstaff = frmAddstaff;
	}

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
	private JTextField SalaryField;
	
	

	public AddStaff(JFrame superF,int type) {
		
			
		frmAddstaff = new JFrame();
		frmAddstaff.getContentPane().setBackground(Color.GRAY);
		if(type==1) {
			frmAddstaff.setTitle("Add Doctor");
		}
		else if(type==2) {
			frmAddstaff.setTitle("Add Nurse");
		}
		else if(type==3) {
			frmAddstaff.setTitle("Add Receptionist");
		}
			
		frmAddstaff.setBounds(100, 100, 599, 519);		
		frmAddstaff.getContentPane().setLayout(null);
		frmAddstaff.addWindowListener(new WindowAdapter() {
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
		frmAddstaff.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname :");
		lblSurname.setBounds(86, 101, 83, 19);
		frmAddstaff.getContentPane().add(lblSurname);
		
		NameField = new JTextField();
		NameField.setBounds(181, 56, 116, 22);
		frmAddstaff.getContentPane().add(NameField);
		NameField.setColumns(10);
		
		SurnameField = new JTextField();
		SurnameField.setBounds(181, 99, 116, 22);
		frmAddstaff.getContentPane().add(SurnameField);
		SurnameField.setColumns(10);
		
		JLabel lblBirthdate = new JLabel("Birthdate :");
		lblBirthdate.setBounds(86, 154, 71, 16);
		frmAddstaff.getContentPane().add(lblBirthdate);
		
		dayField = new JTextField();
		dayField.setBounds(181, 151, 43, 22);
		frmAddstaff.getContentPane().add(dayField);
		dayField.setColumns(10);
		
		monthField = new JTextField();
		monthField.setBounds(241, 151, 43, 22);
		frmAddstaff.getContentPane().add(monthField);
		monthField.setColumns(10);
		
		yearField = new JTextField();
		yearField.setBounds(305, 151, 83, 22);
		frmAddstaff.getContentPane().add(yearField);
		yearField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("day");
		lblNewLabel_1.setBounds(191, 174, 25, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("month");
		lblNewLabel_2.setBounds(241, 174, 36, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("year");
		lblNewLabel_3.setBounds(332, 174, 56, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("/");
		lblNewLabel_4.setBounds(230, 154, 19, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_4);
		
		JLabel label = new JLabel("/");
		label.setBounds(290, 154, 19, 16);
		frmAddstaff.getContentPane().add(label);
		
		JLabel lblNewLabel_5 = new JLabel("Address :");
		lblNewLabel_5.setBounds(90, 259, 56, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_5);
		
		townField = new JTextField();
		townField.setBounds(297, 256, 91, 22);
		frmAddstaff.getContentPane().add(townField);
		townField.setColumns(10);
		
		streetField = new JTextField();
		streetField.setBounds(169, 256, 91, 22);
		frmAddstaff.getContentPane().add(streetField);
		streetField.setColumns(10);
		
		cityField = new JTextField();
		cityField.setBounds(419, 256, 91, 22);
		frmAddstaff.getContentPane().add(cityField);
		cityField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Street");
		lblNewLabel.setBounds(181, 237, 56, 16);
		frmAddstaff.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Town");
		lblNewLabel_6.setBounds(307, 237, 56, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("City");
		lblNewLabel_7.setBounds(430, 237, 56, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_7);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(90, 311, 56, 16);
		frmAddstaff.getContentPane().add(lblPhone);
		
		phoneNumberField = new JTextField();
		phoneNumberField.setBounds(307, 308, 116, 22);
		frmAddstaff.getContentPane().add(phoneNumberField);
		phoneNumberField.setColumns(10);
		
		countrycodeField = new JTextField();
		countrycodeField.setBounds(169, 308, 43, 22);
		frmAddstaff.getContentPane().add(countrycodeField);
		countrycodeField.setColumns(10);
		
		citycodeField = new JTextField();
		citycodeField.setBounds(241, 308, 43, 22);
		frmAddstaff.getContentPane().add(citycodeField);
		citycodeField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Salary :");
		lblNewLabel_8.setBounds(90, 349, 56, 16);
		frmAddstaff.getContentPane().add(lblNewLabel_8);
		
		SalaryField = new JTextField();
		SalaryField.setBounds(168, 346, 83, 22);
		frmAddstaff.getContentPane().add(SalaryField);
		SalaryField.setColumns(10);
		
		JButton btnAddAppointment = new JButton("  ADD");
		btnAddAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				Phone ph = new Phone(countrycodeField.getText(), 
						citycodeField.getText(), 
						phoneNumberField.getText());
				Address ad=new Address(streetField.getText(),townField.getText(),cityField.getText());
				Date d =new Date(dayField.getText(),monthField.getText(),yearField.getText());
				boolean admessage=ad.isStatus(streetField.getText(), townField.getText(), cityField.getText());
				boolean phmessage=ph.isStatus(countrycodeField.getText(), 
						citycodeField.getText(), 
						phoneNumberField.getText());
				boolean dmessage=d.isStatus(dayField.getText(),monthField.getText(),yearField.getText());
				String name=NameField.getText();
				String surname=SurnameField.getText();
				String str=null;
				int salary=2020;
				str=SalaryField.getText();
				if(!str.equals("")) {
					salary=Integer.parseInt(str);
				}

				if(type==1) {
					//Doctor Ekleme
					Doctor dc=new Doctor(NameField.getText(),SurnameField.getText(), ad, d, ph, salary);
					if(admessage && phmessage && dmessage && !name.equals("") && !surname.equals(""))
					{
						Login.hms.addDoctor(dc);
						JOptionPane.showMessageDialog(frmAddstaff, "Successfully added!");
					}
					else
					{
						JOptionPane.showMessageDialog(frmAddstaff, "Error! All blank must be fill");

					}
				}
				else if(type==2) {
					//Nurse Ekleme
					Nurse nr=new Nurse(NameField.getText(),SurnameField.getText(), ad, d, ph, salary);
					if(admessage && phmessage && dmessage && !name.equals("") && !surname.equals(""))
					{
						Login.hms.addNurse(nr);
						JOptionPane.showMessageDialog(frmAddstaff, "Successfully added!");
					}
					else
					{
						JOptionPane.showMessageDialog(frmAddstaff, "Error! All blank must be fill");

					}
			
				}
				else if(type==3) {
					//Receptionist Ekleme
					Receptionist rp=new Receptionist(NameField.getText(), SurnameField.getText(), ad, d, ph, salary);
					if(admessage && phmessage && dmessage && !name.equals("") && !surname.equals(""))
					{
						Login.hms.addReceptionist(rp);
						JOptionPane.showMessageDialog(frmAddstaff, "Successfully added!");
					}
					else
					{
						JOptionPane.showMessageDialog(frmAddstaff, "Error! All blank must be fill");

					}
					
				}
				else if(type==4) {
					// Patient ekleme
				
					Patient p = new Patient(NameField.getText(), 
							SurnameField.getText(), 
							ad,d, ph);			
					
					if(admessage && phmessage && dmessage && !name.equals("") && !surname.equals(""))
					{
						Login.hms.addPatient(p);
						JOptionPane.showMessageDialog(frmAddstaff, "Successfully added!");
					}
					else
					{
						JOptionPane.showMessageDialog(frmAddstaff, "Error! All blank must be fill");

					}
				}
				else {
					
				}
									
		
			}
		});
		btnAddAppointment.setBounds(241, 406, 91, 25);
		frmAddstaff.getContentPane().add(btnAddAppointment);
		
		
		
	}
}
