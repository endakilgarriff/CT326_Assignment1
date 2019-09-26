/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

public class PayrollException extends Exception{

//	String underpaid;
	
	//User defined exception which is thrown if the employee is not earning above €10 per hour
	PayrollException(String employee){
		super(employee);
	}
	
}
