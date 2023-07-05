package oop_project;


public class HospitalManagementSystem  
{	//Attribute
	  private Doctor [ ] doctors=new Doctor[50];
	  private static int doctorcount=0;

	private Patient [ ] patients=new Patient[3];
	  private static int patientcount=0;
	  private Nurse [ ] nurses=new Nurse[70];
	  private static int nursecount=0;
	  private Receptionist [ ] consultant =new Receptionist[10];
	  private static int consultcount=0;
		//Functions	
	  public void dischargeThePatient(int PatientID){}	 
	  public double calculateTotalSalary(){
		return 0; }	 
	  
	  //Delete method
	  public String deleteDoctor(String name,String surname) {
		  if(name.equals("") || surname.equals("") ) {
			  return "fill the blank please !";
		  }
		  for (int i = 0; i < doctors.length; i++) {
				if(doctors[i].getName().equals(name) && doctors[i].getSurname().equals(surname)) {
					doctors[i].setName("");
					doctors[i].setSurname("");doctors[i].getAddress().setCity("");
					doctors[i].getAddress().setStreet("");doctors[i].getAddress().setTown("");
					doctors[i].getBirthdate().setDay("");doctors[i].getBirthdate().setMonth("");
					doctors[i].getBirthdate().setYear("");
					doctors[i].getPhoneNumber().setCityCode("");doctors[i].getPhoneNumber().setCountryCode("");
					doctors[i].getPhoneNumber().setPhoneNumber("");
					doctors[i].setSalary(0);
					return "The doctor record has been deleted.";
				}
			  }
		return "there is no such staff.";
	  }
	  public String deleteNurse(String name,String surname) {
		  if(name.equals("") || surname.equals("") ) {
			  return "fill the blank please !";
		  }
		  for (int i = 0; i < nurses.length; i++) {
				if(nurses[i].getName().equals(name) && nurses[i].getSurname().equals(surname)) {
					nurses[i].setName("");
					nurses[i].setSurname("");nurses[i].getAddress().setCity("");
					nurses[i].getAddress().setStreet("");nurses[i].getAddress().setTown("");
					nurses[i].getBirthdate().setDay("");nurses[i].getBirthdate().setMonth("");
					nurses[i].getBirthdate().setYear("");
					nurses[i].getPhoneNumber().setCityCode("");nurses[i].getPhoneNumber().setCountryCode("");
					nurses[i].getPhoneNumber().setPhoneNumber("");nurses[i].setSalary(0);
					return "The nurse record has been deleted.";
				}
			  }
		  return "there is no such staff.";
	  }
	  public String deleteReceptionist(String name,String surname) {
		  if(name.equals("") || surname.equals("") ) {
			  return "fill the blank please !";
		  }
		  for (int i = 0; i < consultant.length; i++) {
				if(consultant[i].getName().equals(name) && consultant[i].getSurname().equals(surname)) {
					consultant[i].setName("");
					consultant[i].setSurname("");consultant[i].getAddress().setCity("");
					consultant[i].getAddress().setStreet("");consultant[i].getAddress().setTown("");
					consultant[i].getBirthdate().setDay("");consultant[i].getBirthdate().setMonth("");
					consultant[i].getBirthdate().setYear("");
					consultant[i].getPhoneNumber().setCityCode("");consultant[i].getPhoneNumber().setCountryCode("");
					consultant[i].getPhoneNumber().setPhoneNumber("");consultant[i].setSalary(0);
					return "The receptionist record has been deleted.";
				}
			  }
		  return "there is no such staff.";
	  }
	  public String deletePatient(String name,String surname) {
		  if(name.equals("") || surname.equals("") ) {
			  return "fill the blank please !";
		  }
		  for (int i = 0; i < patients.length; i++) {
			  if(!patients[i].getName().equals("") && !patients[i].getSurname().equals("")) {
				  if(patients[i].getName().equals(name) && patients[i].getSurname().equals(surname)) {
						patients[i].setName("");
						patients[i].setSurname("");patients[i].getAddress().setCity("");
						patients[i].getAddress().setStreet("");patients[i].getAddress().setTown("");
						patients[i].getBirthdate().setDay("");patients[i].getBirthdate().setMonth("");
						patients[i].getBirthdate().setYear("");
						patients[i].getPhoneNumber().setCityCode("");patients[i].getPhoneNumber().setCountryCode("");
						patients[i].getPhoneNumber().setPhoneNumber("");
						return "The patient record has been deleted.";
					}
			  }
				
				
			  }
		  return "there is no such person.";
	  }
	  
	  //Find method
	  public Patient findPatient(String name)  { 
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getName().equals(name)) {
				return patients[i];
			}
		}
		return null;
	 }
	
	  public Doctor findDoctor(int ID)  {  
		 for (int i = 0; i < doctors.length; i++) {
			if(doctors[i].getId()==ID) {
				return doctors[i];
			 }
		  }
		 return null;
	   }
	 
	 
	  public Doctor findDoctorN(String name)  {
		 for (int i = 0; i < doctors.length; i++) {
				if(doctors[i].getName().equalsIgnoreCase(name)) {
					return doctors[i];
				}
			}
			 return null;
	 }	 
 
	 
	  
	//ADD METHOD
	 	public void addDoctor(Doctor d) {
		 doctors[getDoctorcount()]=d;
		 setDoctorcount(getDoctorcount()+1);
	 	} 
	 	public void addNurse(Nurse n){
		 nurses[ getNursecount()]=n;
		 setNursecount(getNursecount()+1);
	 	}
	 	public void addReceptionist(Receptionist r) {
	 		consultant[getConsultcount()]=r;
	 		setConsultcount(getConsultcount()+1);
		 	}
	 	public void addPatient(Patient p){
	 		patients[getPatientcount()]=p;
	 		setPatientcount(getPatientcount()+1);
		 	}
	 	
	
	
	 	//List Method
	 	public String listDoctors() {
	 		String str="";
	         for(int i=0;i<doctors.length;i++){
	        	 if(doctors[i]!=null) {
	        		 str+= doctors[i].toString()+ "\n";
	        	 } 
	         }
	         if(!str.contains("Doctor")) {
	 				return "there is no one on the list.";
	 			}
	         return str;
	         }	
	 	public String listNurses() {
	 		String str="";
	 		for(int i=0;i<nurses.length;i++){
	 			 if(nurses[i]!=null) {
	        		 str+= nurses[i].toString()+ "\n";
	        	 } 
	        }
	 		if(!str.contains("Nurse")) {
 				return "there is no one on the list.";
 			}
			return str;
	 	}
	 	public String listReceptionist() {
	 		String str="";
	         for(int i=0;i<consultant.length;i++){
	        	 if(consultant[i]!=null) {
	        		 str+= consultant[i].toString()+ "\n";
	        	 } 
	         }
	         if(!str.contains("Receptionist")) {
	 				return "there is no one on the list.";
	 			}
	         return str;
	         }	
	 	public String listPatients() { 
	 		String str="";
	 		for(int i=0;i<patients.length;i++){
	 			if(patients[i]!=null) {
	 				str+=patients[i].toString() + "\n";
	 			}

	         }
	 		if(!str.contains("Patient")) {
 				return "there is no one on the list.";
 			}
			return str;
	 	}	
	 	  		public int getPatientcount() {
	 	  			return patientcount;
	 			}
	 			public void setPatientcount(int patientcount) {
	 				HospitalManagementSystem.patientcount = patientcount;
	 			}
	 		 	public static int getDoctorcount() {
	 				return doctorcount;
	 			}
	 			public static void setDoctorcount(int doctorcount) {
	 				HospitalManagementSystem.doctorcount = doctorcount;
	 			}
	 			public static int getNursecount() {
	 				return nursecount;
	 			}
	 			public static void setNursecount(int nursecount) {
	 				HospitalManagementSystem.nursecount = nursecount;
	 			}
				public static int getConsultcount() {
					return consultcount;
				}
				public static void setConsultcount(int consultcount) {
					HospitalManagementSystem.consultcount = consultcount;
				}

}

