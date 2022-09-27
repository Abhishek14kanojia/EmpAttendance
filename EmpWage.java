package org.Empexample;

public class EmpWage {
	
	int wagePerHours = 20;
	int fullDayHours = 8;
	int wage = 0;
	
	public void empWage(int present) {
		if (present == 1) {
			wage = wagePerHours*fullDayHours;
			System.out.println("Wage is :" + wage);
		}else {
			System.out.println("Wage is :" + wage);
			
		}
	}

}
