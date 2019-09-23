/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Driver for Employee hierarchy

// Java core packages
import java.text.DecimalFormat;
//import java.util.ArrayList;

// Java extension packages
import javax.swing.JOptionPane;

public class Test {

    // test Employee hierarchy
    public static void main(String args[]) throws Exception {
        Employee employee; // superclass reference
        String output = "";
        Employee[] employeeArray = new Employee[5];
//        ArrayList<Employee> employeeArray = new ArrayList<Employee>();
        
//        Boss boss = new Boss("John", "Smith", "2011-06-17", 800.0);
//
//        CommissionWorker commissionWorker =
//                new CommissionWorker( "Sue", "Jones", "2013-02-14", 400.0, 3.0, 150);
//
//        PieceWorker pieceWorker =
//                new PieceWorker("Bob", "Lewis", "2017-11-03", 2.5, 200);
//
//        HourlyWorker hourlyWorker =
//                new HourlyWorker("Karen", "Price", "2014-01-13", 13.75, 40);
//        
//        CommissionWorker underpaidWorker = new
//        		CommissionWorker("UnderPaid", "Employee", "2019-09-21", 150, 1, 150);
        DecimalFormat precision2 = new DecimalFormat("0.00");
        
        // Add existing employees to array 
        employeeArray[0] = new Boss("John", "Smith", "2011-06-17", 800.0);
        employeeArray[1] = new PieceWorker("Bob", "Lewis", "2017-11-03", 2.5, 200);
        employeeArray[2] = new CommissionWorker( "Sue", "Jones", "2013-02-14", 400.0, 3.0, 150);
        employeeArray[3] = new HourlyWorker("Karen", "Price", "2014-01-13", 13.75, 40);
        employeeArray[4] = new CommissionWorker("UnderPaid", "Employee", "2019-09-21", 150, 1, 150);
//        employeeArray.add(boss);
//        employeeArray.add(commissionWorker);
//        employeeArray.add(pieceWorker);
//        employeeArray.add(hourlyWorker);
//        employeeArray.add(underpaidWorker);
        
        // Calculate the weekly payroll for each employee
        for(Employee worker :employeeArray) {
        	employee = worker;
        	try {
        	double weeklyPay = employee.earnings();
//	        	if(employee.getJoinDate().getYear() > 5) {
        	if(employee.getJoinDate().getYear() > 5) {
	        		weeklyPay += 50;
	        	}
	        	
	    	    // Assemble string for each employee    
	            output += employee.toString() + " earned $"
	                      + precision2.format(weeklyPay) + "\n";
	            
        	}
        	catch(Exception exception) {
        		System.out.println(exception);
        	}
        }
        
        // Dialog box with employee names and wage details
        JOptionPane.showMessageDialog(null, output,
                "Demonstrating Polymorphism",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // end class Test
