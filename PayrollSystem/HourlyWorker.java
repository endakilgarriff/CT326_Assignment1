/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// Definition of class HourlyWorker

public final class HourlyWorker extends Employee {

    private double wage; // wage per hour
    private double hours; // hours worked for week
    private double wagePerHour;

    // constructor for class HourlyWorker
    public HourlyWorker(String first, String last, String joinDate,
            double wagePerHour, double hoursWorked) {
        super(first, last, joinDate); // call superclass constructor
        setWage(wagePerHour);
        setHours(hoursWorked);
        this.wagePerHour = wagePerHour;
    }

    // Set the wage
    public void setWage(double wagePerHour) {
        wage = (wagePerHour > 0 ? wagePerHour : 0);
    }

    // Set the hours worked
    public void setHours(double hoursWorked) {
        hours = (hoursWorked >= 0 && hoursWorked < 168
                ? hoursWorked : 0);
    }

    // Get the HourlyWorker's pay
    public double earnings() throws Exception {
    	if(wagePerHour < getMinimumWage()) {
    		throw new Exception("Hourly worker cannot earn less than €10 per hour");
    	}
        return  wage * hours;
    }
    

    public String toString() {
        return "Hourly worker: " + super.toString();
    }
}
