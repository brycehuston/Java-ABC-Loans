
package abcloan.myloan;
/**
 * Sets up some getter/setters along with abstract methods
 */
public abstract class Loan implements LoanConstants {

    int loanNo;
    int loanAmount;
    int loanTerm;
    double loanInterest;
    String lastName;

    /**
     * This abstract method allows for business and personal loans
     *
     * @param id the id of the loan
     * @param amount the amount of the loan
     * @param term the term of the loan
     * @param last the last name of the person taking out the loan
     */
    abstract void CreateLoan(int id, int amount, int term, String last);

    /**
     * Converts the toString into one that displays important information
     * regarding loans
     */
    @Override
    public String toString() {
        return loanNo + " " + loanAmount + " " + loanInterest + " " + loanTerm + " " + lastName;
    }

    /**
     * Getter for interest
     *
     * @return returns the interest
     */
    public double getLoanInterest() {
        return loanInterest;
    }

    /**
     * Setter for interest
     *
     * @param a the amount you want the interest set to (1.0 is 0%)
     */
    public void setInterest(double a) {
        loanInterest = a;
    }
}
