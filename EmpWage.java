package org.Empexample;

public class EmpWage {
	
	int wagePerHours = 20;
	int fullDayHours = 8;
	int wage = 0;
	int partTimeHours = 3;
	
	public void empWage(int present) {
		if (present == 0) {
			wage = wagePerHours*present;
			System.out.println("Wage is :" + wage);
		}else if(present == 1) {
			wage = wagePerHours*partTimeHours;
			System.out.println("wage is :"+ wage);
			
		}else if (present == 2) {
			wage = wagePerHours*fullDayHours;
			System.out.println("Wage is : " + wage);
		}
	}

}
