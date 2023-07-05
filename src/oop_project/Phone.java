package oop_project;

public class Phone//Class
{		private String countryCode;
		private String cityCode;
		private String phoneNumber;	
		public Phone(String countryCode, String cityCode, String phoneNumber) {
			this.countryCode=countryCode;
			this.cityCode=cityCode;
			this.phoneNumber=phoneNumber;	
		}//Constructor
	//Getter and Setter Part
	public String getCountryCode() {
		return countryCode;}
	public void setCountryCode(String countryCode) {
		this.countryCode=countryCode;
	}
	public String getCityCode() {
		return cityCode;}
	public void setCityCode(String cityCode) {
		this.cityCode=cityCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public  boolean isStatus(String countryCode, String cityCode, String phoneNumber) {
		 if(countryCode.equals("") &&cityCode.equals("") && phoneNumber.equals("")) {
			 return false;
		 }
		 else {
			 return true;
		 }
		
		 
	 }
}
