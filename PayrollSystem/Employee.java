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

// Java core packages
import java.text.DecimalFormat;

public abstract class Employee {
	
	//Initialize variables
	private int employeeId = 0;
	private static int counter = 1000;
	private String firstName;
    private String lastName;
    LocalDate joinDate = new LocalDate(); 	
    LocalDate now = LocalDate.now();		// Current date object for 5 year check
    
    DecimalFormat precision2 = new DecimalFormat("0.00");

    // Constructor
    public Employee(String first, String last, String date) {
        firstName = first;
        lastName = last;
        joinDate = LocalDate.parse(date); // Parse the date into (year, month, day) joinDate object 
        employeeId = counter;
        counter++;
    }
    // getter methods 
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
    
    // Builds string with basic employee details
    public String toString() {
        return firstName + ' ' + lastName + " ID: " + employeeId  + " - ";
    } 
    
    public double getMinimumWage() {
    	return 40*10;
    }
    

    public abstract double earnings() throws PayrollException;
    
    // getPayroll method to check if employee is entitled to bonus and if they are under paid 
    //	
      
  
    public String getPayroll() throws PayrollException{
    	String payroll = "";
    	Period period = new Period(now, joinDate);
    	long diff = Math.abs(period.getYears()); // calculate the difference between 
    											  // current date and employee join date
    	
    	// Try block where exception is possible
    	try {
	    	double weeklyPay = earnings();
	    	String employee = toString();
	    	
	    	// Checking if the employee earns minimum wage before €50 bonus
	    	if(weeklyPay < getMinimumWage()) {
	    		throw new PayrollException(employee);
	    	}
	    	
	    	//Checks if employee is entitled to 5 year bonus
	    	if(diff > 5) {
	    			weeklyPay += 50;
	    	} 
	    	
	    	// Build string of employee and their wages
	    	payroll = toString() + " earned: $" 
	    				+ precision2.format(weeklyPay) + "\n";
	    	
	    	return payroll;
	   
	    // Handles exceptions that are thrown, returns details of error
    	}catch(PayrollException exp) {
	    	payroll = exp.toString();
	    	return payroll;
    	}
    }
}
