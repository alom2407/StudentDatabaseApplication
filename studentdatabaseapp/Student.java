package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student first name: ");
		this.firstName=scan.nextLine();
		
		System.out.println("Enter Student last name: ");
		this.lastName=scan.nextLine();
		
		System.out.print("CLASS LEVEL CODE \n1 - Freshmen\n2 - Sophmore\n3 - Junior \n4 - Senior \nEnter Student class level: ");
		this.gradeYear=scan.nextInt();
		
		//scan.close();
		setStudentID();
		
	}
	//Generate an ID
	
	private void setStudentID() {
		//grade Level + ID
		id++;
		this.studentID= gradeYear+""+id;
	}
	
	//Enroll in courses
	public void Enroll()
	{
		Scanner in=new Scanner(System.in);
		String choice="";
		System.out.print("\nCOURSE CODE\nHistory 101 : H \n"
				+ "Mathematics 101 : M\n"
				+ "English 101 : E\n"
				+ "Chemistry 101: C\n"
				+ "Computer Science 101 Com\n"
				+ "Enter Q to quit : \n");
		while(true)
		{
			System.out.print("Enter the Course Code: ");
			choice=in.nextLine();
			
			if (choice.equals("H")) {
				this.courses+="History 101\n";
				this.tuitionBalance+=costOfCourse;
			}
			else if(choice.equals("M")) {
				this.tuitionBalance+=costOfCourse;
				this.courses+="Mathematics 101\n";
			}
			else if(choice.equals("E"))
				{
				this.tuitionBalance+=costOfCourse;
				this.courses+="English 101\n";
				}
			else  if(choice.equals("C")) {
				this.tuitionBalance+=costOfCourse;
				this.courses+="Chemistry 101\n";
			}
			else if(choice.equals("Com")) {
				this.tuitionBalance+=costOfCourse;
				this.courses+="Computer Science 101\n";
			}
			else if(choice.equals("Q")){
				//in.close();
				break;
			}
			else System.out.println("*************Invalid code please enter agains************");
		}
		
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your Tuition Balance is $"+tuitionBalance);
	}
	//Pay Tuition
	public void payBalance()
	{
		viewBalance();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Amount of payment you like to pay: $");
		int payment=in.nextInt();
		tuitionBalance-=payment;
		System.out.println("Thank You for your payment of $"+payment);
		viewBalance();
	}
	//Show status
	public String showInfo()
	{
		return "Name: "+this.firstName+" "+this.lastName+
				"\nGrade Level: "+this.gradeYear+
				"\nStudent ID: "+this.studentID+
				"\nCouses Enrolled: "+this.courses+
				"\nBalance: $"+this.tuitionBalance;
	}
	
}
