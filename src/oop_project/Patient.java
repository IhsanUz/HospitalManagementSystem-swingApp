package oop_project;

public class Patient 
{	 
	  private static int id=0;
	  private String Name;
	  private String Surname;
	  private Address address;
	  private Date birthdate;
	  private Phone phoneNumber;
	  private boolean sickness;
	  private int PatientRecipe ;	  	  			 
	 

	public Patient(String name, String surname, Address address, Date birthdate, Phone phoneNumber) {
		
		this.Name = name;
		this.Surname = surname;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
		setId(id+1);
	}

	public boolean isSickness() {
		return sickness;
	}


	public void setSickness(boolean sickness) {
		this.sickness = sickness;
	}

	public boolean OperationResult(boolean Op) {
		return Op;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}
	public int getPatientRecipe() {
		return PatientRecipe;
	}

	public void setPatientRecipe(int patientRecipe) {
		PatientRecipe = patientRecipe;
	}

	  public static int getId() {
			return id;
		}

		public static void setId(int id) {
			Patient.id = id;
		}
		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public Date getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(Date birthdate) {
			this.birthdate = birthdate;
		}

		public Phone getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(Phone phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
	@Override
	public String toString() {
		if(getName().equals("") && getSurname().equals("")) {
			return "";
		}
		else {
			return "Patient [Name= " + getName() + "Surname= " + getSurname()
			+ ", address= " +  address.getStreet()+" " +address.getTown()+" " +address.getCity()+" "+", "
			+ "birthdate=" + birthdate.getDay() +birthdate.getMonth() +birthdate.getYear()
			+ ", phoneNumber="+ phoneNumber.getPhoneNumber() + "]";
		}
		
	}



	
	

	
	
}

