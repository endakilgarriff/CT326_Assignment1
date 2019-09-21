/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Abstract base class Employee.

// Joda-time LocalDate Library
import org.joda.time.LocalDate;

public abstract class Employee {

	private String firstName;
    private String lastName;
    LocalDate joinDate = new LocalDate();
    private static int employeeId = 0; 
    private int counter = 0;
    private double minimumWage = 10;

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
        return firstName + ' ' + lastName;
    }
    
    public int getNumEmployees() {
    	return counter;
    }
    
    public double getMinimumWage() {
    	return minimumWage;
    }
    
    public abstract double earnings() throws Exception;

}
