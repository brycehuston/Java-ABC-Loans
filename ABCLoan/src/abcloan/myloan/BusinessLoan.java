
package abcloan.myloan;

/**
 *
 * @author 30003673
 */
/**
 * The class used to create Business Loans
 */
public class BusinessLoan extends Loan {

    /**
     * This method is used to create loans that are made for businesses
     *
     * @param id the id of the loan
     * @param amount the amount fo the loan
     * @param term the term of the loan
     * @param last the last name of the person taking out the loan
     */
    @Override
    public void CreateLoan(int id, int amount, int term, String last) {
        if (amount > LoanConstants.maxTermAmount) {
            System.out.println("Loan cannot exceed " + LoanConstants.maxTermAmount);
            return;
        }
        if (term != 1 || term != 3 || term != 5) {
            System.out.println("Loan term set to short automatically");
            loanTerm = 1;
        } else {
            loanTerm = term;
        }
        loanNo = id;
        loanAmount = amount;
        loanTerm = term;
        lastName = last;
        switch (term) {
            case 1: {
                loanInterest = LoanConstants.shortTermAmount + 0.01;
                break;
            }
            case 3: {
                loanInterest = LoanConstants.medTermAmount + 0.01;
                break;
            }
            case 5: {
                loanInterest = LoanConstants.longTermAmount + 0.01;
                break;
            }
        }
    }
}
