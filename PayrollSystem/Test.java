/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Driver for Employee hierarchy

// Java core packages
import java.text.DecimalFormat;
import java.util.ArrayList;

// Java extension packages
import javax.swing.JOptionPane;

public class Test {

    // test Employee hierarchy
    public static void main(String args[]) {
        Employee employee; // superclass reference
        String output = "";
        ArrayList<Employee> employeeArray = new ArrayList<Employee>();
        
        Boss boss = new Boss("John", "Smith", "2011-06-17", 800.0);

        CommissionWorker commissionWorker =
                new CommissionWorker(
                "Sue", "Jones", "2013-02-14", 400.0, 3.0, 150);

        PieceWorker pieceWorker =
                new PieceWorker("Bob", "Lewis", "2017-11-03", 2.5, 200);

        HourlyWorker hourlyWorker =
                new HourlyWorker("Karen", "Price", "2014-01-13", 13.75, 40);

        DecimalFormat precision2 = new DecimalFormat("0.00");
        
        employeeArray.add(boss);
        employeeArray.add(commissionWorker);
        employeeArray.add(pieceWorker);
        employeeArray.add(hourlyWorker);
        
        for(Employee worker :employeeArray) {
        	employee = worker;
        	double weeklyPay = employee.earnings();
	        	if(employee.getJoinDate().getYear() > 5) {
	        		weeklyPay += 50;
	        	}
        	output += employee.toString() + " earned $"
                  + precision2.format(weeklyPay) + "\n";
        }
        
        JOptionPane.showMessageDialog(null, output,
                "Demonstrating Polymorphism",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // end class Test
