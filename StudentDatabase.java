package oop;

public class StudentDatabase {

	public static void main(String[] args) {
		Student tim = new Student("Tim Hargass", "123456789");

	}
		
		
	}
	
class Student{
	private static int id = 0;
	private String name;
	private String ssn;
	private String email;
	private String userID;
	private String courses = "";
	private double balance = 0.00;
	private static double cost = 1250.75;
	
	public Student(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase()+"."+id+"@gmail.com";
		System.out.println("Email : "+email);
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int)(Math.random()*(max-min));
		userID=id+randNum+ssn.substring(6);
		System.out.println("User : "+userID);
	}
	
	public void enroll(String course) {
		this.courses = this.courses+", "+course;
		System.out.println(courses);
		balance += cost;
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public void checkBalance() {
		System.out.println("Balance : $"+balance);
	}
	
	public void pay(double num) {
		System.out.println("Payment of : $"+num);
		balance -= num;
	}
}
