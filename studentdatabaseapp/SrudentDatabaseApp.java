package studentdatabaseapp;

import java.util.Scanner;

public class SrudentDatabaseApp {

	public static void main(String[] args) {
		
		
		//Ask how many new users we want to add
		System.out.print("Enter the number of students you want to add: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Student stu[]=new Student[n];
		//Create n number of new students
		for(int i=0;i<n;i++)
		{
			stu[i]=new Student();
			stu[i].Enroll();
			stu[i].payBalance();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(stu[i].showInfo());
		}
		
	}

}
