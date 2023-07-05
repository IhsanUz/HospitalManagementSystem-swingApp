package oop_project;


public class Doctor  
{	
//Attributes
  private static int id=0;  
  private String Name;
  private String Surname;
  private Address address;
  private Date birthdate;
  private Phone phoneNumber;
  private int salary; 	
  String operationInfo;
  String op;
  String operationResult;

	
  
 	public Doctor(String name, String surname, Address address, Date birthdate, Phone phoneNumber, int salary) {
	
 		this.Name = name;
 		this.Surname = surname;
 		this.address = address;
 		this.birthdate = birthdate;
 		this.phoneNumber = phoneNumber;
 		this.setSalary(salary);
 		setId(id+1);
 		this.id=id;
 		
 	}
	public int getId() {
		return id; }
  	public void setId(int id) {
  		Doctor.id=id;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
		
		return "Doctor "+"id: "+getId()+"[ Name= " + getName() + "Surname= " + getSurname()+ ", address= " +  address.getStreet()+" " +address.getTown()+" " +address.getCity()+" "+", "
				+ "birthdate=" + birthdate.getDay() +birthdate.getMonth() +birthdate.getYear() + ", phoneNumber="+ phoneNumber.getPhoneNumber() + "]";
	}
	
  	
  	
  	
  	
  	
}
		
	
	
	
 

 