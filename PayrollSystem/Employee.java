/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Abstract base class Employee.

// Joda-time LocalDate Library
import org.joda.time.LocalDate;
//import org.joda.time.format.DateTimeFormatter;


public abstract class Employee {

    private String firstName;
    private String lastName;
    LocalDate joinDate = new LocalDate();
    private static int employeeId = 0; 
    private int counter = 0;

    // constructor
    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
        counter++;
        employeeId = counter;
    }
    
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
    
    //Get start date object
    public String printJoinDate() {
    	String printJoinDate = joinDate.toString();
    	return printJoinDate;
    }
    
    public LocalDate getJoinDate() {
    	return joinDate;
    }

    public String toString() {
        return firstName + ' ' + lastName;
    }

    public abstract double earnings();
}
