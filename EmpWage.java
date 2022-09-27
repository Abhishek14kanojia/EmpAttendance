package org.Empexample;

public class EmpWage {
	
	int wagePerHours = 20;
	int fullDayHours = 8;
	int wage = 0;
	int partTimeHours = 3;
	int workingDays = 20;
	
	public void empWage(int present) {
		switch (present) {
		case 0:
			wage = wagePerHours*present;
			System.out.println("Wage is :" + wage);
			break;
		case 1:
			wage = wagePerHours*partTimeHours;
			System.out.println("wage is : " + wage);
			break;
		case 2:
			wage = wagePerHours*fullDayHours;
			System.out.println("Wage is : " + wage);
			break;
		
			
		} workingDays = workingDays*wage;
		System.out.println("20_WorkingDays is : " + workingDays);
	}

}
