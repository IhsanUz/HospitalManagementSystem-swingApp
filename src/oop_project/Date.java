package oop_project;

public class Date //Class
{  	private String day;
 	 private String month;
 	 private String year;		
 	 public Date(String day, String month, String year){
 		 this.day=day;
 		 this.month=month;
 		 this.year=year;
 	 }	//Constructor
     public String getDay() {
	return day; }
 	 public void setDay(String day) {
 		 this.day=day;
 	 }
 	 public String getMonth() {
		return month; }
   	 public void setMonth(String month) {
   		 this.month=month;
   	 }
 	 public String getYear() {
		return year; 	}
 	 public void setYear(String year) {
 		 this.year=year;
 	 }
 	public  boolean isStatus(String day, String month, String year) {
 	
		 if(day.equals("") &&month.equals("") && year.equals("")) {
			 return false;
		 }
		return true;
		 
	 }
}
