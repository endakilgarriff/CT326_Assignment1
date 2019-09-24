/* Name: Enda Kilgarriff
 * Student ID: 17351606
 */

// PieceWorker class derived from Employee

public final class PieceWorker extends Employee {

    private double wagePerPiece; // wage per piece output
    private int quantity; // output for week

    // constructor for class PieceWorker
    public PieceWorker(String first, String last, String joinDate,
            double wage, int numberOfItems) {
        super(first, last, joinDate); // call superclass constructor
        setWage(wage);
        setQuantity(numberOfItems);
    }

    // set PieceWorker's wage
    public void setWage(double wage) {
        wagePerPiece = (wage > 0 ? wage : 0);
    }

    // set number of items output
    public void setQuantity(int numberOfItems) {
        quantity = (numberOfItems > 0 ? numberOfItems : 0);
    }

    // determine PieceWorker's earnings
    public double earnings() throws PayrollException {
    	double wagePerHour = (quantity * wagePerPiece)/40;
    	if(wagePerHour < getMinimumWage()) {
    		throw new PayrollException(toString() + ' ' + "cannot earn less than €10 per hour. Please resolve this issue \n");
    	}
    	return quantity * wagePerPiece;
    }

    public String toString() {
        return "Piece worker: " + super.toString();
    }
}
