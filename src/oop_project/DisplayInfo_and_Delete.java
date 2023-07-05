package oop_project;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class DisplayInfo_and_Delete {

	private JFrame frame;
	private JTextField nametextField;
	private JTextField surnametextField;
	
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public DisplayInfo_and_Delete(JFrame superF, int type,String str) {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 717, 521);
		
		frame.addWindowListener(new WindowAdapter() {
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
		frame.getContentPane().setLayout(null);
			
		JPanel panel = new JPanel();
		panel.setBounds(81, 6, 503, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Name :");
		label.setBounds(12, 9, 60, 14);
		panel.add(label);
		
		nametextField = new JTextField();
		nametextField.setBounds(77, 6, 86, 20);
		nametextField.setColumns(10);
		panel.add(nametextField);
		
		JLabel label_1 = new JLabel("Surname:");
		label_1.setBounds(188, 9, 59, 14);
		panel.add(label_1);
		
		surnametextField = new JTextField();
		surnametextField.setBounds(257, 6, 86, 20);
		surnametextField.setColumns(10);
		panel.add(surnametextField);
		
		JTextArea Deleteresult = new JTextArea();
		Deleteresult.setBounds(137, 51, 556, 45);
		frame.getContentPane().add(Deleteresult);
		
		JTextArea DisplayResult = new JTextArea();
		DisplayResult.setBounds(12, 149, 681, 319);	
		frame.getContentPane().add(DisplayResult);
		
		JButton Deletebutton = new JButton("Delete");
		Deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent et) 
			{
				if(type==1 && str.equals("del")) {
					Deleteresult.setText(Login.hms.deleteDoctor(nametextField.getText(), surnametextField.getText()));
				
				}
				else if(type==2 && str.equals("del")) {
					Deleteresult.setText(Login.hms.deleteNurse(nametextField.getText(), surnametextField.getText()));
				}
				else if(type==3 && str.equals("del")) {
					Deleteresult.setText(Login.hms.deleteReceptionist(nametextField.getText(), surnametextField.getText()));
				}
				else if(type==4 && str.equals("del")) {
					Deleteresult.setText(Login.hms.deletePatient(nametextField.getText(), surnametextField.getText()));
				}	
				
			}
		});
		Deletebutton.setBounds(392, 5, 76, 23);
		panel.add(Deletebutton);
		
		JLabel lblNewLabel = new JLabel("DISPLAY RESULT");
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 15));
		lblNewLabel.setBounds(12, 131, 187, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Result :");
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(12, 49, 129, 47);
		frame.getContentPane().add(lblNewLabel_1);
	
		panel.setVisible(false);
		
		if(type == 1 && str.equals("list") )
		{
			DisplayResult.setText(Login.hms.listDoctors());
		}
		else if(type == 2 && str.equals("list"))
		{
			DisplayResult.setText(Login.hms.listNurses());
		}
		else if(type==3 && str.equals("list"))
		{
			DisplayResult.setText(Login.hms.listReceptionist());
			
			
		}
		else if(type==4 && str.equals("list")) {
			DisplayResult.setText(Login.hms.listPatients());
		}
		else {
			panel.setVisible(true);
		}
		
	}
}

