
public class PayrollException extends Exception{

	private String underpayed;
	
	PayrollException(String underpayedException){
		underpayedException = underpayed;
	}
	
	public String toString() {
		return (underpayed + " is earning less than €10 an hour. This is illegal and should be resolved immediatly") ;
	}
}
