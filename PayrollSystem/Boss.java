/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Boss class derived from Employee.

public final class Boss extends Employee {

	private double weeklySalary;

	// constructor for class Boss
	public Boss(String first, String last, String joinDate, double salary) {
		super(first, last, joinDate); // call superclass constructor
		setWeeklySalary(salary);
	}

	// set Boss's salary
	public void setWeeklySalary(double salary) {
		weeklySalary = (salary > 0 ? salary : 0);
	}

	// get Boss's pay
	public double earnings() throws PayrollException {
		return weeklySalary;
	}

	// get String representation of Boss's name
	public String toString() {
		return "Boss: " + super.toString();
	}
} // end class Boss
