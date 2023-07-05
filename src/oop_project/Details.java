package oop_project;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Details {

	private JFrame frmDetails;	
	private JButton btnExit;
	private AddStaff add;
	private DisplayInfo_and_Delete dýd;


	public Details(JFrame superF,int type) {
	
		
		frmDetails = new JFrame();		
		frmDetails.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmDetails.setTitle("INFORMATION MENU");
		frmDetails.setBounds(100, 100, 475, 412);
		frmDetails.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent et) {
				if(et.getSource()==btnAdd && type==1)
				{
					add = new AddStaff(frmDetails,1);
					add.getFrmAddstaff().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(et.getSource()==btnAdd && type==2)
				{
					add = new AddStaff(frmDetails,2);
					add.getFrmAddstaff().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(et.getSource()==btnAdd && type==3)
				{
					add = new AddStaff(frmDetails,3);
					add.getFrmAddstaff().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(et.getSource()==btnAdd && type==4)
				{
					add = new AddStaff(frmDetails,4);
					add.getFrmAddstaff().setVisible(true);
					frmDetails.setVisible(false);
				}
			}
		});
		btnAdd.setBounds(69, 73, 147, 34);
		frmDetails.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String s=null;
				if(evt.getSource()==btnDelete) {
					s="del";
				}
				if(s.equals("del") &&type==1)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,1,s);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(s.equals("del") && type==2)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,2,s);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(s.equals("del") && type==3)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,3,s);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(s.equals("del") && type==4)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,4,s);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				
			}
		});
		btnDelete.setBounds(69, 126, 147, 34);
		frmDetails.getContentPane().add(btnDelete);
		
		JButton btnList = new JButton("Display Info");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {
				String s1=null;
				if(ex.getSource()==btnList) {
					s1="list";
				}
				if(s1.equals("list") && type==1)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,1,s1);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(s1.equals("list") && type==2)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,2,s1);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(s1.equals("list") && type==3)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,3,s1);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				else if(s1.equals("list") && type==4)
				{
					dýd = new DisplayInfo_and_Delete(frmDetails,4,s1);
					dýd.getFrame().setVisible(true);
					frmDetails.setVisible(false);
				}
				
			}
		});
		btnList.setBounds(69, 173, 147, 34);
		frmDetails.getContentPane().add(btnList);
		
		btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Papyrus", Font.ITALIC, 18));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		btnExit.setBounds(165, 294, 128, 25);
		frmDetails.getContentPane().add(btnExit);
		frmDetails.addWindowListener(new WindowAdapter() {
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
		
		
		
		

	}
	public JFrame getFrmDetails() {
		return frmDetails;
	}


	public void setFrmDetails(JFrame frmDetails) {
		this.frmDetails = frmDetails;
	}

}
