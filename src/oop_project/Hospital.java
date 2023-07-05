package oop_project;


import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class Hospital  {

	private JFrame frmHospital;
	private Details dt;
	

	public Hospital() {
		
		
		frmHospital = new JFrame();
		frmHospital.getContentPane().setBackground(Color.ORANGE);
		frmHospital.setTitle("Hospital Details");
		frmHospital.setBounds(100, 100, 505, 414);		
		frmHospital.getContentPane().setLayout(null);
		
		JRadioButton rdbtnDoctorDetail = new JRadioButton("Doctor Details");
		rdbtnDoctorDetail.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnDoctorDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnDoctorDetail.isSelected())
				{
					dt = new Details(frmHospital,1);
					dt.getFrmDetails().setVisible(true);
					frmHospital.setVisible(false);
				}						
			}
		});
		rdbtnDoctorDetail.setBounds(70, 98, 127, 25);
		frmHospital.getContentPane().add(rdbtnDoctorDetail);
		
		JRadioButton rdbtnNurseDetail = new JRadioButton("Nurse Details");
		rdbtnNurseDetail.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnNurseDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNurseDetail.isSelected())
				{
					dt = new Details(frmHospital,2);
					dt.getFrmDetails().setVisible(true);
					frmHospital.setVisible(false);
				}
			}
		});
		rdbtnNurseDetail.setBounds(70, 142, 127, 25);
		frmHospital.getContentPane().add(rdbtnNurseDetail);
		
		JRadioButton rdbtnReceptionistDetail = new JRadioButton("Receptionist Details");
		rdbtnReceptionistDetail.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnReceptionistDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnReceptionistDetail.isSelected())
				{
					dt = new Details(frmHospital,3);
					dt.getFrmDetails().setVisible(true);
					frmHospital.setVisible(false);
				}
			}
		});
		rdbtnReceptionistDetail.setBounds(70, 190, 152, 25);
		frmHospital.getContentPane().add(rdbtnReceptionistDetail);
		
		JRadioButton rdbtnPatientDetail = new JRadioButton("Patient Details");
		rdbtnPatientDetail.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnPatientDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPatientDetail.isSelected())
				{
					dt = new Details(frmHospital,4);
					dt.getFrmDetails().setVisible(true);
					frmHospital.setVisible(false);
				}			
			}
		});
		rdbtnPatientDetail.setBounds(70, 245, 127, 25);
		frmHospital.getContentPane().add(rdbtnPatientDetail);
		
		JRadioButton rdbtnExit = new JRadioButton("EXIT");
		rdbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
					System.exit(0);			
			}
		});
		rdbtnExit.setFont(new Font("Blackadder ITC", Font.PLAIN, 20));
		rdbtnExit.setBounds(178, 309, 127, 25);
		frmHospital.getContentPane().add(rdbtnExit);
		
		JLabel lblNewLabel = new JLabel("  DETAIL PANE");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 16));
		lblNewLabel.setBounds(156, 58, 212, 31);
		frmHospital.getContentPane().add(lblNewLabel);
		
		
		
	}
	public JFrame getFrmHospital() {
		return frmHospital;
	}
	public void setFrmHospital(JFrame frmHospital) {
		this.frmHospital = frmHospital;
	}
}
