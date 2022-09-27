package org.Empexample;

public class Main {

	public static void main(String[] args) {
		int present;
		Attendance attendance = new Attendance();
		
		present = attendance.Attendance();
		EmpWage empwage1 = new EmpWage();

		empwage1.empWage(present);
		
		 
	} 

}
