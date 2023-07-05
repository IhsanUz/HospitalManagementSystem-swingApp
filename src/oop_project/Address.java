package oop_project;

public class Address //Class 
{	 private String street;
 	 private String town;
 	 private String city;
 	
 	 public Address(String street, String town, String city) {
 		 this.street=street;
 		 this.town=town;
 		 this.city=city;
 	 } //Constructor
  	 public String getStreet() {
		return street; }
 	 public void setStreet(String street){
 		 this.street=street;
 	 }
  	 public String getTown() {
		return town; }
  	 public void setTown(String town) {
  		 this.town=town;
  	 }
 	 public String getCity() {
		return city; }
 	 public void setCity(String city) {
 		 this.city=city;
 	 }
 	 public  boolean isStatus(String street, String town, String city) {
 		 if(street.equals("") &&town.equals("") && city.equals("")) {
 			 return false;
 		 }
		return true;
 		 
 	 }
 	
}
