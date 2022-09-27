package org.Empexample;
import java.util.*;

public class Attendance {
	Random rd = new Random();
	
	int present = 1;
	
	 public int Attendance() {
		 present = rd.nextInt(2);
		 
		 if (present == 1) {
			 System.out.println("Emp Present");
			 
		 } else {
			 System.out.println("Emp Not Present");
		 }
		return present;
	 
	 }
	
	
}
