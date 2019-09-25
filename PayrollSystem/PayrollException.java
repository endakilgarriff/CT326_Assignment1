/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

public class PayrollException extends Exception{

	String underpaid;
	
	//User defined exception which is thrown if the employee is not earning above €10 per hour
	PayrollException(String employee){
		underpaid = employee;
	}
	
	public String toString() {
		// Creates string with employee details and the error that has occurred
		return (underpaid + " is earning less than €10 an hour. This should be resolved immediatly \n") ;
	}
}
