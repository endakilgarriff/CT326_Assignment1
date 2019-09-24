/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Abstract base class Employee.

/* Joda-time Library
 * NOTE : LocalDate and Period have been part of java.time library
 * 		  since Java 8. This could have been used but joda.time 
 * 		  was the requested library.
 */		  	
import org.joda.time.LocalDate;
import org.joda.time.Period;

import java.text.DecimalFormat;

public abstract class Employee {
	private int employeeId = 0;
	private static int counter = 0;
	private String firstName;
    private String lastName;
    LocalDate joinDate = new LocalDate();
    LocalDate now = LocalDate.now();

    private double minimumWage = 10;
    
    DecimalFormat precision2 = new DecimalFormat("0.00");

    // Constructor
    public Employee(String first, String last, String date) {
        firstName = first;
        lastName = last;
        joinDate = LocalDate.parse(date); 
        counter++;
        employeeId = counter;
    }
    
    // get Employee ID
    public int getEmployeeId() {
    	return employeeId;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }
    
    // get join date
    public LocalDate getJoinDate() {
    	return joinDate;
    }

    public String toString() {
        return "Employee ID: " + employeeId + ' ' +firstName + ' ' + lastName;
    }
    
    public int getNumEmployees() {
    	return counter;
    }
    
    public double getMinimumWage() {
    	return minimumWage;
    }
    
    public abstract double earnings() throws PayrollException;
    
    public String getPayroll() throws PayrollException{
    	String payroll = "";
    	Period period = new Period(now, joinDate);
    	long diff = Math.abs(period.getYears());
    	
    	try {
	    		double weeklyPay = earnings();
	    		if(diff > 5) {
	    			weeklyPay += 50;
	    		}  
	    	payroll = toString() + " earned: $" 
	    		+ precision2.format(weeklyPay) + "\n";
	    	return payroll;
    	}
    	catch(PayrollException exp) {
    		
    	}
	    	return payroll;
    	}

}
