package org.Empexample;
import java.util.*;

public class Attendance {
	Random rd = new Random();
	
	int present;
	
	 public int Attendance() {
		 present = rd.nextInt(3);
		 
		switch (present) {
		case 0:
			System.out.println("Emp is Absent");
			break;
		case 1:
			System.out.println("Emp is Worked Part Time");
			break;
		case 2:
			System.out.println("Emp is Worked Full Time");
			break;
		
		
		}return present;
	 
	 }
	
	
}
