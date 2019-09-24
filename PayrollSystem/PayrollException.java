
public class PayrollException extends Exception{

	String underpaid;
	
	PayrollException(String employee){
		underpaid = employee;
	}
	
	public String toString() {
		return (underpaid + " is earning less than €10 an hour. This should be resolved immediatly \n") ;
	}
}
