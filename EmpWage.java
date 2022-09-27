package org.Empexample;

import java.util.*;

public class EmpWage {
	Random rd = new Random();
	
	int wagePerHours = 20;
	int fullDayHours = 8;
	int wage =160;
	int partTimeHours = 3;
	int workingDays = 0;
	int hours = 0;
	int total = 0;
	
	public void empWage() {
		while (workingDays<20 && hours<100) {
			int attendance = rd.nextInt(2);
			
			if (hours == 90) {
			hours += partTimeHours;
			total = hours * wagePerHours;
			System.out.println(hours);
			System.out.println(total);
			System.exit(0);
			}
			if (attendance == 1) {
				int work = rd.nextInt(2);
				if (work == 1) {
					workingDays++;
					
				}else if (work == 0) {
					hours += partTimeHours;
					
				}
				
				
			}
		}System.out.println(workingDays);
		System.out.println(hours);
		
		if (workingDays == 20) {
			total = workingDays * wage;
			
		} else if (hours<=100) {
			total = hours * wagePerHours;
		} System.out.println(total);
	}

}
