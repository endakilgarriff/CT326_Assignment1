/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Java extension packages
import javax.swing.JOptionPane;

public class Test {

    // test Employee hierarchy
    public static void main(String args[]) throws Exception {
        String output = "";
        Employee[] employeeArray = new Employee[6];
        
        // Add existing employees to array 
        employeeArray[0] = new Boss("John", "Smith", "2011-09-02", 800.0);
        employeeArray[1] = new PieceWorker("Bob", "Lewis", "2017-02-04", 2.5, 200);
        employeeArray[2] = new CommissionWorker( "Sue", "Jones", "2013-02-14", 400.0, 3.0, 150);
        employeeArray[3] = new CommissionWorker("Jack", "Daniels", "2019-09-21", 150, 1, 150);
        employeeArray[4] = new HourlyWorker("Karen", "Price", "2014-01-13", 13.75, 40);
        employeeArray[5] = new HourlyWorker("Arthur", "Guinness", "2013-09-21", 9.5, 40);
        
        	     // Calculate the weekly payroll for each employee
    	        for(Employee employee :employeeArray) {
    	        	output += employee.getPayroll();	
    	        }
        
        // Dialog box with employee names and wage details
        JOptionPane.showMessageDialog(null, output,
                "Payroll",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // end class Test
