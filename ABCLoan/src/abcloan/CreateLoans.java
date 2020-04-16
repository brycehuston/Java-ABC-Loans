/**
 * The Main class
 */

package abcloan;

import java.util.*;
import abcloan.myloan.BusinessLoan;
import abcloan.myloan.PersonalLoan;
import abcloan.myloan.Loan;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author 30003673
 */
/**
 * Class that creates loans
 */
public class CreateLoans {

    private static ArrayList loanArrayList = new ArrayList();

    /**
     * The main method
     *
     * @param args arguments as a array of String objects
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the current prime interest rate: ");

        double interestRate = sc.nextDouble();

        int ID;
        int amount;
        int term = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Please enter the ID of the loan (" + i + ")");
            try {
                ID = sc.nextInt();
            } //Catchs exceptions for if they entered somehting other than an int
            catch (Exception ex) {
                System.out.println("Error. Please enter a number");
                continue;
            }

            System.out.println("Please enter the amount of the loan (" + i + ")");
            try {
                amount = sc.nextInt();
            } //Catches exceptions for if they entered something other than an int
            catch (Exception ex) {
                System.out.println("Error. Please enter a number");
                continue;
            }

            System.out.println("Please enter the term of the loan (" + i + ")");
            try {
                amount = sc.nextInt();
            } //Catches exceptions for if they entered something other than an int
            catch (Exception ex) {
                System.out.println("Error. Please enter a number");
                continue;
            }

            System.out.println("Please enter the last name of the person taking the loan (" + i + ")");
            String last = sc.nextLine();
            sc.nextLine();

            BusinessLoan biz = new BusinessLoan();
            biz.CreateLoan(ID, amount, term, last);

            loanArrayList.add(biz);
            System.out.println("Loan " + i + " complete!");
            System.out.println();
        }

        System.out.println("Writing file...");

        try {
            FileOutputStream fileOut = new FileOutputStream("ABCLoan.bin"); // binary file "ABCLoan.bin"
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); // output stream

            objectOut.writeObject(loanArrayList.toString()); // save the object in the binary file
            fileOut.close(); // close the file
            System.out.println("Completed: ABCLoan.bin"); // user feedback
        } catch (IOException ex) { // catch if IO exception happens
            System.out.println("Error: " + ex);
        }
    }

}
